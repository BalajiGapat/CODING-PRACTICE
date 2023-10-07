package reverse_array;

import java.util.Arrays;

public class ReverseArray 
{
	public static void reverse(int arr[])
	{
		//int cnt=arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
			//int temp=arr[i];
			//arr[i]=arr[cnt];
			//arr[cnt]=temp;
			//cnt--;	
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {11,22,33,44,55,66,77,88,99};
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));
	}
}
