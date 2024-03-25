package java_100_days_learning;

public class MonotonicArray {
    /*
     *Problem Statement:
     * What is Monotonic -> An array is said to be monotonic if the elements in the array are strictly arranged either in ascending
     *                      or descending order.
     * example: 1 araay = 1,2,2,3  This is monotonic array
     *          2 araay = 6,5,4,4  This is monotonic array
     *          3 araay = 1,3,2,4  This is not monotonic array
     */


    public static void main(String[] args) {
        int[] input = {1,2,3,4,4,5,6,6};
        System.out.println("Given array is monotonic: "+findMonotonic(input));
    }


    public static boolean findMonotonic(int[] a) {

        boolean increasing = true, decreasing = true;

        for (int i = 0; i < a.length-1; i++) {

            if (a[i] < a[i + 1]) {
                decreasing = false;

            } else if (a[i] > a[i + 1]) {
                increasing = false;
            }
        }

        return increasing || decreasing;

    }
}
