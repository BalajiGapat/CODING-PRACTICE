package search_array_element;

import java.util.Arrays;

public class SearchArrayElement 
{
	public static int searchElement(int arr[], int ele)
	{
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]==ele)
			{
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {33,11,22,66,55,44,77,89};
		
		System.out.println("array element is at index : "+searchElement(arr, 774));
		
		
		
		//Arrays.sort(arr);
		//System.out.println("sorted Array : "+Arrays.toString(arr));
		//int index=Arrays.binarySearch(arr, 44);
		//System.out.println("Element is at index : "+index);
	}
}
