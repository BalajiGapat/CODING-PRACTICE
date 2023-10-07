package maths;
import java.util.Scanner;
public class TwoArraySum 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter row1 size : ");
		int r1=sc.nextInt();
		
		System.out.println("Enter col1 size : ");
		int c1=sc.nextInt();
		
		int[][] arr1=new int[r1][c1];
		
		System.out.println("Enter Array1 Elements : ");
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
				arr1[i][j]=sc.nextInt();
		
		System.out.println("Array1 Elements are : ");
		for(int i[] : arr1)
		{
			for(int j : i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		
		//    ////
		
		System.out.println("Enter row2 size : ");
		int r2=sc.nextInt();
		
		System.out.println("Enter col2 size : ");
		int c2=sc.nextInt();
		
		int[][] arr2=new int[r2][c2];
		
		System.out.println("Enter Array2 Elements : ");
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
				arr2[i][j]=sc.nextInt();
		
		System.out.println("Array2 Elements are : ");
		for(int i[] : arr2)
		{
			for(int j : i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		
		int[][] arr3=new int[r1][c1];
		
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
				arr3[i][j]=arr1[i][j]+arr2[i][j];
		
		System.out.println("Array3 Elements are : ");
		for(int a[] : arr3)
			for(int i : a)
				System.out.print(i+"\t");
		
	}
}
