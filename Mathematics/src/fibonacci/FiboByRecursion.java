package fibonacci;

public class FiboByRecursion 
{
	//0 1 2 3 5 8 13 21 34
	public static int fibo(int n) //here assume fibo series start from 0th position 
	{
		if(n==0 || n==1)
			return n;
		return fibo(n-1)+fibo(n-2);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println(fibo(9));
	}
}
