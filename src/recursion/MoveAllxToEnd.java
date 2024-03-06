package recursion;

import java.util.Scanner;

public class MoveAllxToEnd {

    /*
     *Problem Statement:
     *
     * Moving all the entered value to end of the string.
     */

    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Enter character which want to move end of string: ");
        char value = sc.next().charAt(0);

        sc.close();

        moveValueToEndOfString(str, value, 0, 0, "");
    }

    // abcadea
    // value = a
    private static void moveValueToEndOfString(String str, char value, int index, int count, String newString) {

        if (index == str.length()) {
            for(int i=0; i <count; i++)
                newString += value;
            System.out.println("Result is: "+newString);
            return;
        }

        char currChar = str.charAt(index);
        if (currChar == value) {
            count++;
            moveValueToEndOfString(str, value, index + 1, count, newString);
        } else {
            newString += currChar;
            moveValueToEndOfString(str, value, index + 1, count, newString);
        }

    }
}
