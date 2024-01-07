package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        // First we have to find even numbers from 1 to n
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
       // int evenNumber[] = new int[0];
        ArrayList<Integer> evenNumber = new ArrayList<>();

        int index = 0;
        for(int i = 2; i <= input; i +=2){
            evenNumber.add(i);
            index++;
        }

        int sum = 0;
        //Printing even numbers array
        for(int i = 0; i < evenNumber.size(); i++){
            System.out.print(evenNumber.get(i)+ " ");
            sum +=  evenNumber.get(i);
        }
        System.out.println();
        System.out.println("Total Sum of even number is: "+ sum);

    }
}
