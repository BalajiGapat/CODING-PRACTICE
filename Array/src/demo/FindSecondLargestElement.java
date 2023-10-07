package demo;

import java.util.Arrays;

// only for distinct array elements
public class FindSecondLargestElement {
	public static int secondLargestElementIndex(int[] arr1) {
		int[] arr = Arrays.copyOf(arr1, arr1.length);
		// System.out.println("before sorting : " + Arrays.toString(arr1));

		// Arrays.sort(arr);

		// selection sort
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//System.out.println("sorted Array arr1[] : " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr1[i] == arr[1])
				return i;
		}
		
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 33, 888, 10, 55, 22, 777, 66, 44, 99, 11 };
		System.out.println("In main() arr[] : " + Arrays.toString(arr));
		int secLargestIndex = secondLargestElementIndex(arr);
		System.out.println("index of second largest elements: " + secLargestIndex);
	}
}
