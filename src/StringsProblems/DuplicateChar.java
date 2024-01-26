package StringsProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChar {

    public static void main(String[] args) {

        System.out.println("Enter any character:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        duplicateChar(input);
    }

    private static void duplicateChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();

        for (char c : charArray) {

            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            //Printing duplicate Value
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }
}
