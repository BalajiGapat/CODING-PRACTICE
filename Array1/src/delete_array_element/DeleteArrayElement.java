package delete_array_element;

import java.util.Arrays;

public class DeleteArrayElement 
{
	public static void deleteElementAtPos(int[] arr, int pos)
	{
		int i;
		if(arr.length==pos)
		{
			arr[arr.length-1]=0;
			return;
		}
		
		for(i=pos-1;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=0;
	}
	
	public static void main(String[] args) 
	{
		int arr[]=new int[] {12,43,66,77,44,99};
		deleteElementAtPos(arr, 6);
		deleteElementAtPos(arr, 5);
		deleteElementAtPos(arr, 2);
		System.out.println(Arrays.toString(arr));
		
	}
}
