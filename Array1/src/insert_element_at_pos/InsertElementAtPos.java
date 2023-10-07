package insert_element_at_pos;

import java.util.Arrays;

public class InsertElementAtPos 
{
	public static String insertAtPos(int[] arr, int pos, int value)
	{
		if(arr[arr.length-1]!=0)
			return "Array is Full...";
		
		for(int i=arr.length-1;pos<=i;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos-1]=value;
		return " ";
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {11,33,44,55,77,66,54,88, 0,0,0,0,0};
		System.out.println(Arrays.toString(arr));
		
		insertAtPos(arr, 4, 777);
		System.out.println(Arrays.toString(arr));
		
		insertAtPos(arr, 7, -999);
		System.out.println(Arrays.toString(arr));
		
		insertAtPos(arr, 12, 111);
		System.out.println(Arrays.toString(arr));
	
		
	}
}
