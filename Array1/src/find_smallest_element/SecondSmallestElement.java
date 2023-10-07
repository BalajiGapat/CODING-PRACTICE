package find_smallest_element;

import java.util.Arrays;

public class SecondSmallestElement 
{
	public static int[] secondSmallest(int arr[])
	{
		int i1;
		int i2;
		int min1;
		int min2;
		if(arr[0]>arr[1])
		{
			min1=arr[0]; i1=0;
			min2=arr[1]; i2=1;
		}
		else
		{
			min1=arr[1]; i1=1;
			min2=arr[0]; i2=0;
		}
		
		for(int i=2;i<arr.length;i++)
		{
			if(min1>arr[i])
			{
				min2=min1;  i2=i1;
				min1=arr[i]; i1=i;
			}
			else if(min2>arr[i] && min1<arr[i])
			{
				min2=arr[i]; i2=i;
			}
		}
		
		
		//return new int[] {min1, min2};
		return new int[] {i1, i2};  // index returning
	}
	
	
	public static void main(String[] args) 
	{
		int arr[]=new int[] {33312,65,33,88,949,22,-998};
		System.out.println("ans : "+Arrays.toString(secondSmallest(arr)));
	}
	
	
}
