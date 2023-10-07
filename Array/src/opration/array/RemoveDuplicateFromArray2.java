package opration.array;

import java.util.Arrays;

public class RemoveDuplicateFromArray2 
{
	public static int[] remDup(int[] arr)
	{
		int temp[]=new int[arr.length];
		int cnt=0;
		temp[cnt]=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(temp[cnt]!=arr[i])
			{
				temp[++cnt]=arr[i];
			}
		}
		//System.out.println("in method : "+Arrays.toString(temp));
		arr=temp;
		temp=null;
		return arr;
	}
	
	
	public static void main(String[] args) 
	{
		//int[] arr= {99,77,88,666,55,33,44,22,11,33,44,66,88,22,55,77};
		int[] arr= {11,22,22,33,33,33,33,33,33,33,44,55,55,66,66,77,88,88,99,99};
		Arrays.sort(arr);
		System.out.println("before duplicate removal : "+Arrays.toString(arr));	
		arr=remDup(arr);
		System.out.println("before duplicate removal : "+Arrays.toString(arr));	
		
		
		
		
		
		
		
		
		
		
//		int temp[]=new int[arr.length];
//		int cnt=0;
//		temp[cnt]=arr[0];
//		for(int i=1;i<arr.length;i++)
//		{
//			if(temp[cnt]!=arr[i])
//			{
//				temp[++cnt]=arr[i];
//			}
//		}
//		arr=temp;
//		temp=null;
//		System.out.println("arr array : "+Arrays.toString(arr));	
	}
}
