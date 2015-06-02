import java.util.Stack;

/**
 * Created by kuba on 26.04.15.
 */


class LLVMGenerator{

    static String header = "";
    static String content = "";
    static int register = 1;
    static int br = 0;
    static Stack<Integer> brstack = new Stack<Integer>();
    static String fun = "";
    static String allFuns = "";
    static int fun_reg = 1;

    static void callFun(String funName, boolean main){
        if(main){
            content += "  call void @" + funName + "()\n";
        }else{
            fun += "  call void @" + funName + "()\n";
        }
    }

    static void closeFun(){
        fun += "  ret void\n" +
                "}\n";

        // tutaj rzeczy niezwiazane z generowaniem kodu bezposrednio
        fun_reg = 1;
        allFuns += LLVMGenerator.fun;
        fun = "";
    }

    static void defineFun(String funName, VarType type){
        fun += "define void @" + funName + "() #0 {\n";
    }

    static void ifstart(boolean main){
        br++;
        if(main){
            content += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
            content += "true"+br+":\n";
        }else{
            fun += "br i1 %"+(fun_reg-1)+", label %true"+br+", label %false"+br+"\n";
            fun += "true"+br+":\n";
        }
        brstack.push(br);
    }

    static void ifend(boolean main){
        int b = brstack.pop();
        if(main){
            content += "br label %false"+b+"\n";
            content += "false"+b+":\n";
        }else{
            fun += "br label %false"+b+"\n";
            fun += "false"+b+":\n";
        }
        br++;
    }

    static void declareWhileCondInt(String id, String val, Sign sign, boolean main){
        br++;
        String signType = "";
        if(sign == Sign.EQUAL){
            signType = "eq";
        }
        if(sign == Sign.MORE){
            signType = "sgt";
        }
        if(sign == Sign.LESS){
            signType = "slt";
        }

        /*
        content += "br label %cond"+br+"\n";
        content += "cond"+br+":\n";

        content += "%"+register+" = load i32* %"+id+"\n";
        register++;

        content += "%"+register+" = icmp " + signType +  " i32 %"+(register-1)+", " + val + "\n";
        register++;

        content += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
        content += "true"+br+":\n";
        brstack.push(br);
        */

        if(main){
            content += "br label %cond"+br+"\n";
            content += "cond"+br+":\n";

            content += "%"+register+" = load i32* %"+id+"\n";
            register++;

            content += "%"+register+" = icmp " + signType +  " i32 %"+(register-1)+", " + val + "\n";
            register++;

            content += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
            content += "true"+br+":\n";
        }else{
            fun += "br label %cond"+br+"\n";
            fun += "cond"+br+":\n";

            fun += "%"+fun_reg+" = load i32* %"+id+"\n";
            fun_reg++;

            fun += "%"+fun_reg+" = icmp " + signType +  " i32 %"+(fun_reg-1)+", " + val + "\n";
            fun_reg++;

            fun += "br i1 %"+(fun_reg-1)+", label %true"+br+", label %false"+br+"\n";
            fun += "true"+br+":\n";

            /*
            fun += "br i1 %"+(fun_reg-1)+", label %true"+br+", label %false"+br+"\n";
            fun += "true"+br+":\n";
            */
        }

        brstack.push(br);

    }

    static void declareWhileCondDouble(String id, String val, Sign sign){
        String signType = "";
        if(sign == Sign.EQUAL){
            signType = "oeq";
        }
        if(sign == Sign.MORE){
            signType = "ogt";
        }
        if(sign == Sign.LESS){
            signType = "olt";
        }

        content += "br label %cond"+br+"\n";
        content += "cond"+br+":\n";

        content += "%"+register+" = load double* %"+id+"\n";
        register++;

        content += "%"+register+" = fcmp " + signType +  " double %"+(register-1)+", " + val + "\n";
        register++;

        content += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
        content += "true"+br+":\n";
        brstack.push(br);
    }

    static void declateWhileEnd(boolean main){
        int b = brstack.pop();
        if(main){
            content += "br label %cond"+b+"\n";
            content += "false"+b+":\n";
        }else{
            fun += "br label %cond"+b+"\n";
            fun += "false"+b+":\n";
        }
        br++;
    }


