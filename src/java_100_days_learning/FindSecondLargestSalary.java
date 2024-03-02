package java_100_days_learning;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestSalary { 


    public static void main(String[] args) {

        int[] sar = {50000, 50000, 67000, 35000, 70000,98000};

        String [] salary = {"50,000", "50,000", "67,000", "35,000", "70,000"};

        System.out.println(findSecondLargestSalary(sar));  //T.C = O(n)
        System.out.println(Arrays.stream(salary).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst());
    }

    // Second Method of finding second largest salary

    private static int findSecondLargestSalary(int[] salary){

        int largestSalary = 0;
        int secondLargestSalary = 0;

        for(int currentSalaries: salary){

            if(currentSalaries > largestSalary){
                secondLargestSalary = largestSalary;
                largestSalary = currentSalaries;

            }else if(currentSalaries > secondLargestSalary && currentSalaries != largestSalary){
                secondLargestSalary = currentSalaries;
            }
        }

       return  secondLargestSalary;
    }
}
