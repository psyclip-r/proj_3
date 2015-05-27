/**
 * Created by kuba on 26.04.15.
 */


class LLVMGenerator{

    static String header = "";
    static String content = "";
    static int register = 1;

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

    /*
    static void load_i32(String id){
        content += "%"+register+" = load i32* %"+id+"\n";
        register++;
    }

    static void load_double(String id){
        content += "%"+register+" = load double* %"+id+"\n";
        register++;
    }
    */

    static void addInt(String val1, String val2){
        content += "%"+ register +" = add i32 "+val1+", "+val2+"\n";
        register++;
    }

    static void addDouble(String val1, String val2){
        content += "%"+ register +" = fadd double "+val1+", "+val2+"\n";
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