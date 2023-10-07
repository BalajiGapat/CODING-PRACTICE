package maths;
import  java.util.Scanner;
import static java.lang.System.in;

public class Palindrom 
{
	
	//static Scanner sc=new Scanner(System.in);
	public static Scanner sc=new Scanner(in);
	
	
	/*
	static boolean palindrom(int num)
	{
		String str=String.valueOf(num);
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		str=new String(sb);
		int temp=Integer.parseInt(str);
		if(num==temp)
			return true;
		return false;
	}
	*/
	
	
	static boolean palindrom(int num)
	{
		//num=2345
		int n=num;
		int rev=0;
		int temp=0;
		while(num!=0)
		{
			temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		return n==rev;
	}
	
	//driver method
	public static void main(String[] args)
	{
		System.out.println("Enter num : ");
		int num=sc.nextInt();
		System.out.println("is palondrom : "+palindrom(num));
	}
}
;