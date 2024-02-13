package patternproblems.number_patterns;

public class NumberPatternFour {

    public static void main(String[] args) {

        /*
        This pattern will print output is:
        1
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1

         */
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");
            }

            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
