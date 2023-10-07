package creating_deep_copy_of_array;

import java.util.Arrays;

public class DeepCopyOfArray 
{
	public static void deepCopy(int[]arr)
	{
		int[] temp1=Arrays.copyOf(arr,  arr.length);
		System.out.println("temp1[] : "+Arrays.toString(temp1));
		
		int[] temp2=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			temp2[i]=arr[i];
		}
		System.out.println("temp2[] : "+Arrays.toString(temp1));
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {11,32,66,77,88,99,44,33,77,33};
		deepCopy(arr);
	}
}
