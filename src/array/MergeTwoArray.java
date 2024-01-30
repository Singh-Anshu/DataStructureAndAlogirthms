package array;

public class MergeTwoArray {
    public static void main(String[] args) {
        int arr1[]= {0,1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int arr3[] = new int[arr1.length + arr2.length];

        mergingTwoSortedAraay(arr1, arr2, arr3, arr1.length, arr2.length);
    }

    public static void mergingTwoSortedAraay(int arr1[], int arr2[], int arr3[], int m, int n)
    {
        int i,j,k;
        i = j= k= 0;

        for( i=0; i< m;)
        {
            for(j =0; j< n;)
            {
                if(arr1[i] < arr2[j])
                {
                    arr3[k]= arr1[i];
                    k++;
                    i++;
                }
                else
                {
                    arr3[k] = arr2[j];
                    k++;
                    j++;
                }
            }
        }

        for( k =0; k <= arr3.length-1; k++)
        {
            System.out.print(arr3[k]+ " ");
        }


    }
}
