import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by kuba on 26.04.15.
 */


enum VarType {
    INT, REAL, UNKNOWN, VOID
}

enum VarScope {GLOBAL, LOCAL, NOTEXISTS}

//enum Sign{EQUAL, LESS, MORE}

class Value {
    public String name;
    public VarType type;
    public boolean isGlobal;

    public Value(String name, VarType type, boolean isGlobal) {
        this.name = name;
        this.type = type;
        this.isGlobal = isGlobal;
    }
}


public class LLVMactions extends ProstyJezykBaseListener {

    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    HashMap<String, VarType> global_variables = new HashMap<String, VarType>();
    HashMap<String, VarType> fun_variables = new HashMap<String, VarType>();
    LinkedList<String> funList = new LinkedList<String>();


    String function;
    Stack<Value> stack = new Stack<Value>();
    boolean main = true;

    @Override
    public void exitRun_fun(@NotNull ProstyJezykParser.Run_funContext ctx) {
        String funName = ctx.ID_NAME().getText();
        if (funList.contains(funName)) {
            LLVMGenerator.callFun(funName, main);
        } else {
            //System.out.println("BLad lol");
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

        if (ctx.compare_first().ID_NAME() != null && ctx.compare_second().INT() != null) {
            String id = ctx.compare_first().ID_NAME().getText();
            VarType varType = variables.get(id);
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
            LLVMGenerator.declareWhileCondInt(id, value, sign);
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
            LLVMGenerator.declareWhileCondDouble(id, value, sign);
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
            LLVMGenerator.declareWhileCondInt(id, value, sign);
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
            LLVMGenerator.declareWhileCondDouble(id, value, sign);
        }


    }

    @Override
    public void exitWhile_body(@NotNull ProstyJezykParser.While_bodyContext ctx) {
        LLVMGenerator.declateWhileEnd();
    }


    @Override
    public void enterIf_body(@NotNull ProstyJezykParser.If_bodyContext ctx) {
        LLVMGenerator.ifstart();
    }


    @Override
    public void exitIf_body(@NotNull ProstyJezykParser.If_bodyContext ctx) {
        LLVMGenerator.ifend();
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
            VarType varExistsCheck = variables.get(ID);
            if (varExistsCheck != null) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpIntEquall(ID, INT);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpIntMore(ID, INT);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpIntLess(ID, INT);
                }
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }
        }

        // INT  zmienna <znak> liczba
        if ((ctx.value(0).ID_NAME() != null) && (ctx.value(1).INT() != null)) {
            /*
            System.out.println(ctx.value(0).ID_NAME());
            System.out.println(ctx.value(1).INT() );

            System.out.println(ctx.value(1).ID_NAME());
            System.out.println(ctx.value(0).INT() );


            System.out.println("Kolejność ok");
            */

            String ID = ctx.value(0).ID_NAME().getText();
            String INT = ctx.value(1).INT().getText();
            VarType varExistsCheck = variables.get(ID);
            if (varExistsCheck != null) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpIntEquall(ID, INT);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpIntMore(ID, INT);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpIntLess(ID, INT);
                }
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }
        }

        // REAL  zmienna <znak> liczba
        if ((ctx.value(0).ID_NAME() != null) && (ctx.value(1).REAL() != null)) {
            /*
            System.out.println(ctx.value(0).ID_NAME());
            System.out.println(ctx.value(1).INT() );

            System.out.println(ctx.value(1).ID_NAME());
            System.out.println(ctx.value(0).INT() );


            System.out.println("Kolejność ok");
            */

            String ID = ctx.value(0).ID_NAME().getText();
            String REAL = ctx.value(1).REAL().getText();
            VarType varExistsCheck = variables.get(ID);
            if (varExistsCheck != null) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpRealEquall(ID, REAL);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpRealMore(ID, REAL);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpRealLess(ID, REAL);
                }
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }
        }

        // REAL    liczba <znak> zmienna
        if ((ctx.value(1).ID_NAME() != null) && (ctx.value(0).REAL() != null)) {
            /*
            System.out.println(ctx.value(0).ID_NAME());
            System.out.println(ctx.value(1).INT() );

            System.out.println(ctx.value(1).ID_NAME());
            System.out.println(ctx.value(0).INT() );


            System.out.println("Kolejność ok");
            */

            String ID = ctx.value(1).ID_NAME().getText();
            String REAL = ctx.value(0).REAL().getText();
            VarType varExistsCheck = variables.get(ID);
            if (varExistsCheck != null) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpRealEquall(ID, REAL);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpRealMore(ID, REAL);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpRealLess(ID, REAL);
                }
            } else {
                System.err.println("Line " + ctx.getStart().getLine() + ", unknown variable: " + ID);
            }
        }

        if ((ctx.value(0).ID_NAME() != null) && (ctx.value(1).ID_NAME() != null)) {
            VarType var_1 = variables.get(ctx.value(0).ID_NAME().getText());
            VarType var_2 = variables.get(ctx.value(1).ID_NAME().getText());

            if (var_1 == null || var_2 == null) {
                System.err.println("Line " + ctx.getStart().getLine() + ", podana zmienna nie istnieje: " + var_1 + var_2);
            }

            if (var_1 != var_2) {
                System.err.println("Line " + ctx.getStart().getLine() + ", porownywane sa liczby z roznymi typami: ");
            }

            String ID_1 = ctx.value(0).ID_NAME().getText();
            String ID_2 = ctx.value(1).ID_NAME().getText();

            if (var_1 == VarType.REAL) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpRealEquallIdId(ID_1, ID_2);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpRealMoreIdId(ID_1, ID_2);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpRealLessIdId(ID_1, ID_2);
                }
            }
            if (var_1 == VarType.INT) {
                if (sign == Sign.EQUAL) {
                    LLVMGenerator.icmpIntEquallIdId(ID_1, ID_2);
                }
                if (sign == Sign.LESS) {
                    LLVMGenerator.icmpIntMoreIdId(ID_1, ID_2);
                }
                if (sign == Sign.MORE) {
                    LLVMGenerator.icmpIntLessIdId(ID_1, ID_2);
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
        return VarScope.NOTEXISTS;
    }

    private VarType checkVarType(String ID) {
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
        // to po to, żeby sprawdzic czy juz takiem zmiennej nie mamy
        // inaczej bysmy probowali drugi raz zadeklarowac zmienna o tej samej nazwie
        VarType varExistsCheck = variables.get(ID);
        if (varExistsCheck == null) {
            // jak nie ma to ja deklarujemy
            variables.put(ID, v.type);
        }


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

            // System.out.println("Zmienna: " + ID + " z wartoscia: " + v.name + " czy w main: " + main + " czy globalna: " + isGlobal);

            LLVMGenerator.assignInt(ID, v.name, main, isGlobal);
        }
        if (v.type == VarType.REAL) {
            if (varExistsCheck == null) {
                LLVMGenerator.declareDOuble(ID);
            } else {
                if (varExistsCheck != VarType.REAL) {
                    printError(ctx.getStart().getLine(), ID + " : przedtem zmienna byla innego typu.");
                }
            }
            // System.out.println("name: " + v.name);
            LLVMGenerator.assignDouble(ID, v.name);
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
            LLVMGenerator.increaseInt(ID);
        }
        if (varExists == VarType.REAL) {
            LLVMGenerator.increaseDouble(ID);
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
            LLVMGenerator.decreaseInt(ID);
        }
        if (varExists == VarType.REAL) {
            LLVMGenerator.decreaseDouble(ID);
        }
    }


    @Override
    public void exitAdd(ProstyJezykParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.addInt(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT, main));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.addDouble(v1.name, v2.name);
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
                LLVMGenerator.substractInt(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT, main));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.substractDouble(v1.name, v2.name);
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
                LLVMGenerator.multInt(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT, main));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.multDouble(v1.name, v2.name);
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
                LLVMGenerator.divInt(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL, main));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.divDouble(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL, main));
            }
        } else {
            printError(ctx.getStart().getLine(), "zle typy w mnozeniu");
        }
    }


    @Override
    public void exitToint(ProstyJezykParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.doubleToInt(v.name);
        stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.INT, main));

    }

    @Override
    public void exitToreal(ProstyJezykParser.TorealContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.intToDouble(v.name);
        stack.push(new Value("%" + (LLVMGenerator.register - 1), VarType.REAL, main));
    }

    @Override
    public void exitPrintID(ProstyJezykParser.PrintIDContext ctx) {
        String ID = ctx.ID_NAME().getText();
        VarScope varScope = checkVarScope(ID);

        if (varScope == VarScope.NOTEXISTS) {
            printError(ctx.getStart().getLine(), "zmienna ta nie jest zadeklarowana");
        }

        VarType varType = checkVarType(ID);

        if (varScope == VarScope.LOCAL) {
            if (varType == VarType.INT) {
                LLVMGenerator.printfInt(ID, main, false);
            }
            if (varType == VarType.REAL) {
                LLVMGenerator.printfDouble(ID);
            }
        }
        if (varScope == VarScope.GLOBAL) {
            if (varType == VarType.INT) {
                LLVMGenerator.printfInt(ID, main, true);
            }
            if (varType == VarType.REAL) {
                LLVMGenerator.printfDouble(ID);
            }
        }
    }

    @Override
    public void exitRead(@NotNull ProstyJezykParser.ReadContext ctx) {
        String ID = ctx.ID_NAME().getText();

        if (ctx.var_type().t_INT() != null) {
            if (variables.get(ID) == null) {
                variables.put(ID, VarType.INT);
                LLVMGenerator.declareInt(ID);
            } else {
                VarType v = variables.get(ID);
                if (v == VarType.REAL) {
                    printError(ctx.getStart().getLine(), "variable has a different type ");
                }
            }
            //LLVMGenerator.assignInt(ID, v.name);
            LLVMGenerator.scanfInt(ID);
        }

        if (ctx.var_type().t_REAL() != null) {
            if (variables.get(ID) == null) {
                variables.put(ID, VarType.REAL);
                LLVMGenerator.declareDOuble(ID);
            } else {
                VarType v = variables.get(ID);
                if (v == VarType.INT) {
                    printError(ctx.getStart().getLine(), "variable has a different type ");
                }
            }
            //LLVMGenerator.assignInt(ID, v.name);
            LLVMGenerator.scanfDouble(ID);
        }


    }


    void printError(int line, String msg) {
        System.err.println("Blad w linii " + line + ", " + msg);
        System.exit(1);
    }

}
/*
public class LLVMactions extends ProstyJezykBaseListener{
    HashMap<String, Integer> int_memory = new HashMap<String, Integer>();
    HashMap<String, Double> real_memory = new HashMap<String, Double>();
    HashMap<String, String> string_memory = new HashMap<String, String>();
    Stack oldStack = new Stack();
    Stack<String> stringStack = new Stack<String>();
    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    Stack<Value> stack = new Stack<Value>();

    Integer value;

    @Override public void enterProg(@NotNull ProstyJezykParser.ProgContext ctx) {
        LLVMGenerator.enterProg();
    }

    @Override public void exitProg(@NotNull ProstyJezykParser.ProgContext ctx) {
        LLVMGenerator.exitProg();
    }

    /*
    @Override public void exitPrint_action(@NotNull ProstyJezykParser.Print_actionContext ctx) {
        //System.out.println(value);

        // LLVMGenerator.printInteger(value);
        if(ctx.value().INT() != null){
            Integer tmp = Integer.valueOf( ctx.value().INT().getText() );
            //LLVMGenerator.printInteger(tmp);
        }
        if(ctx.value().REAL() != null){
            //not yet implemented
        }
        if(ctx.value().REAL() != null){
            //not yet implemented
        }

        if(ctx.value().NAME() != null){
            if( int_memory.get(ctx.value().NAME().getText()) != null ){
                //LLVMGenerator.printInteger(int_memory.get(ctx.value().NAME().getText()));
            }
            if( real_memory.get(ctx.value().NAME().getText()) != null ){
                //not yet implemented
            }
            if( string_memory.get(ctx.value().NAME().getText()) != null ){
                // not yet implemented
            }

        }

    }
    */

