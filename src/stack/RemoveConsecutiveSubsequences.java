package stack;

import java.util.Arrays;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {

    /*
    Problem Statement:
    Given a sequence of numbers. Remove all the consecutive subsequences of length greater than or
    equal to 2 that contains the same element.

     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 10,10,101,10,10,10,4, 4, 4, 5, 7, 7, 2, 2,};
        int[] result = remove(arr);
        System.out.println(Arrays.toString(result));

    }

    private static int[] remove(int[] arr) {

        int n = arr.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);

            } else if (arr[i] == stack.peek()) {
                if (i == n - 1 || arr[i] != arr[i+1]) {
                    stack.pop();
                }
            }
        }

        int[] res = new int[stack.size()];
        int m = res.length;
        for(int i=m-1; i>=0; i--){
            res[i] = stack.pop();
        }


        return res;

    }
}
