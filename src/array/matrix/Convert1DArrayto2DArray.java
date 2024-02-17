package array.matrix;

public class Convert1DArrayto2DArray {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int m=2;
        int n =2;

        int[] [] temp = construct2DArray(arr, m ,n);
        printMatrix(temp);
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {

        int[][] ans = new int[m][n];
        if((m==1 && n==1) || original.length <= 0){
            return ans;
        }

        int count =0;

        for(int i=0; i < m; i++){

            for(int j=0; j <n; j++){

                ans[i][j] = original[count];
                count++;
            }
        }

        return ans;

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
