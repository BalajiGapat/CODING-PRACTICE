package opration.array;

import java.util.Arrays;

public class RemoveDuplicateFromArray 
{
	
	
	public static void main(String[] args) 
	{
		int[] arr= {99,77,88,666,55,33,44,22,11,33,44,66,88,22,55,77};
		//int[] arr= {11,22,22,33,33,33,33,33,33,33,44,55,55,66,66,77,88,88,99,99,99,99,99};
		Arrays.sort(arr);
		System.out.println("after sort : "+Arrays.toString(arr));
		
		int[] arr1=new int[arr.length];
		int cnt=0;
		int i;
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
				continue;
			arr1[cnt++]=arr[i];
		}
		arr1[cnt++]=arr[i];
		
		//System.out.println("arr1 : "+Arrays.toString(arr1));
		arr=arr1;
		arr1=null;
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("arr1 : "+Arrays.toString(arr1));
		
	}
}
