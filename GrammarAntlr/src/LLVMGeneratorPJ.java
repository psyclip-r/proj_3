/**
 * Created by kuba on 26.04.15.
 */
public class LLVMGeneratorPJ {
    static int num_of_number;
    public LLVMGeneratorPJ(){
        num_of_number = 0;
    }




    static void printInteger(int text){

        String str_type = "a";



        //num_of_number++;
    }


    static void enterProg(){
        String text = "@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1   \n" +
                        "define i32 @main() #0 { ";
        System.out.println(text);
    }

    static void exitProg(){
        String text = "} \n" +
                "declare i32 @printf(i8*, ...) #1";
        System.out.println(text);
    }

    static void print(String text){

    }




}
