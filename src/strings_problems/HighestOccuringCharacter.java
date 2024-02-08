package strings_problems;

import java.util.Scanner;

public class HighestOccuringCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        highestOccuringChar(input);

    }

    // By Brute Force
    public static void highestOccuringChar(String str) {
        //Your code goes here
        int max = 0;
        char ans = '\0';
        int count =0;

        for(int i=0; i <str.length(); i++){
            count =0;

            for(int j=0; j <str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count ++;
                }
            }

            if(count > max){
                max = count;
                ans = str.charAt(i);
            }
        }
        System.out.println(ans +"\t-->\t"+ max);

    }
}
