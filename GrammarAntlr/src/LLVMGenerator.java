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

    static void declareWhileCond(String repetitions){
        declareInt(Integer.toString(register));
        int counter = register;
        register++;
        assignInt(Integer.toString(counter), "0");
        br++;
        content += "br label %cond"+br+"\n";
        content += "cond"+br+":\n";

        load_i32(Integer.toString(counter));
        add("%" + (register - 1), "1");
        assignInt(Integer.toString(counter), "%" + (register-1));

        content += "%"+register+" = icmp slt i32 %"+(register-2)+", "+repetitions+"\n";
        register++;

        content += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
        content += "true"+br+":\n";
        brstack.push(br);
    }

    static void declareWhileCondInt(String id, String val, Sign sign){
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

        content += "br label %cond"+br+"\n";
        content += "cond"+br+":\n";

        content += "%"+register+" = load i32* %"+id+"\n";
        register++;

        content += "%"+register+" = icmp " + signType +  " i32 %"+(register-1)+", " + val + "\n";
        register++;

        content += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
        content += "true"+br+":\n";
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

    static void declateWhileEnd(){
        int b = brstack.pop();
        content += "br label %cond"+b+"\n";
        content += "false"+b+":\n";
        br++;
    }

    static void add(String val1, String val2){
        content += "%"+register+" = add i32 "+val1+", "+val2+"\n";
        register++;
    }



    static void printfInt(String id){
        content += "%"+ register +" = load i32* %"+id+"\n";
        register++;
        content += "%"+ register +" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpi, i32 0, i32 0), i32 %"+(register -1)+")\n";
        register++;
    }

    static void printfDouble(String id){
        content += "%"+ register +" = load double* %"+id+"\n";
        register++;
        content += "%"+ register +" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpd, i32 0, i32 0), double %"+(register -1)+")\n";
        register++;
    }

    static void declareInt(String id){
        content += "%"+id+" = alloca i32\n";
    }

    static void declareDOuble(String id){
        content += "%"+id+" = alloca double\n";
    }

    static void assignInt(String id, String value){
        content += "store i32 "+value+", i32* %"+id+"\n";
    }

    static void assignDouble(String id, String value){
        content += "store double "+value+", double* %"+id+"\n";
    }

    static void load_i32(String id){
        content += "%"+register+" = load i32* %"+id+"\n";
        register++;
    }

    static void load_double(String id){
        content += "%"+register+" = load double* %"+id+"\n";
        register++;
    }


    static void addIntVar(String val1, String var){
        content += "%"+ register +" = load i32* "+var+"\n";
        register++;
        content += "%"+ register +" = add i32 "+val1+", "+(register-1)+"\n";
        register++;
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

    static void scanfInt(String id){
        content += "%" + register + " = call i32 (i8*, ...)* @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i32* %" + id + ") \n";
        register++;
    }

    static void scanfDouble(String id){
        content += "%" + register + " = call i32 (i8*, ...)* @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8]* @.str1, i32 0, i32 0), double* %" + id + ") \n";
        register++;
    }

    static void ifstart(){
        br++;
        content += "br i1 %"+(register-1)+", label %true"+br+", label %false"+br+"\n";
        content += "true"+br+":\n";
        brstack.push(br);

    }

    static void ifend(){
        int b = brstack.pop();
        content += "br label %false"+b+"\n";
        content += "false"+b+":\n";
        br++;
    }

    // A == B REAL ID ID
    static void icmpRealEquallIdId(String id_1, String id_2){
        content += "%"+register+" = load double* %"+id_1+"\n";
        register++;
        content += "%"+register+" = load double* %"+id_2+"\n";
        register++;
        content += "%"+register+" = fcmp oeq double %"+(register-1)+", %" +(register-2)+ "\n";
        register++;
    }

    // A > B REAL ID ID
    static void icmpRealMoreIdId(String id_1, String id_2){
        content += "%"+register+" = load double* %"+id_1+"\n";
        register++;
        content += "%"+register+" = load double* %"+id_2+"\n";
        register++;
        content += "%"+register+" = fcmp ogt double %"+(register-1)+", %" +(register-2)+ "\n";
        register++;
    }

    // A > B REAL ID ID
    static void icmpRealLessIdId(String id_1, String id_2){
        content += "%"+register+" = load double* %"+id_1+"\n";
        register++;
        content += "%"+register+" = load double* %"+id_2+"\n";
        register++;
        content += "%"+register+" = fcmp olt double %"+(register-1)+", %" +(register-2)+ "\n";
        register++;
    }

    // A == B REAL ID VAL
    static void icmpRealEquall(String id, String value){
        content += "%"+register+" = load double* %"+id+"\n";
        register++;
        content += "%"+register+" = fcmp oeq double %"+(register-1)+", "+value+"\n";
        register++;
    }

    // A > B REAL ID VAL
    static void icmpRealMore(String id, String value){
        content += "%"+register+" = load double* %"+id+"\n";
        register++;
        content += "%"+register+" = fcmp ogt double %"+(register-1)+", "+value+"\n";
        register++;
    }

    // A < B REAL ID VAL
    static void icmpRealLess(String id, String value){
        content += "%"+register+" = load double* %"+id+"\n";
        register++;
        content += "%"+register+" = fcmp olt double %"+(register-1)+", "+value+"\n";
        register++;
    }


    // A == B INT ID ID
    static void icmpIntEquallIdId(String id_1, String id_2){
        content += "%"+register+" = load i32* %"+id_1+"\n";
        register++;
        content += "%"+register+" = load i32* %"+id_2+"\n";
        register++;
        content += "%"+register+" = icmp eq i32 %"+(register-1)+", %" +(register-2)+ "\n";
        register++;
    }

    // A == B INT ID ID
    static void icmpIntMoreIdId(String id_1, String id_2){
        content += "%"+register+" = load i32* %"+id_1+"\n";
        register++;
        content += "%"+register+" = load i32* %"+id_2+"\n";
        register++;
        content += "%"+register+" = icmp sgt i32 %"+(register-1)+", %" +(register-2)+ "\n";
        register++;
    }

    // A == B INT ID ID
    static void icmpIntLessIdId(String id_1, String id_2){
        content += "%"+register+" = load i32* %"+id_1+"\n";
        register++;
        content += "%"+register+" = load i32* %"+id_2+"\n";
        register++;
        content += "%"+register+" = icmp slt i32 %"+(register-1)+", %" +(register-2)+ "\n";
        register++;
    }

    // A == B INT ID VAL
    static void icmpIntEquall(String id, String value){
        content += "%"+register+" = load i32* %"+id+"\n";
        register++;
        content += "%"+register+" = icmp eq i32 %"+(register-1)+", "+value+"\n";
        register++;
    }

    // A > B INT ID VAL
    static void icmpIntMore(String id, String value){
        content += "%"+register+" = load i32* %"+id+"\n";
        register++;
        content += "%"+register+" = icmp sgt i32 %"+(register-1)+", "+value+"\n";
        register++;
    }

    // A < B INT ID VAL
    static void icmpIntLess(String id, String value){
        content += "%"+register+" = load i32* %"+id+"\n";
        register++;
        content += "%"+register+" = icmp slt i32 %"+(register-1)+", "+value+"\n";
        register++;
    }

    static String generateLLVMcode(){
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
        text += "@.str = private unnamed_addr constant [3 x i8] c\"%d\\00\", align 1\n" +
                "@.str1 = private unnamed_addr constant [4 x i8] c\"%lf\\00\", align 1";
        text += header;
        text += "define i32 @main() nounwind{\n";
        text += content;
        text += "ret i32 0 }\n";
        return text;
    }

}


/*

public class LLVMGenerator {
    static int num_of_number;
    static String header = "";
    static String mainText = "";
    static String declaration = "";
    static String print = "";
    static int register;

    public LLVMGenerator(){
        num_of_number = 0;
        register = 1;
    }

    static void addInt(String val1, String val2){
        mainText += "%"+register+" = add i32 "+val1+", "+val2+"\n";
        register++;
    }

    static void addFloat(String val1, String val2){
        mainText += "%"+register+" = add i32 "+val1+", "+val2+"\n";
        register++;
    }

    static void printf(String id){
        mainText += "%"+register+" = load i32* %"+id+"\n";
        register++;
        mainText += "%"+register+" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strp, i32 0, i32 0), i32 %"+(register-1)+")\n";
        register++;
    }

    static void declare(String id){
        mainText += "%"+id+" = alloca i32\n";
    }

    static void assign(String id, String value){
        mainText += "store i32 "+value+", i32* %"+id+"\n";
    }

    static void load(String id){
        mainText += "%"+register+" = load i32* %"+id+"\n";
        register++;
    }

    /*
    static void printInteger(int number){
        String tmp = "%num_" + num_of_number + " = alloca i32, align 4 \n" +
                "store i32 " + number + ", i32* %num_" + num_of_number + ", align 4 \n";
        declaration += tmp;
        tmp = "%l_" + num_of_number + " = load i32* %num_" + num_of_number + ", align 4 \n";
        print += tmp;
        tmp = "%p_" + num_of_number + " = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @.str, i32 0, i32 0), i32 %l_" + num_of_number + ") \n";
        print += tmp;
        num_of_number++;
    }
    */
/*
    // na poczatku musimy ustawic pare rzeczy zawsze tak samo
    static void enterProg(){
        String text = "@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1   \n" +
                        "define i32 @main() #0 { \n";
        System.out.println(text);
    }

    // na koneic ustawiamy pare rzeczy zawsze tak samo
    static void exitProg(){
        //System.out.println(declaration);
        //System.out.println(print);


        String text = "ret i32 0 \n} \n" +
                "declare i32 @printf(i8*, ...) #1\n";
        System.out.println(text);
    }

    static void print(String text){

    }




}
*/