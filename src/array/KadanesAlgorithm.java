package array;

public class KadanesAlgorithm {

    public static void main(String[] args) {

        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum value of Contiguous Array is: " + getMaxSubArrayValue(array));
    }

    private static int getMaxSubArrayValue(int[] array){

        int sum = 0;
        int maxi = array[0];

        for (int i = 0; i < array.length;  i++) {

            sum += array[i];
            maxi = Math.max(maxi , sum);

            if(sum < 0){
                sum = 0;
            }
        }

        return sum;
    }
}
