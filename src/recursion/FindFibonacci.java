package recursion;

import java.util.Scanner;

public class FindFibonacci {


    /*
    find the fibonacci of last two function of sum
     */

    public static void main(String[] args) {

        System.out.println("Enter value to get fibonacci sum");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));

        sc.close();
    }

    private static int fibo(int n) {

        if (n <= 1)
            return n;

        return fibo(n - 1) + fibo(n - 2);
    }
}
