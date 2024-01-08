package problems;

public class AddDigits {

    /*
   Problem: -> Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
     */

    public static void main(String[] args) {
        System.out.println(addDigits(95));
    }

    public static int addDigits(int num) {

        if(num <= 0){
            return 0;

        }else if(num%9==0){
            return 9;
        }
        return num%9;

    }
}
