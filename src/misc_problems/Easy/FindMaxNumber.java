package misc_problems.Easy;

public class FindMaxNumber {

    /*
    Problem Statement:
    To find the maximum digit in an integer value in Java.

     */

    public static int findMaxDigit(int number) {
        int max = 0; // Variable to store the maximum digit
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            System.out.println("digit: "+digit);
            System.out.println("max: "+max);
            if (digit > max) {
                max = digit; // Update max if current digit is greater
            }
            number /= 10; // Remove the last digit
            System.out.println("number: "+number);


        }
        return max;
    }


    public static void main(String[] args) {
        int value = 852693174; // Your integer value
        int maxDigit = findMaxDigit(value);
        System.out.println("The maximum digit in " + value + " is " + maxDigit);
    }
}
