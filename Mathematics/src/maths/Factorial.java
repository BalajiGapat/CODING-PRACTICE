package maths;
import java.util.Scanner;

public class Factorial 
{
	static Scanner sc=new Scanner(System.in);
	
	static int factorial(int num)
	{
		if(num==1)
			return 1;
		return num*factorial(num-1);
	}
	//time complexity = O(n)
	
	
	
	
	/*
	static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++) //OR int i=2
		{
			fact=fact*i;
		}
		return fact;
	}
	//time complexity = O(n)
	*/
	public static void main(String[] args)
	{
		System.out.println("enter num  :");
		int num=sc.nextInt();
		System.out.println("factorial : "+factorial(num));
		
	}
}
