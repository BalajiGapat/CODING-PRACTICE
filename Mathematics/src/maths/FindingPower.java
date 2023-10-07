package maths;

import java.util.Scanner;

public class FindingPower 
{
	static int power(int a, int n)
	{
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*a;
		}
		return ans;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a : ");
		int a = sc.nextInt();
		System.out.println("enter n : ");
		int n = sc.nextInt();
		
		System.out.println("ans "+power(a, n));
		
//		int ans=(int)Math.pow((double)a, (double)n);
//		System.out.println("ans : "+ans);
		
		
		
	}
}
