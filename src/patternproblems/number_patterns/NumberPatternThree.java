package patternproblems.number_patterns;

public class NumberPatternThree {

    public static void main(String[] args) {

        /*
        This pattern will print output is;
        1
        2 1
        3 2 1
        4 3 2 1
        5 4 3 2 1

         */

        for (int i = 1; i <= 5; i++) {      //Thi is for Row

            for (int j = i; j >= 1; j--) {   // This is for Column

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
