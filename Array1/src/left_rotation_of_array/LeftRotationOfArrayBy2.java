package left_rotation_of_array;

import java.util.Arrays;

public class LeftRotationOfArrayBy2 
{
	public static void leftRotationBy2(int[] arr)
	{
		int n1=arr[0];
		int n2=arr[1];
		int cnt=0;
		for(int i=2;i<arr.length;i++)
		{
			arr[cnt++]=arr[i];
		}
		arr[cnt++]=n1;
		arr[cnt]=n2;
	}
	
	public static void main(String[] args) 
	{
		int arr[]=new int[] {11,22,33,44,55,66,77};
		System.out.println(Arrays.toString(arr));
		leftRotationBy2(arr);
		System.out.println(Arrays.toString(arr));
	}
}
