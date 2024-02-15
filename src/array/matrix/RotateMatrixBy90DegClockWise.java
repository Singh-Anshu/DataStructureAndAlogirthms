package array.matrix;

import java.util.Scanner;

public class RotateMatrixBy90DegClockWise {

    /*
    Problem Statement:
    You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
    You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

    Example 1:
    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[7,4,1],[8,5,2],[9,6,3]]

    Example 2:
    Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
    Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
    
     */

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

        //int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11, 12, 13, 14,15}, {16, 17, 18,19,20}, {21,22,23,24,25}};

        System.out.println("Printing value of matrix");
        printMatrix(matrix);
        System.out.println("Printing Transpose matrix");
        rotate(matrix , matrix.length);
        printMatrix(matrix);

    }

    private static void rotate(int[][] matrix, int length) {

        // first make array transpose
        printTransposeMatrix(matrix, length, length);

        for (int i = 0; i < matrix.length; i++) {
            reverseArray(matrix[i]);
        }

    }

    private static void reverseArray(int[] matrix) {
        int li =0;
        int hi = matrix.length-1;

        while (li < hi){
            int temp = matrix[li];
            matrix[li] = matrix[hi];
            matrix[hi] = temp;
            li++;
            hi--;
        }
    }

    private static void printTransposeMatrix(int[][] matrix, int r, int c) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = i; j < matrix.length; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }

       // return matrix;
    }

    private static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length;  i++) {

            //  System.out.print(matrix[i][]);

            for (int j = 0; j < matrix.length;  j++) {

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
