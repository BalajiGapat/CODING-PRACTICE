package find_largest_element;

public  class FirstLargestElement 
{
	public static int largestElement(int[] arr)
	{
		int index=0;
		int max=arr[index];
		
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
				index=i;
			}
		}
		
		//return max;
		return index;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {12,43,65,22,6677,44,99,13,867};
		
		System.out.println("largest element is at index : "+largestElement(arr));
	}
}
