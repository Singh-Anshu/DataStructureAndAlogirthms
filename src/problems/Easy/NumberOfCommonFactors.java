package problems.Easy;

public class NumberOfCommonFactors {

   /* Given two positive integers a and b, return the number of common factors of a and b.

    An integer x is a common factor of a and b if x divides both a and b.*/

    public static void main(String[] args) {
        System.out.println("Total Count is: "+ commonFactors(12, 6));
    }

    public static int commonFactors(int a, int b) {
        int min = Math.min(a,b);
        int max = Math.max(a,b);

        int totalCount = 0;

        for(int i=1; i<= min; i++){

            if(min%i == 0 && max%i == 0 ){

                totalCount++;
            }
        }

        return totalCount;

    }
}
