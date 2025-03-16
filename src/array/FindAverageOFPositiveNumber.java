package array;

public class FindAverageOFPositiveNumber {
    /*
        Find Average of Positive Numbers in Given Array
        -> 0 is not positive or negative number
     */
    public static void main(String[] args) {
        int[] arr = {-2, -5, 0, 5, -10, 10, 0, 25, 20};
//        int[] arr = {-2, -5, 0,-10, -16, -24, -30, -7};

        int sum = 0;
        int count = 0;
        for (int j : arr) {
            if (j > 0) {
                sum = sum + j;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The Average number is: " + average);
        } else {
            System.out.println("There is no Positive number in array");
        }
    }
}