// jak przypiszemy wartosc do zmiennej to zapisujemy
// ja do tablicy pod okreslona nazwa
       /*
    @Override public void exitEnter_assign(@NotNull ProstyJezykParser.Enter_assignContext ctx) {
        String name = ctx.NAME().getText();
        Value v = stack.pop();
        variables.put(name, v.type);
        if( v.type == VarType.INT ){
            //LLVMGenerator.declareInt(name);
            //LLVMGenerator.assignInt(name, v.name);
        }
        if( v.type == VarType.REAL ){
            //LLVMGenerator.declareDOuble(name);
            //LLVMGenerator.assign_double(name, v.name);
        }


        if(ctx.var_type().getText().equalsIgnoreCase("int")){
            Integer tmp = Integer.valueOf( ctx.value().INT().getText() );
            int_memory.put(ctx.NAME().getText(), tmp);
        }
        if(ctx.var_type().getText().equalsIgnoreCase("real")){
            double tmp = Double.valueOf( ctx.value().REAL().getText() );
            real_memory.put(ctx.NAME().getText(), tmp);
        }
        if(ctx.var_type().getText().equalsIgnoreCase("string")){
            String tmp =  ctx.value().STRING().getText();
            string_memory.put(ctx.NAME().getText(), tmp);
        }
        if(ctx.var_type().getText().equalsIgnoreCase("array")){
            //not yet implemented
        }


    }
    */
