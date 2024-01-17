package array;

import java.util.Scanner;

public class MaxNumberInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n ;
        n =sc.nextInt();
        int max =0;

        int a[]	 = new int[n];
        for(int i =0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i =0; i< n ;i++)
        {
            max = Math.max(max, a[i]);

        }
        System.out.print(max+ " ");
    }
}
