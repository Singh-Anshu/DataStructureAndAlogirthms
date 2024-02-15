package array.matrix;

import java.util.Scanner;

public class RotateMatrixBy90DegClockWise {

    public static void main(String[] args) {

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
        int[][] ans =  rotateMatrixBy90Degree(matrix, r, c);
        printMatrix(ans);

    }

    private static int[][] rotateMatrixBy90Degree(int[][] matrix, int r, int c) {

        int[][] transpose = new int[c][r];

        for (int i = 0; i < r; i++) {

            for (int j = i; j < c; j++) {

                transpose[c - j - 2][i] = matrix[i][j];


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
