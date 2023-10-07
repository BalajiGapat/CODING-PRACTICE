package array;

import java.util.Arrays;

public class InsertAtPosition 
{	
	public static String insert(int[] arr, int pos, int ele) //pos=5
	{
		if(arr[arr.length-1]!=0)
			return "Array capacity is full...";
		
		int i=0;
		while(arr[i]!=0) //i=7
			i++;
		      
		while(pos-1<i) //pos-1=5-1=4 and i=7 6 5 
		{	
			arr[i]=arr[i-1];
			i--;
		}
		arr[i]=ele;
		
		return "Element Added at index="+i+" i.e at position="+(i+1);
	}
	
	public static void main(String[] args) 
	{
		int arr[]=new int[10];
		arr[0]=11; arr[1]=22; arr[2]=33; arr[3]=44; 
		arr[4]=55; arr[5]=66; arr[6]=77;
		
		String msg=insert(arr, 5, 4444);
		System.out.println(msg);
		
		System.out.println("array elements : "+Arrays.toString(arr));
	}
	
}
