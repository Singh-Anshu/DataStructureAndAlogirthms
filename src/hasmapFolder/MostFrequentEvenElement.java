package hasmapFolder;

import java.util.HashMap;

public class MostFrequentEvenElement {

    /*
    * Problem Statement: LeetCode: 2404. Most Frequent Even Element
    *
    * Given an integer array nums, return the most frequent even element.

        If there is a tie, return the smallest one. If there is no such element, return -1.
        Example 1:

        Input: nums = [0,1,2,2,4,4,1]
        Output: 2
        Explanation:
        The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
        We return the smallest one, which is 2.
        Example 2:

        Input: nums = [4,4,4,9,2,4]
        Output: 4
        Explanation: 4 is the even element appears the most.
        Example 3:

        Input: nums = [29,47,21,41,13,37,25,7]
        Output: -1
        Explanation: There is no even element.
        *
     */

    public static void main(String[] args) {
        int[] arr = {0,1,5,2,6};
        int value = mostFrequentEven(arr);
        if ( value == -1 || value == 0) {
            System.out.println("There is no even element.");
        }else {
            System.out.println(value +" is the even element appears the most.");

        }
    }

    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();;
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println("printing hasmap in map format: "+freq);
        int maxFreqSoFar = 0, finalAns = -1;
        for (Integer num : freq.keySet()) {
            int curFreq = freq.get(num);

            if((num % 2 == 1) || curFreq < maxFreqSoFar)
                continue;

            if(curFreq > maxFreqSoFar || num < finalAns) {
                maxFreqSoFar = curFreq;
                finalAns = num;
            }
        }
        return finalAns;
    }
}
