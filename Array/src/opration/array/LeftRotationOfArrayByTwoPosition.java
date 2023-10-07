package opration.array;

import java.util.Arrays;

public class LeftRotationOfArrayByTwoPosition 
{
	public static void leftRotationByTwo(int[] arr)
	{
		int cnt=0;
		int temp0=arr[0];
		int temp1=arr[1];
		for(int i=2;i<arr.length;i++)
		{
			arr[cnt++]=arr[i];
		}
		arr[cnt++]=temp0;
		arr[cnt]=temp1;
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {11,33,25,22,5,44,5,66,45,5,99,14};
		System.out.println("Before : "+Arrays.toString(arr));
		leftRotationByTwo(arr);
		System.out.println("Before : "+Arrays.toString(arr));
		
	}
}
