package demo;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray 
{
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		final int num=20;
		//static int num2=33;//Illegal modifier for parameter num2; only final is permitted
		
		int[][] jaggedArray=new int[3][];
		
		jaggedArray[0]=new int[2];
		jaggedArray[1]=new int[3];
		jaggedArray[2]=new int[4];
		
		
		for(int i=0;i<jaggedArray.length;i++)
		{
			for(int j=0;j<jaggedArray[i].length;j++)
			{
				System.out.print("arr["+i+"]["+j+"]=");
				jaggedArray[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("jaggerd Array : "+Arrays.toString(jaggedArray[0]));
		System.out.println("jaggerd Array : "+Arrays.toString(jaggedArray[1]));
		System.out.println("jaggerd Array : "+Arrays.toString(jaggedArray[2]));
	}
}
