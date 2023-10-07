package sumofnumbers;

public class sumOfNumbersByRecursion 
{
	public static int sum(int n)
	{
		if(n==1)
			return 1;
		return n+sum(n-1);
	}
	
	
	public static void main(String...str)
	{
		System.out.println("sum of first "+10+" numbers : "+sum(10));
	}
}
