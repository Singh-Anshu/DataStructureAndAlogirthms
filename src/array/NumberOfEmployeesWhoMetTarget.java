package array;

public class NumberOfEmployeesWhoMetTarget {

    /*
    Problem Statement:
    Number of Employees Who Met the Target
    There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.

    The company requires each employee to work for at least target hours.

    You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.

    Return the integer denoting the number of employees who worked at least target hours.
    */

    public static void main(String[] args) {
        int[] hours = {5,1,4,2,2};
        int target= 1;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target ));
    }

    public static  int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int targetEmployee = 0;
        for(int i=0; i< hours.length; i++){

            if(hours[i] >= target ){
                targetEmployee++;
            }
        }

        return targetEmployee;
    }
}
