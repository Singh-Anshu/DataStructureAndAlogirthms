package java_100_days_learning;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestSalary {


    public static void main(String[] args) {

        String [] sar = {"50,000", "50,000", "67,000", "35,000", "70,000"};

        //System.out.println(findSecondLargestSalary(sar));
        System.out.println(Arrays.stream(sar).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst());
    }

   /* private static String findSecondLargestSalary(String[] salary){

        String firstSalary = salary[0];
        String secondSalary = firstSalary;

        for(int i=0; i < salary.length; i++){

            if(firstSalary.replace(",", ".") <= salary[i]){

            }
        }
    }*/
}
