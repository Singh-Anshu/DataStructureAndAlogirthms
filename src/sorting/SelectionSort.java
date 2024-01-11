package sorting;

public class SelectionSort {
	
	// Bubble sort
	
	public static int[] bubbleSort(int arr[])
	{
		int n= arr.length;
		
		for(int i =0; i< n-1; i++)
		{
			for(int j =0; j< n-i-1; j++ )
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
		return arr;
	}
	
	public static int[] selectionSort(int arr[])
	{
		// Time Complexcity is O(n^2)
		
		int n = arr.length;
		for(int i=0; i < n-1; i++)
		{
			int smallest =i;	
			
			for(int j=i+1; j<n; j++)
			{
				if(arr[j] < arr[smallest])
				{
					smallest = j;
				} 
			}
			
			int temp= arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			
		}
		
		return arr;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,4,3,7,6,9,13,1,5,17,8,20,10,11};
		arr = selectionSort(arr);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] +" ");
		}
	}

}
