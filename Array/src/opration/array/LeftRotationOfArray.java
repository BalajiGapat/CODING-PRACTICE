package opration.array;

import java.util.Arrays;

public class LeftRotationOfArray 
{
	public static void leftRotationByOne(int[] arr)
	{
		int cnt=0;
		int temp=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[cnt++]=arr[i];
		}
		arr[cnt]=temp;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {11,33,25,22,5,44,5,66,45,5,99,14};
		System.out.println("Before : "+Arrays.toString(arr));
		leftRotationByOne(arr);
		System.out.println("Before : "+Arrays.toString(arr));
		
	}
}
