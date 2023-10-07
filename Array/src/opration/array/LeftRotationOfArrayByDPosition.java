package opration.array;

import java.util.Arrays;

public class LeftRotationOfArrayByDPosition 
{
	public static void leftRotationByD(int[] arr, int D)
	{
		int[] temp=new int[D];
		
		for(int i=0;i<D;i++) //D=4
		{
			temp[i]=arr[i];
		}
	
		int cnt=0;
		for(int i=D;i<arr.length;i++) // d=4 and i=4 5 6 7 8 9
		{
			arr[cnt++]=arr[i];   //cnt=0 1 2 3 4 5
		}
		
		for(int i=0;i<temp.length;i++)
		{
			arr[cnt++]=temp[i];  //cnt=6 7 8 9
		}
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {11,33,25,22,5,44,5,66,45,5,99,14};
		System.out.println("Before : "+Arrays.toString(arr));
		leftRotationByD(arr, 7);
		System.out.println("Before : "+Arrays.toString(arr));
	}
}
