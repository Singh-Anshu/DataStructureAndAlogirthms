package recursion;

import java.util.Scanner;

public class RemoveDuplCharFromString {
    /*
    *Problem Statement:
    * Remove Duplicate character from given string
     */

    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        removeDuplicateChar(str, 0, "");
        sc.close();
    }

    private static final boolean[] map = new boolean[26];

    private static void removeDuplicateChar(String str, int index, String newString){

        if(index == str.length() ){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar - 'a']){
            removeDuplicateChar(str, index+1, newString);
        }else{
            map[currChar - 'a'] = true;
            newString += currChar;
            removeDuplicateChar(str, index+1, newString);
        }
    }
}
