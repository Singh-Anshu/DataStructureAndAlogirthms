package recursion;

import java.util.Scanner;

public class FindFibonacci {


    /*
    find the fibonacci of last two function of sum
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));

        sc.close();
    }

    private static int fibo(int n){

        if(n == 0 || n ==1)
            return n;
        int a = fibo(n-1);
        int b = fibo(n-2);
        System.out.println("a :"+ a + " b :"+ b);

        return a+b ;
    }
}
