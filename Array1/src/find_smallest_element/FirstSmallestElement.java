package find_smallest_element;

public  class FirstSmallestElement 
{
	public static int smallestElement(int[] arr)
	{
		int index=0;
		int min=arr[index];
		
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				index=i;
			}
		}
		
		//return min;
		return index;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {-612,43,65,22,6677,44,99,13,-867};
		
		System.out.println("smallest element is at index : "+smallestElement(arr));
	}
}
