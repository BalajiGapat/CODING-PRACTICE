package demo;

import java.util.Arrays;

//not recommended
public class FindSmallestElement 
{
	public static int findsmallestElement(int[] arr1)
	{
		int[] arr=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
		//int[] arr=Arrays.copyOf(arr1, arr1.length);
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				int temp=arr[i+1]; 
				arr[i+1]=arr[i]; 
				arr[i]=temp; 
			}
		}
		return arr[arr.length-1];
	}
	
	
	//Driver code
	public static void main(String[] args) 
	{
		int[] arr=new int[] {77,33,88,00,-55,22,66,44,99,11};
		System.out.println("Before : "+Arrays.toString(arr));	
		System.out.println("smallest elements : "+findsmallestElement(arr));
		System.out.println("After : "+Arrays.toString(arr));
	}
}
