package maths;

import java.util.Scanner;

public class CountDigits 
{
	static Scanner sc=new Scanner(System.in);
	
	static int[] countDigits(int num)
	{
		int res=0;
		int temp=0;
		int sum=0;
		while(num!=0)
		{
			temp=num%10;
			sum=sum+temp;
			num=num/10;
			res++;
		}
		return new int[] {sum, res};
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("enter  num : ");
		int num=sc.nextInt();
		int[] arr=countDigits(num);
		System.out.println("digit sum :"+arr[0]);
		System.out.println("No of digits :"+arr[1]);
	}
	
}



/*
public class CountDigits 
{
	public static int countDigits(int num)
	{
		int cnt=0;
		for(int i=0;num!=0;i++)
		{
			num=num/10;
			cnt++;
		}
		return cnt;
	}
	
	
	 public static void main(String args[])
	 {
		 int num=-12365444;
		 System.out.println("digits : "+countDigits(num));
	 }
}
*/
