package java_100_days_learning;

public class FindNumberEvenOrOdd {

    /*
    Check the number is Even or Odd without using modulo or maths
     */
    public static void main(String[] args) {
        int n = 12;
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    /*
    Let see how this work we're using & operator to solve this
    Working of & operator: The ANd operation state that if both bits are 1, then the output is 1 else 0.
    A | B | A&b
    0 | 0 |  0
    0 | 1 |  0
    1 | 0 |  0
    1 | 1 |  1

    so & operator internally check binary number when of given number and 1 for this example
    binary number of 15 is 0111
    and 1 is 0001
    lets compare

     0 1 1 1
    &
     0 0 0 1
     _______
     0 0 0 1

    In the last if you're getting 1 its mean it's Odd number and if you're getting 0 means it's Even Number.

     */
}