    static void printfInt(String id, boolean main, boolean isGlobal){
        //System.out.println(id + " is global? " + isGlobal);
        String varType;
        if(isGlobal){
            varType = "@";
        }else{
            varType = "%";
        }
        if(main){
            content += "%" + register +" = load i32* " + varType +id+"\n";
            register++;
            content += "%"+ register +" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpi, i32 0, i32 0), i32 %" +(register -1)+")\n";
            register++;
        }else{
            fun += "%"+ fun_reg +" = load i32* " + varType +id+"\n";
            fun_reg++;
            fun += "%"+ fun_reg +" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpi, i32 0, i32 0), i32 %" +(fun_reg -1)+")\n";
            fun_reg++;
        }
    }

    static void printfDouble(String id, boolean main, boolean isGlobal){
        //System.out.println(id + " is global? " + isGlobal);
        String varType;
        if(isGlobal){
            varType = "@";
        }else{
            varType = "%";
        }

        if(main){
            content += "%" + register +" = load double* " + varType +id+"\n";
            register++;
            content += "%"+ register +" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpd, i32 0, i32 0), double %" +(register -1)+")\n";
            register++;
        }else{
            fun += "%"+ fun_reg +" = load double* " + varType +id+"\n";
            fun_reg++;
            fun += "%"+ fun_reg +" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpd, i32 0, i32 0), double %" +(fun_reg -1)+")\n";
            fun_reg++;
        }
    }


    static void declareInt(String id, boolean main){
        // System.out.println("declareInt: Deklaruje zmienna: " + id + " czy globalna: " + main);
        if(main){
            header += "@"+id+" = common global i32 0, align 4\n";
        }else{
            fun += "%"+id+" = alloca i32\n";
        }
    }

    static void declareDouble(String id, boolean main){
        // System.out.println("declareInt: Deklaruje zmienna: " + id + " czy globalna: " + main);
        if(main){
            header += "@"+id+" = common global double 0.000000e+00, align 8\n";
        }else{
            fun += "%"+id+" = alloca double\n";
        }
    }

    static void declareInt(String id, boolean main, boolean isGlobal){
        String globalOrLocal;
        if(isGlobal){
            globalOrLocal = "@";
        }else{
            globalOrLocal = "%";
        }
        if(main == true && isGlobal == true){
            header += globalOrLocal+id+" = common global i32 0, align 4\n";
        }else if(main == true && isGlobal == false){
            content += globalOrLocal+id+" = alloca i32\n";
        }else{
            fun += globalOrLocal+id+" = alloca i32\n";
        }
    }

    static void declareDouble(String id, boolean main, boolean isGlobal){
        String globalOrLocal;
        if(isGlobal){
            globalOrLocal = "@";
        }else{
            globalOrLocal = "%";
        }
        if(main == true && isGlobal == true){
            header += globalOrLocal+id+" = common global double 0.000000e+00, align 8\n";
        }else if(main == true && isGlobal == false){
            content += globalOrLocal+id+" = alloca double\n";
        }else{
            fun += globalOrLocal+id+" = alloca double\n";
        }
    }

    static void declareDOuble(String id){
        content += "%"+id+" = alloca double\n";
    }


    static void assignInt(String id, String value, boolean main, boolean isGlobal){
        String globalOrLocal;
        if(isGlobal){
            globalOrLocal = "@";
        }else{
            globalOrLocal = "%";
        }
        if(main){
            // content += "store i32 "+value+", i32* "+globalOrLocal+id+"\n";
            content += "store i32 "+value+", i32* "+ globalOrLocal +id+"\n";
        }else{
            fun += "store i32 "+value+", i32* "+globalOrLocal+id+"\n";
            // fun += "store i32 "+value+", i32* %"+id+"\n";
        }
    }

    static void assignDouble(String id, String value, boolean main, boolean isGlobal){
        String globalOrLocal;
        if(isGlobal){
            globalOrLocal = "@";
        }else{
            globalOrLocal = "%";
        }
        if(main){
            content += "store double "+value+", double* "+ globalOrLocal +id+"\n";
        }else{
            fun += "store double "+value+", double* "+globalOrLocal+id+"\n";
        }
    }

    static void addInt(String val1, String val2){
        content += "%"+ register +" = add i32 "+val1+", "+val2+"\n";
        register++;
    }

    static void increaseInt(String id){
        content += "%" + register + " = load i32* %" + id + ", align 4\n";
        register++;
        content += "%" + register + " = add nsw i32 %" + (register - 1) + ", 1\n" +
                "  store i32 %" + register + ", i32* %" + id + ", align 4\n";
        register++;
    }

    static void increaseDouble(String id){
        content += "%" + register + " = load double* %" + id + ", align 8\n";
        register++;
        content += "%" + register + " = fadd double %" + (register - 1) + ", 1.000000e+00\n" +
                "  store double %" + register + ", double* %" + id + ", align 8\n";
        register++;
    }

