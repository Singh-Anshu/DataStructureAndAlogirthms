package stack;

import java.util.Scanner;

public class Parenthesis1 {


    private static boolean isValid(String s) {
        int open = 0;
        for(int i = 0; i < s.length(); ++i)
            if(s.charAt(i) == '(') {
                open += 1;
            }
            else if(open == 0){
                return false;
            }
            else {
                open -= 1;
            }
        return open == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter open and closing Parenthesis only (");

        String s = sc.next();
        System.out.println(isValid(s));
        sc.close();
    }

}
