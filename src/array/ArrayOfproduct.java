package array;

public class ArrayOfproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,1,4,2};
		
		int sol[] = new int[arr.length];
		
		int totalsum=1;
		
		for(int i=0; i<arr.length; i++)
		{
			totalsum=arr[i]*totalsum;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			sol[i]= totalsum / arr[i];
		}
		
		for(int i=0; i<sol.length; i++)
		{
			System.out.print(sol[i]+ " ");
		}

	}

}
