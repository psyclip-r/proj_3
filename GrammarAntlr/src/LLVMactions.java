import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

/**
 * Created by kuba on 26.04.15.
 */


enum VarType {
    INT, REAL, UNKNOWN, VOID
}

enum VarScope {GLOBAL, LOCAL, NOTEXISTS, BLOCK}


class Value {
    public String name;
    public String value;
    public VarType type;
    public boolean isGlobal;
    public String declaredName;

    public Value(String value, VarType type, boolean isGlobal) {
        this.value = value;
        this.type = type;
        this.isGlobal = isGlobal;
    }

}

public class LLVMactions extends ProstyJezykBaseListener {

    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    HashMap<String, VarType> global_variables = new HashMap<String, VarType>();
    HashMap<String, VarType> fun_variables = new HashMap<String, VarType>();
    LinkedList<String> funList = new LinkedList<String>();

    Stack<Value> blockValues = new Stack<Value>();
    Stack<Integer> valCounter = new Stack<Integer>();
    Stack<String> blockStack = new Stack<String>();
    boolean block = false;

    Stack<Value> stack = new Stack<Value>();
    boolean main = true;


    @Override
    public void exitRun_fun(@NotNull ProstyJezykParser.Run_funContext ctx) {
        String funName = ctx.ID_NAME().getText();
        if (funList.contains(funName)) {
            LLVMGenerator.callFun(funName, main);
        } else {
            printError(ctx.getStart().getLine(), "nie ma funkcji o takiej nazwie: " + funName);
        }

    }


    @Override
    public void enterFunction(@NotNull ProstyJezykParser.FunctionContext ctx) {
        VarType type = null;
        if (ctx.var_type().t_INT() != null) {
            type = VarType.INT;
        }
        if (ctx.var_type().t_REAL() != null) {
            type = VarType.REAL;
        }
        if (ctx.var_type().t_VOID() != null) {
            type = VarType.VOID;
        }
        String f_name = ctx.fname().ID_NAME().getText();
        funList.add(f_name);
        LLVMGenerator.defineFun(f_name, type);
    }


    @Override
    public void enterFunct_body(@NotNull ProstyJezykParser.Funct_bodyContext ctx) {
        main = false;
    }

    @Override
    public void exitFunct_body(@NotNull ProstyJezykParser.Funct_bodyContext ctx) {
        main = true;
        fun_variables = new HashMap<String, VarType>();
        LLVMGenerator.closeFun();
    }


    @Override
    public void exitWhile_cond(@NotNull ProstyJezykParser.While_condContext ctx) {
        block = true;
        blockStack.push("while");
        valCounter.push(0);

        if (ctx.compare_first().ID_NAME() != null && ctx.compare_second().INT() != null) {
            String id = ctx.compare_first().ID_NAME().getText();
            //VarType varType = variables.get(id);
            VarType varType = checkVarType(id);
            if (varType != VarType.INT) {
                printError(ctx.getStart().getLine(), "porownywanie roznych typow");
            }
            String value = ctx.compare_second().INT().getText();
            Sign sign = Sign.MORE;
            if (ctx.compare_sign().EQUAL_S() != null) {
                sign = Sign.EQUAL;
            }
            if (ctx.compare_sign().MORE() != null) {
                sign = Sign.MORE;
            }
            if (ctx.compare_sign().LESS() != null) {
                sign = Sign.LESS;
            }
            LLVMGenerator.declareWhileCondInt(id, value, sign, main, checkVarScope(id));
        }

        if (ctx.compare_first().ID_NAME() != null && ctx.compare_second().REAL() != null) {
            String id = ctx.compare_first().ID_NAME().getText();
            VarType varType = variables.get(id);
            if (varType != VarType.REAL) {
                printError(ctx.getStart().getLine(), "porownywanie roznych typow");
            }
            String value = ctx.compare_second().REAL().getText();
            Sign sign = Sign.MORE;
            if (ctx.compare_sign().EQUAL_S() != null) {
                sign = Sign.EQUAL;
            }
            if (ctx.compare_sign().MORE() != null) {
                sign = Sign.MORE;
            }
            if (ctx.compare_sign().LESS() != null) {
                sign = Sign.LESS;
            }
            LLVMGenerator.declareWhileCondDouble(id, value, sign, main, checkVarScope(id));
        }


        if (ctx.compare_second().ID_NAME() != null && ctx.compare_first().INT() != null) {
            String id = ctx.compare_second().ID_NAME().getText();
            VarType varType = variables.get(id);
            if (varType != VarType.INT) {
                printError(ctx.getStart().getLine(), "porownywanie roznych typow");
            }
            String value = ctx.compare_first().INT().getText();
            Sign sign = Sign.MORE;
            if (ctx.compare_sign().EQUAL_S() != null) {
                sign = Sign.EQUAL;
            }
            if (ctx.compare_sign().MORE() != null) {
                sign = Sign.LESS;
            }
            if (ctx.compare_sign().LESS() != null) {
                sign = Sign.MORE;
            }
            LLVMGenerator.declareWhileCondInt(id, value, sign, main,checkVarScope(id));
        }

        if (ctx.compare_second().ID_NAME() != null && ctx.compare_first().REAL() != null) {
            String id = ctx.compare_second().ID_NAME().getText();
            VarType varType = variables.get(id);
            if (varType != VarType.REAL) {
                printError(ctx.getStart().getLine(), "porownywanie roznych typow");
            }
            String value = ctx.compare_first().REAL().getText();
            Sign sign = Sign.MORE;
            if (ctx.compare_sign().EQUAL_S() != null) {
                sign = Sign.EQUAL;
            }
            if (ctx.compare_sign().MORE() != null) {
                sign = Sign.LESS;
            }
            if (ctx.compare_sign().LESS() != null) {
                sign = Sign.MORE;
            }
            LLVMGenerator.declareWhileCondDouble(id, value, sign, main, checkVarScope(id));
        }


    }

