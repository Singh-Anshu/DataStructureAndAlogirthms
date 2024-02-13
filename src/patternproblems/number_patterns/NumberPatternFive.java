package patternproblems.number_patterns;

public class NumberPatternFive {

    public static void main(String[] args) {

        /*
        This pattern will print output is:

        5 4 3 2 1
        5 4 3 2
        5 4 3
        5 4
        5
         */
        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j >= i; j--) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
