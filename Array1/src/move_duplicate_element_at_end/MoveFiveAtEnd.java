package move_duplicate_element_at_end;

import java.util.Arrays;

public class MoveFiveAtEnd
{
	public static void moveZeroAtEnd(int[] arr)
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=5)
				arr[cnt++]=arr[i];
		}
		
		while(cnt<arr.length)
		{
			arr[cnt++]=5;
		}
		
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {11,22,5,5,77,5,88,5,55,99,0,0};
		System.out.println(Arrays.toString(arr));
		moveZeroAtEnd(arr);
		System.out.println(Arrays.toString(arr));
	}
}
