package patternproblems.number_patterns;

public class NumberPatternOne {

    public static void main(String[] args) {

        /*
        If I print the j the output is below

        1
        1 2
        1 2 3
        1 2 3 4
        */

        for (int i =1; i <= 4; i++){

            for (int j =1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

         /*
        If I print the i the output is below

        1
        2 2
        3 3 3
        4 4 4 4
        */

        System.out.println("_________________________________________________________________________");

        for (int i =1; i <= 4; i++){

            for (int j =1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
