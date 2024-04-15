package stack;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis2 {

    /*
    Problem Statement:
    LeetCode -> 20. Valid Parentheses

    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

    An input string is valid if:
    1. Open brackets must be closed by the same type of brackets.
    2. Open brackets must be closed in the correct order.
    3. Every close bracket has a corresponding open bracket of the same type.

    Example 1:
    Input: s = "()"
    Output: true

    Example 2:
    Input: s = "()[]{}"
    Output: true

    Example 3:
    Input: s = "(]"
    Output: false

     */

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            if (ch == '[')
                s.push(']');
            else if (ch == '{')
                s.push('}');
            else if (ch == '(')
                s.push(')');
            else if (s.empty() || s.peek() != ch)
                return false;
            else
                s.pop();
        }
        return s.empty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter open and closing Parenthesis only (,{,[");
        String s = sc.next();
        System.out.println(isValid(s));
        sc.close();
    }
}
