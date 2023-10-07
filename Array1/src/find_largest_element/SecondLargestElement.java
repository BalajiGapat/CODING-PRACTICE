package find_largest_element;

import java.util.Arrays;

public class SecondLargestElement 
{
	public static int[] secondLargest(int arr[])
	{
		int i1;
		int i2;
		int max1;
		int max2;
		if(arr[0]>arr[1])
		{
			max1=arr[0]; i1=0;
			max2=arr[1]; i2=1;
		}
		else
		{
			max1=arr[1]; i1=1;
			max2=arr[0]; i2=0;
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(max1<arr[i])
			{
				max2=max1;  i2=i1;
				max1=arr[i]; i1=i;
			}
			else if(max2<arr[i] && max1>arr[i])
			{
				max2=arr[i]; i2=i;
			}
		}
		
		
		//return new int[] {max1, max2};
		return new int[] {i1, i2};  // index returning
	}
	
	
	public static void main(String[] args) 
	{
		int arr[]=new int[] {33312,65,33,88,949,22,998};
		System.out.println("ans : "+Arrays.toString(secondLargest(arr)));
	}
	
	
}
