import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Anshu Singh");

        // Printing ASCII Value
        /*for(int i =0; i<256; i++){
            System.out.println(i +"\t-->\t"+ (char)i);
        }*/
        String s = "Anshu";
        System.out.println(reverseNumber());

    }

    public static String reverseNumber(){
        System.out.println("Enter number to reverse");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";


        for(int i = input.length()-1; i >= 0; i-- ){
             output += input.charAt(i);
        }

        return output;
    }
}


