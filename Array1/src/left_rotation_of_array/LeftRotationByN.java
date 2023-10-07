package left_rotation_of_array;

import java.util.Arrays;

public class LeftRotationByN 
{
	public static void leftRotationByN(int[]arr, int pos)
	{
		int temp[]=new int[pos];
		for(int i=0;i<pos;i++)
		{
			temp[i]=arr[i];
		}
		
		int cnt=0;
		for(int i=pos;i<arr.length;i++)
		{
			arr[cnt++]=arr[i];
		}
		
		for(int i=0;i<pos;i++) //pos or temp.length
		{
			arr[cnt++]=temp[i];
		}
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr= {11,33,25,22,44,55,66,45,99,14};
		System.out.println("Before : "+Arrays.toString(arr));
		leftRotationByN(arr, 3);
		System.out.println("Before : "+Arrays.toString(arr));
	}
}
