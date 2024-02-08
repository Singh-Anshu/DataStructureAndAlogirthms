package strings_problems;

import java.util.HashMap;
import java.util.Map;

public class TwoGram {

    /*
    Problem Statement:

    Two-gram is an ordered pair (i.e. string of length two) of capital Latin letters. For example, "AZ", "AA", "ZA" — three distinct two-grams.

    You are given a string s consisting of n capital Latin letters. Your task is to find any two-gram contained in the given string as a substring
    (i.e. two consecutive characters of the string) maximal number of times. For example, for string s = "BBAABBBA" the answer is two-gram "BB",
    which contained in s three times. In other words, find any most frequent two-gram.

    Note that occurrences of the two-gram can overlap with each other.

    Examples:
    input
    7
    ABACABA
    output
    AB

    input
    5
    ZZZAA
    output
    ZZ
     */

    public static void main(String[] args) {

        String s = "BBAABBBA";
        Map<String, Integer> map = new HashMap<>();

        for(int i= 0 ; i <s.length(); i++){

            String tem ="";
            if( i != s.length()-1) {
                tem = s.substring(i, i + 2);
            }

            if(map.containsKey(tem)){
                map.put(tem, map.get(tem)+1);
            }else{
                map.put(tem, 1);
            }
        }

        int max =0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            //Printing duplicate Value
           max = Math.max(max, e.getValue());
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            //Printing duplicate Value
            if(e.getValue() == max){
                System.out.println(e.getKey() +"\t"+ e.getValue());
            }
        }

    }
}
