package array;

import java.util.Scanner;

public class SquareMatrix {

    public static void main(String[] args) {
        System.out.println("Enter Matrix Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr  = new int[n][n];

        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                arr[i][j] = sc.nextInt();


        // printing main diagonals
        for(int i=0; i < arr.length ; i++){
            System.out.print(arr[i][i]+" ");
        }
        System.out.println();

        for(int i=arr.length-1; i >= 0; i--){
            System.out.print(arr[i][i]+" ");
        }
        System.out.println();

        // printing secondary diagonals
        for(int i=0, j = arr.length -1; i < arr.length; ++i, --j){
            System.out.print(arr[i][j]+" ");
        }
    }
}
