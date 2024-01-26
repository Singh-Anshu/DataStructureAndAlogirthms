package StringsProblems;

public class LongestPalindromicSubstring {

    /*
    Problem Statement:
    Given a string S, find the longest palindromic substring in S. Substring of string S: S[ i . . . . j ] where 0 ≤ i ≤ j < len(S).
    Palindrome string: A string that reads the same backward. More formally, S is a palindrome if reverse(S) = S. In case of conflict,
    return the substring which occurs first ( with the least starting index).

    Example 1:
    Input:
    S = "aaaabbaa"
    Output: aabbaa
    Explanation: The longest Palindromic
    substring is "aabbaa".

    Example 2:
    Input:
    S = "abc"
    Output: a
    Explanation: "a", "b" and "c" are the
    longest palindromes with same length.
    The result is the one with the least
    starting index.
     */

    public static void main(String[] args) {
        String input = "BABBAR";
        System.out.println("Longest Palindrome is: "+ printLongestPalindrome(input));

    }

    private static String printLongestPalindrome(String s){

        int start = 0, end = 0;
        for(int i=0; i <s.length(); i++){
            int len1 = expandFromCentre(s, i, i+1);
            int len2 = expandFromCentre(s, i, i);

            int len = Math.max(len1, len2);
            if(end - start < len){
                start = i - (len-1)/2;
                end = i+len/2;
            }
        }

        return s.substring(start, end+1);
    }

    private static int expandFromCentre(String s, int i, int j) {

        while(i >=0 && j <s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }

        return  j-i-1;
    }
}
