package array;
import java.util.Scanner;

public class InsertAtPosotionOverride 
{
	public static String name="Balaji";
	public static Scanner sc=new Scanner(System.in);

	public static  boolean insertAtPosition(int[] arr, int value, int pos)
	{
		if(pos<arr.length) 
		{
			arr[pos-1]=value;
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) 
	{
		//System.out.println("Name : "+name);
		
		System.out.println("Enter Array size : ");
		int[] arr=new int[sc.nextInt()];
		
		//populate array 
		System.out.println("Enter array Elelments : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		//printing Array elements by forEach loop
		System.out.print("Array elements Are : ");
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		
		System.out.println("isInsertend : "+insertAtPosition(arr, 999, 13));
		
		//printing Array elements by forEach loop
		System.out.print("Array elements Are : ");
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
	} 
}
 