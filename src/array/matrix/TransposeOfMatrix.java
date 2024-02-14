package array.matrix;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {

    public static void main(String[] args) {
/*
        int[][] array = {{1, 2, 3},
                         {4, 5, 6},
                         {7, 8, 9}};*/

        System.out.println("Enter row of matrix");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter column of matrix");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i = 0; i < r;  i++) {

            for (int j = 0; j < c;  j++) {

                matrix[i][j]= sc.nextInt();
            }

        }

        System.out.println("Printing value of matrix");
        printMatrix(matrix);
        System.out.println("Printing Transpose matrix");
       int[][] ans = printTransposeMatrix(matrix, r, c);
       printMatrix(ans);

       sc.close();


    }

    private static int[][] printTransposeMatrix(int[][] array, int r, int c) {
        int[][] transpose = new int[c][r];

        for (int i = 0; i < c;  i++) {

            for (int j = 0; j < r; j++) {

                transpose[i][j] = array[j][i];
            }

        }

        return transpose;
    }

    private static void printMatrix(int[][] array) {

        for (int i = 0; i < array.length;  i++) {

            //  System.out.print(array[i][]);

            for (int j = 0; j < array.length;  j++) {

                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
