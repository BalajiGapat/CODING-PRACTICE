package demo;
import java.util.Arrays;

//not recommended
public class FindLargestElement 
{
	public static int findLargestElement(int[] arr1)
	{
		int[] arr=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
		
		//int[] arr=Arrays.copyOf(arr1, arr1.length);
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i+1]; //33
				arr[i+1]=arr[i]; //77
				arr[i]=temp; //33
			}
		}
		return arr[arr.length-1];
	}
	
	public static void main(String[] args) 
	{
		int[] arr=new int[] {77,33,88,00,55,22,66,44,99,11};
		System.out.println("Before : "+Arrays.toString(arr));	
		System.out.println("largest elements : "+findLargestElement(arr));
		System.out.println("After : "+Arrays.toString(arr));
	}
}
