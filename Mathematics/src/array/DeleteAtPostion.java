package array;

import java.util.Arrays;

public class DeleteAtPostion 
{
	public static void deleteAtPos(int arr[], int pos) //pos=5
	{
		int i=pos-1;//5-1=4
		
		while((arr.length-1)!=i) //length=10-1=9 and i=4 
		{
			arr[i]=arr[i+1];
			i++;
		}
		
		arr[i]=0;

	}
	
	public static void main(String[] args) 
	{
		int[] arr=new int[] {11,0,33,44,55,66,77,0,99,100};
		System.out.print("before deletion : ");
		System.out.println(Arrays.toString(arr)+"\n");
		
		deleteAtPos(arr, 1);
		System.out.println("after deletion : "+Arrays.toString(arr));
		
		System.out.println();
		deleteAtPos(arr, 4);
		System.out.println("after deletion : "+Arrays.toString(arr));
		
		System.out.println();
		deleteAtPos(arr, 6);
		System.out.println("after deletion : "+Arrays.toString(arr));
		
		System.out.println();
		deleteAtPos(arr, 6);
		System.out.println("after deletion : "+Arrays.toString(arr));
		
		System.out.println();
		deleteAtPos(arr, 1);
		System.out.println("after deletion : "+Arrays.toString(arr));
		
		Math.pow(12,9);
	}
	
	
	
	
}
