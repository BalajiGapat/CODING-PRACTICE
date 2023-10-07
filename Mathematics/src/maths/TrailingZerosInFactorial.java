package maths;
import java.util.Scanner;
public class TrailingZerosInFactorial 
{
	static Scanner sc=new Scanner(System.in);
	
	static int trailingZeros(int num)
	{
		int cnt=0;
		while(num/5!=0)
		{
			cnt=cnt+num/5;
			num=num/5;
		}
		return cnt;
	}
	//time complexcity=O(log n to the base 5)

	/*
	
	static int trailingZeros(int num)
	{
		int cnt=0;
		for(int i=5;(num/i)!=0;i=i*5) //condition may be i<=num
		{
			cnt=cnt+num/i;
		}
		return cnt;
	}
	//time complexcity=O(log n to the base 5)
	
	*/
	
	
	
	
	/*
	static int trailingZeros(int num)
	{
		int fact=1;
		for(int i=2;i<=num;i++)
		{
			fact=fact*i;
		}
		
		int cnt=0;
		while(fact%10==0)
		{
			fact=fact/10;
			cnt++;
		}
		return cnt;
	}
	// when int values overflows it does not work
	*/
	
	public static void main(String[] args)
	{
		System.out.println("Enter num : ");
		int num=sc.nextInt();
		System.out.println("number of zeros : "+trailingZeros(num));
		
	}
}
