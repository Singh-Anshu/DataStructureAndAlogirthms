package array;

public class DeleteAmElement {

    /*
    Deleting an element from Array
     */

    private static int count = 0;

    public static void main(String[] args) {

        int deleteElement = 20;
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int[] output = deleteElementFromArray(arr, deleteElement);

        if (count == 0) {
            System.out.println("Element was not Found!");
        } else {
            System.out.println("Element was deleted SuccessFully");

            for (int k = 0; k < output.length - 1; k++) {
                System.out.print(output[k] + " ");
            }

        }

    }

    private static int[] deleteElementFromArray(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            if (target == arr[i]) {

                for (int j = i; j < arr.length - 1; j++) {

                    arr[j] = arr[j + 1];
                }
                count++;
                break;
            }
        }

        return arr;
    }
}
