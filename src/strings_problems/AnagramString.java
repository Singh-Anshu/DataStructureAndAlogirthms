package strings_problems;

import java.util.Scanner;

public class AnagramString {

    public static void main(String[] args) {

        System.out.println("Enter string one: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println("Enter string two: ");
        String s2 = sc.next();

        System.out.println("Anagram String is : "+ checkStringIsAnagram(s1, s2));

        sc.close();
    }

    private static boolean checkStringIsAnagram(String s1, String s2) {

        boolean isAnagram = false;
        //aab
        //abc

        boolean [] visited = new boolean[s2.length()];

        for (int i =0 ; i < s1.length(); i++){
            isAnagram = false;
            for(int j=0; j < s2.length(); j++){

                if(s1.charAt(i)  == s2.charAt(j) && !visited[j]){
                    visited[j] = true;
                    isAnagram = true;
                    break;
                }
            }
            if(!isAnagram){
                break;
            }
        }
        return isAnagram;
    }
}
