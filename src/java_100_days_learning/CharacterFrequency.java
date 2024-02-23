package java_100_days_learning;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {

    public static void main(String[] args) {

        String data = "Hello";
        data = data.toLowerCase();
        char[] arr = data.toCharArray();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : arr){

            if(Character.isLetter(c)){

                map.put(c, map.getOrDefault(c,0)+1);
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