// wiemy co drukowac dzieki funkcji exitValue
// ktora zawsze przed wypisaniem sprawdza co jest do wypisania
// - czy zmienna czy liczba -
// a nastepnie umieszcza to w atrybucie value
// stad kazde wywolanie exitPrint_action jest poprzedzone
// wywolaniem exitValue


// VALUE moze byc INT albo VARIABLE
// jak INT to mamy do wyswietlenia liczbe - np. 32
// a jak VARIABLE to zmienna - np. "a"
/*
    @Override public void exitValue(@NotNull ProstyJezykParser.ValueContext ctx) {
        System.out.println("exitValue");

        while( ! oldStack.isEmpty() ){
            System.out.println(oldStack.pop().toString());
        }

    }
    /*
    @Override public void exitAdditionExp(@NotNull ProstyJezykParser.AdditionExpContext ctx) {
        System.out.println("exitMultiplyExp");
        boolean isAdd = false;
        boolean isAddSubs = false;

        if( ctx.PLUS_MINUS() != null ){
            isAddSubs = true;
            if( ctx.PLUS_MINUS().getSymbol().getText().equals("+") ){
                isAdd = true;
            }else{
                isAdd = false;
            }
        }

        if( isAddSubs ){
            double tmp_2 =  Double.valueOf(oldStack.pop().toString());
            double tmp_1 =  Double.valueOf( oldStack.pop().toString() );
            double result;
            if(isAdd){
                result = tmp_1 + tmp_2;
                oldStack.push(result);
            }else{
                result = tmp_1 - tmp_2;
                oldStack.push(result);
            }
        }

    }

    @Override public void exitMultiplyExp(@NotNull ProstyJezykParser.MultiplyExpContext ctx) {
        System.out.println("exitMultiplyExp");
        boolean isDivide = false;
        boolean isDIvMul = false;
        if( ctx.MUL_DIV() != null ){
            isDIvMul = true;
            if( ctx.MUL_DIV().getSymbol().getText().equals("*") ){
                isDivide = false;
            }else{
                isDivide = true;
            }
        }

        if( isDIvMul ){
            double tmp_2 =  Double.valueOf(oldStack.pop().toString());
            double tmp_1 =  Double.valueOf( oldStack.pop().toString() );
            double result;
            if(isDivide){
                result = tmp_1 / tmp_2;
                oldStack.push(result);
            }else{
                result = tmp_1 * tmp_2;
                oldStack.push(result);
            }
        }

    }

    @Override public void exitAtomExp(@NotNull ProstyJezykParser.AtomExpContext ctx) {
        if(ctx.additionExp() != null){
            // raczej nie rób nic
            // wszystko zrobi additionExp, które będzie
            // a tutaj to nic sie nie stanie :)
        }
        if(ctx.INT() != null){
            Integer tmp = Integer.valueOf(ctx.INT().getText());
            oldStack.push(tmp);
        }
        if(ctx.REAL() != null){
            double tmp = Double.valueOf( ctx.REAL().getText() );
            oldStack.push(tmp);
        }
        if(ctx.NAME() != null){
            String tmp = ctx.NAME().getText();
            oldStack.push(tmp);
        }

        System.out.println("exitAtomExp");
    }

*/


//}
