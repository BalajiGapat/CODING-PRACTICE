package maths;

import java.util.Scanner;

public class HCF 
{
	static Scanner sc=new Scanner(System.in);
	
	
	static int gcd(int a, int b)
	{
		if(b==0)
			return a;

		return gcd(b, a % b);
	}
	
	
	//
	static int hcf(int n1, int n2)
	{
		n1=Math.abs(n1);
		n2=Math.abs(n2);
		
		while(n1!=n2)
		{
			if(n1>n2)
				n1=n1-n2;
			else
				n2=n2-n1;
		}
		return n1; //Or n2;
	}
	//time complexity = O(log(min(n1, n2)))
	
	/*
	static int hcf(int n1, int n2)
	{
		n1=Math.abs(n1);
		n2=Math.abs(n2);
		
		if(n1==0 || n2==0)
			return Math.max(n1, n2);
		
		if(n1==n2)
			return n1;
		
		if(n1>n2)
			for(int i=n2;i>=1;i--)
				if(n1%i==0 && n2%i==0)
					return i;
		if(n1<n2)
			for(int i=n1;i>=1;i--)
				if(n1%i==0 && n2%i==0)
					return i;
	
		return 11;
	}
	//time complexity=O(min(n1, n2))
	*/
	
	
	public static void main(String[] args) 
	{
		System.out.println("enter num1 : ");
		int n1=sc.nextInt();
		System.out.println("enter num1 : ");
		int n2=sc.nextInt();
		System.out.println("HFC : "+hcf(n1, n2));
		System.out.println("gcd : "+gcd(n1, n2));
		
	}
}
