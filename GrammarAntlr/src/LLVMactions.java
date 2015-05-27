import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by kuba on 26.04.15.
 */


enum VarType{ INT, REAL, UNKNOWN }

enum Sign{EQUAL, LESS, MORE}

class Value{
    public String name;
    public VarType type;
    public Value( String name, VarType type ){
        this.name = name;
        this.type = type;
    }
}



public class LLVMactions extends ProstyJezykBaseListener {

    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    Stack<Value> stack = new Stack<Value>();

    @Override public void enterIf_body(@NotNull ProstyJezykParser.If_bodyContext ctx) {
        LLVMGenerator.ifstart();
    }


    @Override public void exitIf_body(@NotNull ProstyJezykParser.If_bodyContext ctx) {
        LLVMGenerator.ifend();
    }

    @Override public void exitIf_condition(@NotNull ProstyJezykParser.If_conditionContext ctx) {
        if( ctx.value(0) == null || ctx.value(1) == null ){
            printError(ctx.getStart().getLine(), "brak dwóch warunków w pętli");
        }

        Sign sign = Sign.MORE;
        if( ctx.compare_sign().EQUAL_S() != null ){
            sign = Sign.EQUAL;
        }
        if( ctx.compare_sign().MORE() != null ){
            sign = Sign.MORE;
        }
        if( ctx.compare_sign().LESS() != null ){
            sign = Sign.LESS;
        }

        // INT licza <znak> zmienna
        if( ctx.value(0).INT() != null && ctx.value(1).ID_NAME() != null ){
            // System.out.println("Zmieniona kolejność");
            String ID = ctx.value(1).ID_NAME().getText();
            String INT = ctx.value(0).INT().getText();
            VarType varExistsCheck = variables.get(ID);
            if( varExistsCheck != null ) {
                if(sign == Sign.EQUAL){
                    LLVMGenerator.icmpIntEquall(ID, INT);
                }
                if(sign == Sign.LESS){
                    LLVMGenerator.icmpIntMore(ID, INT);
                }
                if(sign == Sign.MORE){
                    LLVMGenerator.icmpIntLess(ID, INT);
                }
            } else {
                System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
            }
        }

        // INT  zmienna <znak> liczba
        if( (ctx.value(0).ID_NAME() != null) && (ctx.value(1).INT() != null) ){
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
            if( varExistsCheck != null ) {
                if(sign == Sign.EQUAL){
                    LLVMGenerator.icmpIntEquall(ID, INT);
                }
                if(sign == Sign.MORE){
                    LLVMGenerator.icmpIntMore(ID, INT);
                }
                if(sign == Sign.LESS){
                    LLVMGenerator.icmpIntLess(ID, INT);
                }
            } else {
                System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
            }
        }

        // REAL  zmienna <znak> liczba
        if( (ctx.value(0).ID_NAME() != null) && (ctx.value(1).REAL() != null) ){
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
            if( varExistsCheck != null ) {
                if(sign == Sign.EQUAL){
                    LLVMGenerator.icmpRealEquall(ID, REAL);
                }
                if(sign == Sign.MORE){
                    //LLVMGenerator.icmpIntMore(ID, REAL);
                }
                if(sign == Sign.LESS){
                    //LLVMGenerator.icmpIntLess(ID, REAL);
                }
            } else {
                System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
            }
        }



    }