    static void decreaseInt(String id){
        content += "%" + register + " = load i32* %" + id + ", align 4\n";
        register++;
        content += "%" + register + " = sub nsw i32 %" + (register - 1) + ", 1\n" +
                "  store i32 %" + register + ", i32* %" + id + ", align 4\n";
        register++;
    }

    static void decreaseDouble(String id){
        content += "%" + register + " = load double* %" + id + ", align 8\n";
        register++;
        content += "%" + register + " = fsub double %" + (register - 1) + ", 1.000000e+00\n" +
                "  store double %" + register + ", double* %" + id + ", align 8\n";
        register++;
    }

    static void addDouble(String val1, String val2){
        content += "%"+ register +" = fadd double "+val1+", "+val2+"\n";
        register++;
    }

    static void substractInt(String val1, String val2){
        content += "%"+ register +" = sub i32 "+val2+", "+val1+"\n";
        register++;
    }

    static void substractDouble(String val1, String val2){
        content += "%"+ register +" = fsub double "+val2+", "+val1+"\n";
        register++;
    }

    static void multInt(String val1, String val2){
        content += "%"+ register +" = mul i32 "+val1+", "+val2+"\n";
        register++;
    }

    static void multDouble(String val1, String val2){
        content += "%"+ register +" = fmul double "+val1+", "+val2+"\n";
        register++;
    }


    static void divInt(String val1, String val2){
        content += "%"+ register +" = fdiv double "+val2+".0, "+val1+".0\n";
        register++;
    }

    static void divDouble(String val1, String val2){
        content += "%"+ register +" = fdiv double "+val2+", "+val1+"\n";
        register++;
    }


    static void intToDouble(String id){
        content += "%"+ register +" = sitofp i32 "+id+" to double\n";
        register++;
    }

    static void doubleToInt(String id){
        content += "%"+ register +" = fptosi double "+id+" to i32\n";
        register++;
    }

    static void scanfInt(String id, VarScope scope, boolean isMain){
        //content += "%" + register + " = call i32 (i8*, ...)* @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i32* %" + id + ") \n";
        //register++;

        String varType;
        if(scope == VarScope.GLOBAL){
            varType = "@";
        }else{
            varType = "%";
        }
        if(isMain){
            content += "%" + register + " = call i32 (i8*, ...)* @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i32* " + varType + id + ") \n";
            register++;
        }else{
            fun += "%" + fun_reg + " = call i32 (i8*, ...)* @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i32* " + varType + id + ") \n";
            fun_reg++;
        }
    }

    static void scanfDouble(String id, VarScope scope, boolean isMain){
        String varType;
        if(scope == VarScope.GLOBAL){
            varType = "@";
        }else{
            varType = "%";
        }
        if(isMain){
            content += "%" + register + " = call i32 (i8*, ...)* @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8]* @.str1, i32 0, i32 0), double* " + varType + id + ") \n";
            register++;
        }else{
            fun += "%" + fun_reg + " = call i32 (i8*, ...)* @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8]* @.str1, i32 0, i32 0), double* " + varType + id + ") \n";
            fun_reg++;
        }

    }



    // A == B REAL ID ID
    static void icmpRealEquallIdId(String id_1, String id_2, VarScope s_1, VarScope s_2, boolean main){
        String varType_1;
        String varType_2;

        if(s_1 == VarScope.GLOBAL){
            varType_1 = "@";
        }else{
            varType_1 = "%";
        }

        if(s_2 == VarScope.GLOBAL){
            varType_2 = "@";
        }else{
            varType_2 = "%";
        }

        if(main){
            content += "%"+register+" = load double* " + varType_1 + id_1 + "\n";
            register++;
            content += "%"+register+" = load double* "+ varType_2 + id_2 +"\n";
            register++;
            content += "%"+register+" = fcmp oeq double %"+(register-1)+", %" +(register-2)+ "\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load double* " + varType_1 + id_1 + "\n";
            fun_reg++;
            fun += "%"+fun_reg+" = load double* "+ varType_2 + id_2 +"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = fcmp oeq double %"+(fun_reg-1)+", %" +(fun_reg-2)+ "\n";
            fun_reg++;
        }
    }

