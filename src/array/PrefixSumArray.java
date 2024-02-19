package array;

import java.util.Arrays;

public class PrefixSumArray {

    public static void main(String[] args) {

        int[] arr = { 5, 1,0,-3, 2,5};

        int[] ans = new int[arr.length];

        ans[0] = arr[0];
        for(int i=1; i <arr.length; i++){

            ans[i] = ans[i-1] + arr[i];

        }
        // i = 1
        // ans ={ 5, }

        System.out.println("Prefix Sum Array is: "+ Arrays.toString(ans));
    }
}
