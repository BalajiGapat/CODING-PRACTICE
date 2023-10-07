package is_array_sorted;

public class IsArraySorted 
{
	public static boolean isSorted(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) 
	{
		int arr[] = {11,55,33,22,11,66,77,99,33,77,99,88};
		//int arr[]=new int[] {11,11,11,11,22,22,22,22,33,44,55,66,77,88,99};
		//int arr[]= {11};
		//int arr[]= {11,11,11};
		
		System.out.println("is Sorted : "+isSorted(arr));
	}
}
