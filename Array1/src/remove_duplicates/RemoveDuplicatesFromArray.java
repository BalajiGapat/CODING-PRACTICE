package remove_duplicates;

import java.util.Arrays;

public class RemoveDuplicatesFromArray 
{
	public static int[] removeDuplicates(int arr[])
	{
		Arrays.sort(arr);  //arr is sorted array
		
		int cnt=0;
		int i;
		for(i=0;i<arr.length-1;i++)	
		{
			if(arr[i]!=arr[i+1])
			{
				arr[cnt++]=arr[i];
			}
		}
		arr[cnt++]=arr[i];
		
		while(cnt<arr.length)
		{
			arr[cnt++]=0;
		}
		
		return arr;
	}
	
	public static void main(String[] args) 
	{
		int arr[]=new int[] {11,22,33,44,55,11,66,77,11,88,11,99,99,-99,-99};
		System.out.println(Arrays.toString(arr));
		arr=removeDuplicates(arr);
		System.out.println(Arrays.toString(arr));
	}
}
