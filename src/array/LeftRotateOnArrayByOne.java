package array;

public class LeftRotateOnArrayByOne {

    public static void main(String[] args) {

        int[]  arr = {3, 1 ,6 ,5 ,10 ,7, 6, 6 ,1, 7 };
        int n = arr.length;

        int temp = arr[0];

        for(int i=1; i<n; i++){

            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;

        for (int number: arr ) {
            System.out.print(number+" ");

        }
    }
}
