package array.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    /*
     * Problem Statement:
     * Given an m x n matrix, return all elements of the matrix in spiral order.
     *
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [1,2,3,6,9,8,7,4,5]
     *
     */

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        List<Integer> list = spiralOrder(matrix);

        for (int value : list) {
            System.out.print(value + " ");
        }

        System.out.println();

    }
    /*
    Demo Print of Matrix
            1 2 3
            4 5 6
            7 8 9
     */


    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();

        int row = matrix.length;

        if (row == 0)
            return list;

        int col = matrix[0].length;

        int l = 0;
        int r = col - 1;
        int t = 0;
        int b = row - 1;
        int d = 0;
        while (l <= r && t <= b) {

            if (d == 0) {

                for (int i = l; i <= r; i++) {
                    list.add(matrix[t][i]);
                }

                d = 1;
                t++;
            } else if (d == 1) {

                for (int i = t; i <= b; i++) {
                    list.add(matrix[i][r]);
                }
                d=2;
                r--;
            } else if(d == 2){

                for(int i =r; i >= l; i--){
                    list.add(matrix[b][i]);
                }

                d=3;
                b--;
            } else if( d == 3){

                for(int i =b; i >=t; i--){
                    list.add(matrix[i][l]);
                }
                d = 0;
                l++;
            }

        }

        return list;
    }
}
