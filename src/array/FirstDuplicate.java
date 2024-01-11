package array;

import java.util.HashSet;

public class FirstDuplicate 
{	
	public static void main(String[] args)
	{	// TODO Auto-generated method stub
		int arr[] = {4,5,3,6,7,8,2,2};	
		int temp =-1;
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=arr.length-1; i >=0; i--)
		{
			if(hs.contains(arr[i]))
			{
				temp = i;
			}
			else {
			hs.add(arr[i]);
			}
			
		}
		
		if(temp != -1)
		{
			System.out.println("first element found " + arr[temp]);
		}
		else {
			System.out.println("element not found in the array");
		}
	}
   
}
