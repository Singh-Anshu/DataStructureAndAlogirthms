package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RemoveConsecutiveSubsequences {

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int result[] = remove(arr);
        System.out.println(Arrays.toString(result));

    }

    private static int[] remove(int[] arr) {

        Stack<Integer> stack = new Stack<>();
//        List<Integer> result = new ArrayList<>();

        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] != stack.peek()) {
                // If stack is empty or current element is different from the top of stack
                // push current element onto the stack.
                stack.push(arr[i]);
            } else {
                // If current element is equal to the top of stack,
                // remove all elements equal to the top of stack until a different element is found.
                int count = 0;
                while (i < arr.length && arr[i] == stack.peek()) {
                    i++;
                    count++;
                }
                if (count < 2) {
                    temp[stack.pop()];
                } else {
                    stack.pop();
                }
                // decrement i as it has been incremented in the while loop
                i--;
            }
        }

        // Add remaining elements in the stack to the result list.
        while (!stack.isEmpty()) {
           temp[stack.pop()];
        }

        return result;

    }
}
