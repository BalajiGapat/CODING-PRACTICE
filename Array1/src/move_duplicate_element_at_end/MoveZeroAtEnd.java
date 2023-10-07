package move_duplicate_element_at_end;

import java.util.Arrays;

public class MoveZeroAtEnd 
{
	public static void moveZeroAtEnd(int[] arr)
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				arr[cnt++]=arr[i];
		}
		while(cnt<arr.length)
		{
			arr[cnt++]=0;
		}
		
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {11,22,33,0,44,0,0,99,-11,34};
		System.out.println(Arrays.toString(arr));
		moveZeroAtEnd(arr);
		System.out.println(Arrays.toString(arr));
	}
}
