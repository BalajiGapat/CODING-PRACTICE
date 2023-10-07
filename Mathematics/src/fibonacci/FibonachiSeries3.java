package fibonacci;

import java.util.Arrays;

public class FibonachiSeries3 
{
	//0 1 1 2 3 5 8 13 21
	public static void fibo(int pos) //5
	{
		int n1=0;
		int n2=1;
		int i=0;
		int sum=0;
		while(i++<pos)
		{
			System.out.print(n1+" ");
			sum=sum+n1;
			int temp=n1+n2;
			n1=n2;
			n2=temp;
		}
		System.out.println("\nsum of first "+pos+" terms of fibonacci series : "+sum);
		
	}
	
	public static void main(String[] args) 
	{
		fibo(6);
	}
}
