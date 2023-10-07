package maths;

import java.util.Scanner;

public class FindingAllDivisorss 
{
	//unsorted ans
	public static void findD(int n)
	{
		for(int i=1;i<= (int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				
				if(i!=n/i)
					System.out.print(n/i+" ");
			}
		}
	}
	
	
	//sorted ans
	public static void findDivisors(int n) //50
	{
		int i;
		for(i=1;i*i<n;i++)  // i=1 2 3 4 5 6 7
		{
			if(n%i==0)
				System.out.print(i+" "); //1 2 5 
		}
		for( ; i>=1 ; i--) //8 7 6 5 4 3 2 1
		{
			if(n%i==0)
				System.out.print(n/i+" "); // 10 25 50
		}
	}
	
	//time complexity=O(sqrt(n))
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 : ");
		int n1 = sc.nextInt();
		//findDivisors(n1);
		findD(n1);
	}
}
