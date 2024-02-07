package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {
    public static void main(String[] args) {



        System.out.println("Enter the length of String:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter array of String");

        String[] a = new String[n];

        for (int i = 0; i < a.length;  i++) {
            a[i] = sc.next();
        }

        //String[] a = {"deepak", "Mayur", "rahul", "Anshu", "dheeraj", "vishal"};

        System.out.println(Arrays.toString(getSortedStringByBubbleSort(a, n)));
        System.out.println(Arrays.toString(getSortedStringBySelectionSort(a, n)));
    }

    // This String sorting is based on bubble sorting algorithm
    private static String[] getSortedStringByBubbleSort(String[] a, int n){

        String temp;
        for (int i = 0; i < n;  i++) {

            for (int j = 0; j < n - 1-i; j++) {

                if(a[j].compareToIgnoreCase(a[j+1]) > 0){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        return a;
    }


    private static String[] getSortedStringBySelectionSort(String[] a, int n){
        int min;
        String temp;

        for (int i = 0; i < n;  i++) {

            min = i;
            for (int j = i+1; j < n;  j++) {

                if(a[j].compareToIgnoreCase(a[min]) < 0){
                    min = j;
                }
            }

            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        return a;
    }

}
