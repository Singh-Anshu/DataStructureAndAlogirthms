package recursion;

import java.util.Scanner;

public class NumberSpelling {

    public static void main(String[] args) {

        System.out.print("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        String[] str= {"zero", "one", "two","three","four", "five", "six", "seven", "eight","nine"};

        printSpell(n ,str);

        sc.close();
    }

    private static void printSpell(int n, String[] str)
    {
        if(n==0)
            return;

        printSpell(n/10, str);

        int number = n%10;
        System.out.print(str[number]+" ");

    }
}
