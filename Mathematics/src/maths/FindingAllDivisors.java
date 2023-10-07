package maths;

import java.util.Arrays;
import java.util.Scanner;

public class FindingAllDivisors 
{
	public static void findDivisors(int n)
	{
		int[] arr=new int[n];
		int cnt=0;
		
		for(int i=1;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				arr[cnt++]=i;
				if(i!=n/i)
				{	
					System.out.print(n/i+" ");
					arr[cnt++]=n/i;
				}
				
				
				
//				if(i==n/i)
//				{
//					System.out.print(i+" ");
//					arr[cnt++]=i;
//				}
//				else
//				{
//					System.out.print(i+" "+n/i+" ");
//					arr[cnt++]=i;
//					arr[cnt++]=n/i;
//				}
				
			}
		}
		
		Arrays.sort(arr);
		System.out.println("\nfrom Array");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)   // (arr[i]==0 || arr[i-1]==arr[i])
				continue;
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 : ");
		int n1 = sc.nextInt();
		findDivisors(n1);
	}
}
