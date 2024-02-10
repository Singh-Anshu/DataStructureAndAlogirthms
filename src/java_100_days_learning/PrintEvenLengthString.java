package java_100_days_learning;

import java.util.Arrays;

public class PrintEvenLengthString {

    /*
    Problem Statement:
    In this question you have to print even length of string only
    for example:
    input: Sky is blue and vast
    output: is   -> 2
            blue -> 4
            vast -> 4
     */
    public static void main(String[] args) {
        String inputText = "hi my name is Anshu";
        printEvenLength(inputText);
    }

    private static void printEvenLength(String inputText){
        String[] wordArray = inputText.split(" ");

        for (int i=0; i < wordArray.length; i++){
            if(wordArray[i].length() % 2 == 0){
                System.out.println("String is: "+ wordArray[i] + " And length is: "+wordArray[i].length() );
            }
        }
    }


}