    @Override
    public void exitAssignValue(ProstyJezykParser.AssignValueContext ctx) {
        String ID = ctx.ID_NAME().getText();
        Value v = stack.pop();
        // to po to, żeby sprawdzic czy juz takiem zmiennej nie mamy
        VarType varExistsCheck = variables.get(ID);

        if(varExistsCheck == null){
            // jak nie ma to ja deklarujemy
            variables.put(ID, v.type);
        }

        if( v.type == VarType.INT ){
            // zabezpieczenie, zeby mozna bylo przypisac do "y" pare wartosci wkilku liniach
            if( varExistsCheck == null ){
                LLVMGenerator.declareInt(ID);
            }else{
                if(varExistsCheck != VarType.INT){
                    printError(ctx.getStart().getLine(), ID +  " : przedtem zmienna byla innego typu.");
                }
            }
            // System.out.println("name: " + v.name);
            LLVMGenerator.assignInt(ID, v.name);
        }
        if( v.type == VarType.REAL ){
            if( varExistsCheck == null ){
                LLVMGenerator.declareDOuble(ID);
            }else{
                if(varExistsCheck != VarType.REAL){
                    printError(ctx.getStart().getLine(), ID +  " : przedtem zmienna byla innego typu.");
                }
            }

            // System.out.println("name: " + v.name);
            LLVMGenerator.assignDouble(ID, v.name);
        }
    }

    @Override
    public void exitProg(ProstyJezykParser.ProgContext ctx) {
        System.out.println( LLVMGenerator.generateLLVMcode() );
    }

    @Override
    public void exitInt(ProstyJezykParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT));
    }

    @Override
    public void exitReal(ProstyJezykParser.RealContext ctx) {
        stack.push( new Value(ctx.REAL().getText(), VarType.REAL) );
    }

    @Override
    public void exitAdd(ProstyJezykParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.addInt(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register -1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.addDouble(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register -1), VarType.REAL) );
            }
        } else {
            printError(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitMult(ProstyJezykParser.MultContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if( v1.type == v2.type ) {
            if( v1.type == VarType.INT ){
                LLVMGenerator.multInt(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register -1), VarType.INT) );
            }
            if( v1.type == VarType.REAL ){
                LLVMGenerator.multDouble(v1.name, v2.name);
                stack.push( new Value("%"+(LLVMGenerator.register -1), VarType.REAL) );
            }
        } else {
            printError(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitToint(ProstyJezykParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.doubleToInt(v.name);
        stack.push( new Value("%"+(LLVMGenerator.register -1), VarType.INT) );
    }

    @Override
    public void exitToreal(ProstyJezykParser.TorealContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.intToDouble(v.name);
        stack.push( new Value("%"+(LLVMGenerator.register -1), VarType.REAL) );
    }

    @Override
    public void exitPrintID(ProstyJezykParser.PrintIDContext ctx) {
        String ID = ctx.ID_NAME().getText();
        VarType type = variables.get(ID);
        if( type != null ) {
            if( type == VarType.INT ){
                LLVMGenerator.printfInt(ID);
            }
            if( type == VarType.REAL ){
                LLVMGenerator.printfDouble(ID);
            }
        } else {
            printError(ctx.getStart().getLine(), "unknown variable " + ID);
        }
    }

    @Override public void exitRead(@NotNull ProstyJezykParser.ReadContext ctx) {
        String ID = ctx.ID_NAME().getText();

        if (ctx.var_type().t_INT() != null) {
            if( variables.get(ID) == null ){
                variables.put(ID, VarType.INT);
                LLVMGenerator.declareInt(ID);
            }else{
                VarType v = variables.get(ID);
                if(v == VarType.REAL){
                    printError(ctx.getStart().getLine(), "variable has a different type ");
                }
            }
            //LLVMGenerator.assignInt(ID, v.name);
            LLVMGenerator.scanfInt(ID);
        }

        if (ctx.var_type().t_REAL() != null) {
            if( variables.get(ID) == null ){
                variables.put(ID, VarType.REAL);
                LLVMGenerator.declareDOuble(ID);
            }else{
                VarType v = variables.get(ID);
                if(v == VarType.INT){
                    printError(ctx.getStart().getLine(), "variable has a different type ");
                }
            }
            //LLVMGenerator.assignInt(ID, v.name);
            LLVMGenerator.scanfDouble(ID);
        }



    }


    void printError(int line, String msg){
        System.err.println("Blad w linii "+line+", "+msg);
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
