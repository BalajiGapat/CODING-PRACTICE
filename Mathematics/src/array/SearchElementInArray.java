package array;

public class SearchElementInArray 
{
	public static int searchElement(int[] arr, int key) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] == key)
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr = { 1, 5, 2, 3, 7, 8, 4, 9, 0, 6 };

		System.out.println("found at index : " + searchElement(arr, 12));

//		Arrays.sort(arr);
//		System.out.println("sortede Array : "+Arrays.toString(arr));
//		int bs=Arrays.binarySearch(arr, 4);
//		System.out.println("bs : "+bs);
		
	}
}
