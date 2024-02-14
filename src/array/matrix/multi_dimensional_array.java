package array.matrix;

public class multi_dimensional_array {

    static {
        System.out.println("The 2D array is:");
    }

    public static void main(String[] args){
        int num = 1;
        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3;  j++) {
                a[i][j] = num;
                ++num;
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3;  j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.print("a[1][2] = "+ a[1][2]);

    }
}
