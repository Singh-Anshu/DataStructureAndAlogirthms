package stack;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis1 {

    /*
     * Problem Statement:
     * Check whether a given bracket sequence is balanced or not
     */

    private static boolean isValid(String s) {
        int open = 0;
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) == '(') {
                open += 1;
            } else if (open == 0) {
                return false;
            } else {
                open -= 1;
            }
        return open == 0;
    }



    // By Using Stack
    private static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));

            } else if (stack.isEmpty()) {
                return false;

            } else {
                stack.pop();
            }

        return stack.isEmpty();

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter open and closing Parenthesis only (");

        String s = sc.next();
        System.out.println(isValid2(s));
        sc.close();
    }

}