    // A > B REAL ID ID
    static void icmpRealMoreIdId(String id_1, String id_2, VarScope s_1, VarScope s_2, boolean main){
        String varType_1;
        String varType_2;

        if(s_1 == VarScope.GLOBAL){
            varType_1 = "@";
        }else{
            varType_1 = "%";
        }

        if(s_2 == VarScope.GLOBAL){
            varType_2 = "@";
        }else{
            varType_2 = "%";
        }

        if(main){
            content += "%"+register+" = load double* " + varType_1 + id_1 + "\n";
            register++;
            content += "%"+register+" = load double* "+ varType_2 + id_2 +"\n";
            register++;
            content += "%"+register+" = fcmp ogt double %"+(register-1)+", %" +(register-2)+ "\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load double* " + varType_1 + id_1 + "\n";
            fun_reg++;
            fun += "%"+fun_reg+" = load double* "+ varType_2 + id_2 +"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = fcmp ogt double %"+(fun_reg-1)+", %" +(fun_reg-2)+ "\n";
            fun_reg++;
        }

    }

    // A > B REAL ID ID
    static void icmpRealLessIdId(String id_1, String id_2, VarScope s_1, VarScope s_2, boolean main){
        String varType_1;
        String varType_2;

        if(s_1 == VarScope.GLOBAL){
            varType_1 = "@";
        }else{
            varType_1 = "%";
        }

        if(s_2 == VarScope.GLOBAL){
            varType_2 = "@";
        }else{
            varType_2 = "%";
        }

        if(main){
            content += "%"+register+" = load double* " + varType_1 + id_1 + "\n";
            register++;
            content += "%"+register+" = load double* "+ varType_2 + id_2 +"\n";
            register++;
            content += "%"+register+" = fcmp olt double %"+(register-1)+", %" +(register-2)+ "\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load double* " + varType_1 + id_1 + "\n";
            fun_reg++;
            fun += "%"+fun_reg+" = load double* "+ varType_2 + id_2 +"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = fcmp olt double %"+(fun_reg-1)+", %" +(fun_reg-2)+ "\n";
            fun_reg++;
        }

    }

    // A == B REAL ID VAL
    static void icmpRealEquall(String id, String value, VarScope scope, boolean main){
        String varType;
        if(scope == VarScope.GLOBAL){
            varType = "@";
        }else{
            varType = "%";
        }
        if(main){
            content += "%"+register+" = load double* "+varType+id+"\n";
            register++;
            content += "%"+register+" = fcmp oeq double %"+(register-1)+", "+value+"\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load double* "+varType+id+"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = fcmp oeq double %"+(fun_reg-1)+", "+value+"\n";
            fun_reg++;
        }

    }

    // A > B REAL ID VAL
    static void icmpRealMore(String id, String value, VarScope scope, boolean main){
        String varType;
        if(scope == VarScope.GLOBAL){
            varType = "@";
        }else{
            varType = "%";
        }
        if(main){
            content += "%"+register+" = load double* "+varType+id+"\n";
            register++;
            content += "%"+register+" = fcmp ogt double %"+(register-1)+", "+value+"\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load double* "+varType+id+"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = fcmp ogt double %"+(fun_reg-1)+", "+value+"\n";
            fun_reg++;
        }

    }

    // A < B REAL ID VAL
    static void icmpRealLess(String id, String value, VarScope scope, boolean main){
        String varType;
        if(scope == VarScope.GLOBAL){
            varType = "@";
        }else{
            varType = "%";
        }
        if(main){
            content += "%"+register+" = load double* "+varType+id+"\n";
            register++;
            content += "%"+register+" = fcmp olt double %"+(register-1)+", "+value+"\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load double* "+varType+id+"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = fcmp olt double %"+(fun_reg-1)+", "+value+"\n";
            fun_reg++;
        }

    }


    // A == B INT ID ID
    static void icmpIntEquallIdId(String id_1, String id_2, VarScope s_1, VarScope s_2, boolean main){
        String varType_1;
        String varType_2;

        if(s_1 == VarScope.GLOBAL){
            varType_1 = "@";
        }else{
            varType_1 = "%";
        }

        if(s_2 == VarScope.GLOBAL){
            varType_2 = "@";
        }else{
            varType_2 = "%";
        }

        if(main){
            content += "%"+register+" = load i32* " + varType_1 + id_1 + "\n";
            register++;
            content += "%"+register+" = load i32* "+ varType_2 + id_2 +"\n";
            register++;
            content += "%"+register+" = icmp eq i32 %"+(register-1)+", %" +(register-2)+ "\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load i32* " + varType_1 + id_1 + "\n";
            fun_reg++;
            fun += "%"+fun_reg+" = load i32* "+ varType_2 + id_2 +"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = icmp eq i32 %"+(fun_reg-1)+", %" +(fun_reg-2)+ "\n";
            fun_reg++;
        }
    }

