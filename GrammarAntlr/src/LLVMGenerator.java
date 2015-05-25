/**
 * Created by kuba on 26.04.15.
 */


class LLVMGenerator{

    static String header_text = "";
    static String main_text = "";
    static int reg = 1;

    static void printf_i32(String id){
        main_text += "%"+reg+" = load i32* %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void printf_double(String id){
        main_text += "%"+reg+" = load double* %"+id+"\n";
        reg++;
        main_text += "%"+reg+" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
        reg++;
    }

    static void declare_i32(String id){
        main_text += "%"+id+" = alloca i32\n";
    }

    static void declare_double(String id){
        main_text += "%"+id+" = alloca double\n";
    }

    static void assign_i32(String id, String value){
        main_text += "store i32 "+value+", i32* %"+id+"\n";
    }

    static void assign_double(String id, String value){
        main_text += "store double "+value+", double* %"+id+"\n";
    }


    static void load_i32(String id){
        main_text += "%"+reg+" = load i32* %"+id+"\n";
        reg++;
    }

    static void load_double(String id){
        main_text += "%"+reg+" = load double* %"+id+"\n";
        reg++;
    }

    static void add_i32(String val1, String val2){
        main_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void add_double(String val1, String val2){
        main_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
        reg++;
    }

    static void mult_i32(String val1, String val2){
        main_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void mult_double(String val1, String val2){
        main_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
        reg++;
    }

    static void sitofp(String id){
        main_text += "%"+reg+" = sitofp i32 "+id+" to double\n";
        reg++;
    }

    static void fptosi(String id){
        main_text += "%"+reg+" = fptosi double "+id+" to i32\n";
        reg++;
    }


    static String generate(){
        String text = "";
        text += "declare i32 @printf(i8*, ...)\n";
        text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
        text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
        text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
        text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
        text += header_text;
        text += "define i32 @main() nounwind{\n";
        text += main_text;
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
    static int reg;

    public LLVMGenerator(){
        num_of_number = 0;
        reg = 1;
    }

    static void addInt(String val1, String val2){
        mainText += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void addFloat(String val1, String val2){
        mainText += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
        reg++;
    }

    static void printf(String id){
        mainText += "%"+reg+" = load i32* %"+id+"\n";
        reg++;
        mainText += "%"+reg+" = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([4 x i8]* @strp, i32 0, i32 0), i32 %"+(reg-1)+")\n";
        reg++;
    }

    static void declare(String id){
        mainText += "%"+id+" = alloca i32\n";
    }

    static void assign(String id, String value){
        mainText += "store i32 "+value+", i32* %"+id+"\n";
    }

    static void load(String id){
        mainText += "%"+reg+" = load i32* %"+id+"\n";
        reg++;
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