    @Override
    public void exitWhile_body(@NotNull ProstyJezykParser.While_bodyContext ctx) {
        LLVMGenerator.declateWhileEnd(main);
        Integer numOfVars = valCounter.pop();
        for(int i = 0; i < numOfVars; i++){
            blockValues.pop();
        }
        blockStack.pop();
        if(blockStack.isEmpty()){
            block = false;
        }
    }


    @Override
    public void enterIf_body(@NotNull ProstyJezykParser.If_bodyContext ctx) {
        block = true;
        blockStack.push("if");
        valCounter.push(0);
        LLVMGenerator.ifstart(main);
    }


    @Override
    public void exitIf_body(@NotNull ProstyJezykParser.If_bodyContext ctx) {
        LLVMGenerator.ifend(main);
        Integer numOfVars = valCounter.pop();
        for(int i = 0; i < numOfVars; i++){
            blockValues.pop();
        }
        blockStack.pop();
        if(blockStack.isEmpty()){
            block = false;
        }
    }

    @Override
    public void exitIf_condition(@NotNull ProstyJezykParser.If_conditionContext ctx) {
        if (ctx.value(0) == null || ctx.value(1) == null) {
            printError(ctx.getStart().getLine(), "brak dwóch warunków w pętli");
        }

        Sign sign = Sign.MORE;
        if (ctx.compare_sign().EQUAL_S() != null) {
            sign = Sign.EQUAL;
        }
        if (ctx.compare_sign().MORE() != null) {
            sign = Sign.MORE;
        }
        if (ctx.compare_sign().LESS() != null) {
            sign = Sign.LESS;
        }

        // INT liczba <znak> zmienna
        if (ctx.value(0).INT() != null && ctx.value(1).ID_NAME() != null) {
            // System.out.println("Zmieniona kolejność");
            String ID = ctx.value(1).ID_NAME().getText();
            String INT = ctx.value(0).INT().getText();
            VarScope scope = checkVarScope(ID);
            if (scope != VarScope.NOTEXISTS) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpIntEquall(ID, INT, scope, main);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpIntMore(ID, INT, scope, main);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpIntLess(ID, INT, scope, main);
                }
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }
        }

        // INT  zmienna <znak> liczba
        if ((ctx.value(0).ID_NAME() != null) && (ctx.value(1).INT() != null)) {

            String ID = ctx.value(0).ID_NAME().getText();
            String INT = ctx.value(1).INT().getText();
            VarScope scope = checkVarScope(ID);
            if (scope != VarScope.NOTEXISTS) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpIntEquall(ID, INT, scope, main);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpIntMore(ID, INT, scope, main);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpIntLess(ID, INT, scope, main);
                }
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }
        }

        // REAL  zmienna <znak> liczba
        if ((ctx.value(0).ID_NAME() != null) && (ctx.value(1).REAL() != null)) {


            String ID = ctx.value(0).ID_NAME().getText();
            String REAL = ctx.value(1).REAL().getText();
            VarScope scope = checkVarScope(ID);
            if (scope != VarScope.NOTEXISTS) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpRealEquall(ID, REAL, scope, main);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpRealMore(ID, REAL, scope, main);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpRealLess(ID, REAL, scope, main);
                }
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }
        }

        // REAL    liczba <znak> zmienna
        if ((ctx.value(1).ID_NAME() != null) && (ctx.value(0).REAL() != null)) {
            String ID = ctx.value(1).ID_NAME().getText();
            String REAL = ctx.value(0).REAL().getText();
            VarScope scope = checkVarScope(ID);
            if (scope != VarScope.NOTEXISTS) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpRealEquall(ID, REAL, scope, main);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpRealMore(ID, REAL, scope, main);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpRealLess(ID, REAL, scope, main);
                }
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }
        }

        // ZMIENNA dowolny znak ZMIENNA
        if ((ctx.value(0).ID_NAME() != null) && (ctx.value(1).ID_NAME() != null)) {

            String ID_1 = ctx.value(0).ID_NAME().getText();
            String ID_2 = ctx.value(1).ID_NAME().getText();

            VarType var_1 = checkVarType(ID_1);
            VarType var_2 = checkVarType(ID_2);

            if (var_1 == null || var_2 == null) {
                System.err.println("Line " + ctx.getStart().getLine() + ", podana zmienna nie istnieje: " + var_1 + var_2);
            }

            if (var_1 != var_2) {
                System.err.println("Line " + ctx.getStart().getLine() + ", porownywane sa liczby z roznymi typami: ");
            }


            VarScope scope_1 = checkVarScope(ID_1);
            VarScope scope_2 = checkVarScope(ID_2);

            if (var_1 == VarType.REAL) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpRealEquallIdId(ID_1, ID_2, scope_1, scope_2, main);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpRealMoreIdId(ID_1, ID_2, scope_1, scope_2, main);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpRealLessIdId(ID_1, ID_2, scope_1, scope_2, main);
                }
            }
            if (var_1 == VarType.INT) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpIntEquallIdId(ID_1, ID_2, scope_1, scope_2, main);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpIntMoreIdId(ID_1, ID_2, scope_1, scope_2, main);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpIntLessIdId(ID_1, ID_2, scope_1, scope_2, main);
                }
            }

        }


    }

    private VarScope checkVarScope(String ID) {
        VarType isGLobal = global_variables.get(ID);
        if (isGLobal != null) {
            return VarScope.GLOBAL;
        }

        VarType isLocal = fun_variables.get(ID);
        if (isLocal != null) {
            return VarScope.LOCAL;
        }

        Object [] vals =  blockValues.toArray();
        for(int i = 0; i < vals.length; i++){
            Value v = (Value) vals[i];
            if(ID.equals(v.name)){
                return VarScope.BLOCK;
            }
        }

        return VarScope.NOTEXISTS;
    }

    private Value getValueFromBlock(String ID){
        Object [] vals =  blockValues.toArray();
        for(int i = 0; i < vals.length; i++){
            Value v = (Value) vals[i];
            if(ID.equals(v.name)){
                return v;
            }
        }
        return null;
    }

    private VarType checkVarType(String ID) {

        Object [] vals =  blockValues.toArray();

        for(int i = 0; i < vals.length; i++){
            Value v = (Value) vals[i];
            if(ID.equals(v.name)){
                return v.type;
            }
        }

        VarType isGlobal = global_variables.get(ID);
        if (isGlobal != null) {
            return isGlobal;
        }

        VarType isLocal = fun_variables.get(ID);
        if (isLocal != null) {
            return isLocal;
        }

        return VarType.UNKNOWN;
    }

    @Override
    public void exitAssignValue(ProstyJezykParser.AssignValueContext ctx) {
        String ID = ctx.ID_NAME().getText();
        Value v = stack.pop();
        if(block){
            if (v.type == VarType.INT) {
                if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                    Integer counter = valCounter.pop();
                    counter++;
                    valCounter.push(counter);
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(1000000);
                    v.name = ID;
                    v.declaredName = v.name + randomInt;
                    LLVMGenerator.declareInt(v.declaredName, main, false);
                    blockValues.push(v);
                } else {
                    if (checkVarType(ID) != VarType.INT) {
                        printError(ctx.getStart().getLine(), ID + " : przedtem zmienna byla innego typu.");
                    }
                    if(checkVarScope(ID) == VarScope.BLOCK){
                        Value tmp = getValueFromBlock(ID);
                        v.declaredName = tmp.declaredName;
                    }else{
                        v.declaredName = ID;
                    }
                }
                // System.out.println("Zmienna: " + ID + " z wartoscia: " + v.value + " czy w main: " + main + " czy globalna: " + isGlobal);
                LLVMGenerator.assignInt(v.declaredName, v.value, main, false);
            }
            if(v.type == VarType.REAL){
                if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                    Integer counter = valCounter.pop();
                    counter++;
                    valCounter.push(counter);
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(1000000);
                    v.name = ID;
                    v.declaredName = v.name + randomInt;
                    LLVMGenerator.declareDouble(v.declaredName, main, false);
                    blockValues.push(v);
                } else {
                    if (checkVarType(ID) != VarType.REAL) {
                        printError(ctx.getStart().getLine(), ID + " : przedtem zmienna byla innego typu.");
                    }
                    if(checkVarScope(ID) == VarScope.BLOCK){
                        Value tmp = getValueFromBlock(ID);
                        v.declaredName = tmp.declaredName;
                    }else{
                        v.declaredName = ID;
                    }
                }
                //System.out.println("Zmienna: " + ID + " declaredname: " + v.declaredName + " name: " + v.name + " typ: " + v.type + " value: " + v.value);
                LLVMGenerator.assignDouble(v.declaredName, v.value, main, false);
            }
        }else {
            if (v.type == VarType.INT) {
                // zabezpieczenie, zeby mozna bylo przypisac do "y" pare wartosci wkilku liniach
                // System.out.println("Zmienna: " + ID + " jest: " + checkVarScope(ID));
                if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                    // deklaruje albo lokalnie, albo globalnie -> zaleznie od tego jaka to zmienna
                    // System.out.println("Deklaruje zmienna: " + ID + " czy globalna: " + main + " czy istnieje: " +checkVarScope(ID));
                    LLVMGenerator.declareInt(ID, main);
                } else {
                    if (checkVarType(ID) != VarType.INT) {
                        printError(ctx.getStart().getLine(), ID + " : przedtem zmienna byla innego typu.");
                    }
                }
                if (v.isGlobal) {
                    global_variables.put(ID, VarType.INT);
                } else {
                    fun_variables.put(ID, VarType.INT);
                }
                boolean isGlobal;
                if (checkVarScope(ID) == VarScope.GLOBAL) {
                    isGlobal = true;
                } else {
                    isGlobal = false;
                }

                // System.out.println("Zmienna: " + ID + " z wartoscia: " + v.value + " czy w main: " + main + " czy globalna: " + isGlobal);

                LLVMGenerator.assignInt(ID, v.value, main, isGlobal);
            }
            if(v.type == VarType.REAL){
                // zabezpieczenie, zeby mozna bylo przypisac do "y" pare wartosci wkilku liniach
                // System.out.println("Zmienna: " + ID + " jest: " + checkVarScope(ID));
                if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                    // deklaruje albo lokalnie, albo globalnie -> zaleznie od tego jaka to zmienna
                    // System.out.println("Deklaruje zmienna: " + ID + " czy globalna: " + main + " czy istnieje: " +checkVarScope(ID));
                    LLVMGenerator.declareDouble(ID, main);
                } else {
                    if (checkVarType(ID) != VarType.REAL) {
                        printError(ctx.getStart().getLine(), ID + " : przedtem zmienna byla innego typu.");
                    }
                }
                if (v.isGlobal) {
                    global_variables.put(ID, VarType.REAL);
                } else {
                    fun_variables.put(ID, VarType.REAL);
                }
                boolean isGlobal;
                if (checkVarScope(ID) == VarScope.GLOBAL) {
                    isGlobal = true;
                } else {
                    isGlobal = false;
                }

                // System.out.println("Zmienna: " + ID + " z wartoscia: " + v.value + " czy w main: " + main + " czy globalna: " + isGlobal);

                LLVMGenerator.assignDouble(ID, v.value, main, isGlobal);

            }
        }
    }

    @Override
    public void exitProg(ProstyJezykParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generateLLVMcode());
    }

    @Override
    public void exitInt(ProstyJezykParser.IntContext ctx) {
        // po prostu na stos wrzucamy liczbe

        stack.push(new Value(ctx.INT().getText(), VarType.INT, main));

    }

    @Override
    public void exitReal(ProstyJezykParser.RealContext ctx) {
        // po prostu na stos wrzucamy liczbe
        stack.push(new Value(ctx.REAL().getText(), VarType.REAL, main));
    }

    @Override
    public void exitIncrease(@NotNull ProstyJezykParser.IncreaseContext ctx) {
        String ID = ctx.ID_NAME().getText();
        VarType varExists = variables.get(ID);
        if (varExists == null) {
            printError(ctx.getStart().getLine(), "nie istnieje zmienna: " + ID);
        }
        if (varExists == VarType.INT) {
            LLVMGenerator.increaseInt(ID, main, checkVarScope(ID));
        }
        if (varExists == VarType.REAL) {
            LLVMGenerator.increaseDouble(ID, main, checkVarScope(ID));
        }
    }

    @Override
    public void exitDecrease(@NotNull ProstyJezykParser.DecreaseContext ctx) {
        String ID = ctx.ID_NAME().getText();
        VarType varExists = variables.get(ID);
        if (varExists == null) {
            printError(ctx.getStart().getLine(), "nie istnieje zmienna: " + ID);
        }
        if (varExists == VarType.INT) {
            LLVMGenerator.decreaseInt(ID, main, checkVarScope(ID));
        }
        if (varExists == VarType.REAL) {
            LLVMGenerator.decreaseDouble(ID, main, checkVarScope(ID));
        }
    }


    @Override
    public void exitAdd(ProstyJezykParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.addInt(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT, main));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.addDouble(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL, main));
            }
        } else {
            printError(ctx.getStart().getLine(), "zle typy w dodawaniu");
        }
    }

    @Override
    public void exitSubstract(@NotNull ProstyJezykParser.SubstractContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.substractInt(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT, main));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.substractDouble(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL, main));
            }
        } else {
            printError(ctx.getStart().getLine(), "zle typy w odejmowaniu");
        }
    }

    @Override
    public void exitMult(ProstyJezykParser.MultContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.multInt(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT, main));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.multDouble(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL, main));
            }
        } else {
            printError(ctx.getStart().getLine(), "zle typy w mnozeniu");
        }
    }

    @Override
    public void exitDiv(@NotNull ProstyJezykParser.DivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.divInt(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL, main));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.divDouble(v1.value, v2.value);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL, main));
            }
        } else {
            printError(ctx.getStart().getLine(), "zle typy w mnozeniu");
        }
    }


    @Override
    public void exitToint(ProstyJezykParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.doubleToInt(v.value);
        stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT, main));

    }

    @Override
    public void exitToreal(ProstyJezykParser.TorealContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.intToDouble(v.value);
        stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL, main));
    }

    @Override
    public void exitPrintID(ProstyJezykParser.PrintIDContext ctx) {
        String ID = ctx.ID_NAME().getText();
        VarScope varScope = checkVarScope(ID);

        if (varScope == VarScope.NOTEXISTS) {
            printError(ctx.getStart().getLine(), "zmienna ta nie jest zadeklarowana: " + ID);
        }

        VarType varType = checkVarType(ID);

        if (varScope == VarScope.LOCAL) {
            if (varType == VarType.INT) {
                LLVMGenerator.printfInt(ID, main, false);
            }
            if (varType == VarType.REAL) {
                LLVMGenerator.printfDouble(ID, main, false);
            }
        }
        if (varScope == VarScope.GLOBAL) {
            if (varType == VarType.INT) {
                LLVMGenerator.printfInt(ID, main, true);
            }
            if (varType == VarType.REAL) {
                LLVMGenerator.printfDouble(ID, main, true);
            }
        }
        if (varScope == VarScope.BLOCK) {
            Value v = getValueFromBlock(ID);
            if (varType == VarType.INT) {
                LLVMGenerator.printfInt(v.declaredName, main, false);
            }
            if (varType == VarType.REAL) {
                LLVMGenerator.printfDouble(v.declaredName, main, false);
            }
        }
    }

    @Override
    public void exitRead(@NotNull ProstyJezykParser.ReadContext ctx) {
        String ID = ctx.ID_NAME().getText();
        VarScope varScope;
        if(block){
            VarType type = null;
            if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                Integer counter = valCounter.pop();
                counter++;
                valCounter.push(counter);
                Random randomGenerator = new Random();
                int randomInt = randomGenerator.nextInt(1000000);
                type = null;
                if (ctx.var_type().t_REAL() != null){
                    type = VarType.REAL;
                }
                if(ctx.var_type().t_INT() != null){
                    type = VarType.INT;
                }
                Value v = new Value(ID, type, false);
                v.isGlobal = false;
                v.name = ID;
                v.declaredName = v.name + randomInt;
                ID = v.declaredName;
                if(type == VarType.INT){
                    LLVMGenerator.declareInt(v.declaredName, main, false);
                }
                if(type == VarType.REAL){
                    LLVMGenerator.declareDouble(v.declaredName, main, false);
                }
                blockValues.push(v);
                varScope = VarScope.BLOCK;
            } else { //to tutaj wchodze, jak jest ZMIENNA ZADEKLAROWANA
                if (ctx.var_type().t_REAL() != null){
                    type = VarType.REAL;
                }
                if(ctx.var_type().t_INT() != null){
                    type = VarType.INT;
                }
                if (checkVarType(ID) != type) {
                    printError(ctx.getStart().getLine(), ctx.ID_NAME().getText() + " : przedtem zmienna byla innego typu.");
                }
                varScope = checkVarScope(ID);
            }
            if(checkVarScope(ID) == VarScope.BLOCK){
                Value v = getValueFromBlock(ID);
                ID = v.declaredName;
                //System.out.println("Name: " + v.name + " declared name: " + v.declaredName);
            }
            // System.out.println("Zmienna: " + ID + " z wartoscia: " + v.value + " czy w main: " + main + " czy globalna: " + isGlobal);
            if (ctx.var_type().t_REAL() != null){
                LLVMGenerator.scanfDouble(ID, varScope, main);
            }
            if(ctx.var_type().t_INT() != null){
                LLVMGenerator.scanfInt(ID, varScope, main);
            }
        }else{
            if (ctx.var_type().t_INT() != null) {
                //if (variables.get(ID) == null) {
                if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                    if (main) {
                        varScope = VarScope.GLOBAL;
                    } else {
                        varScope = VarScope.LOCAL;
                    }
                    variables.put(ID, VarType.INT);
                    if (main) {
                        global_variables.put(ID, VarType.INT);
                    } else {
                        fun_variables.put(ID, VarType.INT);
                    }
                    LLVMGenerator.declareInt(ID, main);
                } else {
                    varScope = checkVarScope(ID);
                    if (checkVarType(ID) != VarType.INT) {
                        printError(ctx.getStart().getLine(), "variable has a different type ");
                    }
                }
                LLVMGenerator.scanfInt(ID, varScope, main);
            }

            if (ctx.var_type().t_REAL() != null) {
                //if (variables.get(ID) == null) {
                if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                    if (main) {
                        varScope = VarScope.GLOBAL;
                    } else {
                        varScope = VarScope.LOCAL;
                    }
                    variables.put(ID, VarType.REAL);
                    if (main) {
                        global_variables.put(ID, VarType.REAL);
                    } else {
                        fun_variables.put(ID, VarType.REAL);
                    }
                    LLVMGenerator.declareDouble(ID, main);
                } else {
                    varScope = checkVarScope(ID);
                    if (checkVarType(ID) != VarType.REAL) {
                        printError(ctx.getStart().getLine(), "variable has a different type ");
                    }
                }
                LLVMGenerator.scanfDouble(ID, varScope, main);
            }
        }
            /*
            if(block){
                if (ctx.var_type().t_INT() != null) {
                    if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                        Integer counter = valCounter.pop();
                        counter++;
                        valCounter.push(counter);
                        Random randomGenerator = new Random();
                        int randomInt = randomGenerator.nextInt(1000000);
                        v.name = ID;
                        v.declaredName = v.name + randomInt;
                        LLVMGenerator.declareInt(v.declaredName, main, false);
                        blockValues.push(v);
                    } else {
                        if (checkVarType(ID) != VarType.INT) {
                            printError(ctx.getStart().getLine(), ID + " : przedtem zmienna byla innego typu.");
                        }
                    }

                    // System.out.println("Zmienna: " + ID + " z wartoscia: " + v.value + " czy w main: " + main + " czy globalna: " + isGlobal);
                    LLVMGenerator.assignInt(v.declaredName, v.value, main, false);
                }
                if(ctx.var_type().t_REAL() != null){
                    if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                        Integer counter = valCounter.pop();
                        counter++;
                        valCounter.push(counter);
                        Random randomGenerator = new Random();
                        int randomInt = randomGenerator.nextInt(1000000);
                        v.name = ID;
                        v.declaredName = v.name + randomInt;
                        LLVMGenerator.declareDouble(v.declaredName, main, false);
                        blockValues.push(v);
                    } else {
                        if (checkVarType(ID) != VarType.REAL) {
                            printError(ctx.getStart().getLine(), ID + " : przedtem zmienna byla innego typu.");
                        }
                    }
                    // System.out.println("Zmienna: " + ID + " z wartoscia: " + v.value + " czy w main: " + main + " czy globalna: " + isGlobal);
                    LLVMGenerator.assignDouble(v.declaredName, v.value, main, false);
                }
            }else {
                if (ctx.var_type().t_INT() != null) {
                    // zabezpieczenie, zeby mozna bylo przypisac do "y" pare wartosci wkilku liniach
                    // System.out.println("Zmienna: " + ID + " jest: " + checkVarScope(ID));
                    if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                        // deklaruje albo lokalnie, albo globalnie -> zaleznie od tego jaka to zmienna
                        // System.out.println("Deklaruje zmienna: " + ID + " czy globalna: " + main + " czy istnieje: " +checkVarScope(ID));
                        LLVMGenerator.declareInt(ID, main);
                    } else {
                        if (checkVarType(ID) != VarType.INT) {
                            printError(ctx.getStart().getLine(), ID + " : przedtem zmienna byla innego typu.");
                        }
                    }
                    if (v.isGlobal) {
                        global_variables.put(ID, VarType.INT);
                    } else {
                        fun_variables.put(ID, VarType.INT);
                    }
                    boolean isGlobal;
                    if (checkVarScope(ID) == VarScope.GLOBAL) {
                        isGlobal = true;
                    } else {
                        isGlobal = false;
                    }

                    // System.out.println("Zmienna: " + ID + " z wartoscia: " + v.value + " czy w main: " + main + " czy globalna: " + isGlobal);

                    LLVMGenerator.assignInt(ID, v.value, main, isGlobal);
                }
                if(ctx.var_type().t_REAL() != null){
                    // zabezpieczenie, zeby mozna bylo przypisac do "y" pare wartosci wkilku liniach
                    // System.out.println("Zmienna: " + ID + " jest: " + checkVarScope(ID));
                    if (checkVarScope(ID) == VarScope.NOTEXISTS) {
                        // deklaruje albo lokalnie, albo globalnie -> zaleznie od tego jaka to zmienna
                        // System.out.println("Deklaruje zmienna: " + ID + " czy globalna: " + main + " czy istnieje: " +checkVarScope(ID));
                        LLVMGenerator.declareDouble(ID, main);
                    } else {
                        if (checkVarType(ID) != VarType.REAL) {
                            printError(ctx.getStart().getLine(), ID + " : przedtem zmienna byla innego typu.");
                        }
                    }
                    if (v.isGlobal) {
                        global_variables.put(ID, VarType.REAL);
                    } else {
                        fun_variables.put(ID, VarType.REAL);
                    }
                    boolean isGlobal;
                    if (checkVarScope(ID) == VarScope.GLOBAL) {
                        isGlobal = true;
                    } else {
                        isGlobal = false;
                    }

                    // System.out.println("Zmienna: " + ID + " z wartoscia: " + v.value + " czy w main: " + main + " czy globalna: " + isGlobal);

                    LLVMGenerator.assignDouble(ID, v.value, main, isGlobal);

                }
            }
        }*/


    }


    void printError(int line, String msg) {
        System.err.println("Blad w linii " + line + ", " + msg);
        System.exit(1);
    }

}
