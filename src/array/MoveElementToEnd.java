package array;
import java.util.*;

public class MoveElementToEnd {
	
	static int[] moveElementsToEnd(int arr[], int value)
	{
		int i ,j;
		i=0;
		j = arr.length-1;
		
		
		
		while( i < j)
		{
			while(arr[j] == value)
			{
				j--;
			}
			
			if(arr[i] == value)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
				 i++;
				 j--;
			}
			else
				i++;
		}
		
//		if(value != arr[i])
//		{
//			System.out.println("value is not in array");
//		}
//		else {
		for(int k=0; k< arr.length; k++)
		{
			System.out.print(arr[k]+ " ");
		}
		//}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {0,-4,-4, -2,1,3,4,4,4,2,5,4,6,7,8,9,10};
		moveElementsToEnd(arr, 4);
		
		}

	}


