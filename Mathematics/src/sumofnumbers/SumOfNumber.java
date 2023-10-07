package sumofnumbers;
import java.util.Scanner;
public class SumOfNumber 
{
	public static int sum1(int n)
	{
		return n*(n+1)/2;
	}
	
	
	public static int sum2(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
	
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num : ");
		int num=sc.nextInt();
		System.out.println("sum of first "+num+" natural number : "+sum1(num));
		System.out.println("sum of first "+num+" natural number : "+sum2(num));
	}

}