    // A == B INT ID ID
    static void icmpIntMoreIdId(String id_1, String id_2, VarScope s_1, VarScope s_2, boolean main){
        String varType_1;
        String varType_2;

        if(s_1 == VarScope.GLOBAL){
            varType_1 = "@";
        }else{
            varType_1 = "%";
        }

        if(s_2 == VarScope.GLOBAL){
            varType_2 = "@";
        }else{
            varType_2 = "%";
        }

        if(main){
            content += "%"+register+" = load i32* " + varType_1 + id_1 + "\n";
            register++;
            content += "%"+register+" = load i32* "+ varType_2 + id_2 +"\n";
            register++;
            content += "%"+register+" = icmp sgt i32 %"+(register-1)+", %" +(register-2)+ "\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load i32* " + varType_1 + id_1 + "\n";
            fun_reg++;
            fun += "%"+fun_reg+" = load i32* "+ varType_2 + id_2 +"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = icmp sgt i32 %"+(fun_reg-1)+", %" +(fun_reg-2)+ "\n";
            fun_reg++;
        }

    }

    // A == B INT ID ID
    static void icmpIntLessIdId(String id_1, String id_2, VarScope s_1, VarScope s_2, boolean main){
        String varType_1;
        String varType_2;

        if(s_1 == VarScope.GLOBAL){
            varType_1 = "@";
        }else{
            varType_1 = "%";
        }

        if(s_2 == VarScope.GLOBAL){
            varType_2 = "@";
        }else{
            varType_2 = "%";
        }

        if(main){
            content += "%"+register+" = load i32* " + varType_1 + id_1 + "\n";
            register++;
            content += "%"+register+" = load i32* "+ varType_2 + id_2 +"\n";
            register++;
            content += "%"+register+" = icmp slt i32 %"+(register-1)+", %" +(register-2)+ "\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load i32* " + varType_1 + id_1 + "\n";
            fun_reg++;
            fun += "%"+fun_reg+" = load i32* "+ varType_2 + id_2 +"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = icmp slt i32 %"+(fun_reg-1)+", %" +(fun_reg-2)+ "\n";
            fun_reg++;
        }
    }

    // A == B INT ID VAL
    static void icmpIntEquall(String id, String value, VarScope scope, boolean main){
        String varType;
        if(scope == VarScope.GLOBAL){
            varType = "@";
        }else{
            varType = "%";
        }
        if(main){
            content += "%"+register+" = load i32* "+varType+id+"\n";
            register++;
            content += "%"+register+" = icmp eq i32 %"+(register-1)+", "+value+"\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load i32* "+varType+id+"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = icmp eq i32 %"+(fun_reg-1)+", "+value+"\n";
            fun_reg++;
        }
    }

    // A > B INT ID VAL
    static void icmpIntMore(String id, String value, VarScope scope, boolean main){
        String varType;
        if(scope == VarScope.GLOBAL){
            varType = "@";
        }else{
            varType = "%";
        }
        if(main){
            content += "%"+register+" = load i32* "+varType+id+"\n";
            register++;
            content += "%"+register+" = icmp sgt i32 %"+(register-1)+", "+value+"\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load i32* "+varType+id+"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = icmp sgt i32 %"+(fun_reg-1)+", "+value+"\n";
            fun_reg++;
        }
    }

    // A < B INT ID VAL
    static void icmpIntLess(String id, String value, VarScope scope, boolean main){
        String varType;
        if(scope == VarScope.GLOBAL){
            varType = "@";
        }else{
            varType = "%";
        }
        if(main){
            content += "%"+register+" = load i32* "+varType+id+"\n";
            register++;
            content += "%"+register+" = icmp slt i32 %"+(register-1)+", "+value+"\n";
            register++;
        }else{
            fun += "%"+fun_reg+" = load i32* "+varType+id+"\n";
            fun_reg++;
            fun += "%"+fun_reg+" = icmp slt i32 %"+(fun_reg-1)+", "+value+"\n";
            fun_reg++;
        }
    }

    static String generateLLVMcode(){
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
        text += "@.str = private unnamed_addr constant [3 x i8] c\"%d\\00\", align 1\n" +
                "@.str1 = private unnamed_addr constant [4 x i8] c\"%lf\\00\", align 1\n";
        text += header;

        //
        text += allFuns;
        //

        text += "define i32 @main() nounwind{\n";
        text += content;
        text += "ret i32 0 }\n";
        return text;
    }

}
