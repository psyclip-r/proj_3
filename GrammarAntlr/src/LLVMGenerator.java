/**
 * Created by kuba on 26.04.15.
 */
public class LLVMGenerator {
    static int num_of_number;
    static String declaration = "";
    static String print = "";
    public LLVMGenerator(){
        num_of_number = 0;
    }




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


    static void enterProg(){
        String text = "@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1   \n" +
                        "define i32 @main() #0 { \n";
        System.out.println(text);
    }

    static void exitProg(){
        System.out.println(declaration);
        System.out.println(print);
        String text = "ret i32 0 \n} \n" +
                "declare i32 @printf(i8*, ...) #1\n";
        System.out.println(text);
    }

    static void print(String text){

    }




}
