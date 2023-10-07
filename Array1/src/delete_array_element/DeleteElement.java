package delete_array_element;

import java.util.Arrays;

public class DeleteElement 
{
	public static void deleteElement(int[] arr, int ele)
	{
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]==ele)
				break;
			i++;
		}
		
		while(i<arr.length-1) 
		{
			arr[i]=arr[i+1];
			i++;
		}
		arr[i]=0;
	}
	
	public static void main(String[] args) 
	{
		int[] arr=new int[9];
		arr[0]=11; arr[1]=22; arr[2]=33; 
		arr[3]=44; arr[4]=0; arr[5]=66;
		arr[6]=77; arr[7]=88; arr[8]=99;
		
		System.out.println("Before deletion : "+Arrays.toString(arr));
		deleteElement(arr, 33);
		System.out.println("After deletion : "+Arrays.toString(arr));
		
		deleteElement(arr, 77);
		System.out.println("After deletion : "+Arrays.toString(arr));
		
		deleteElement(arr, 11);
		System.out.println("After deletion : "+Arrays.toString(arr));
		
		deleteElement(arr, 99);
		System.out.println("After deletion : "+Arrays.toString(arr));
		
		deleteElement(arr, 0);
		System.out.println("After deletion : "+Arrays.toString(arr));
		
		deleteElement(arr, 0);
		System.out.println("After deletion : "+Arrays.toString(arr));
		
		deleteElement(arr, 0);
		System.out.println("After deletion : "+Arrays.toString(arr));
	}
}
