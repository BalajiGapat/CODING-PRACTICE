package fibonacci;

public class FibonachiSeriesByRecursion 
{
	//0 1 1 2 3 5 8 13 21
	public static int n1=0;
	public static int n2=1;
	public static long sum=0;
	public static void fibo(int pos)//5 4 
	{
		
		if(0<pos)//5 4
		{
			System.out.print(n1+" ");//0 1
			sum=sum+n1;
			int temp=n1+n2;//1 2
			n1=n2; //1 1
			n2=temp;//1 2
			fibo(pos-1); //4 3
		}
	}
	
	
	public static void main(String[] args) 
	{
		fibo(8);
		System.out.println("\nsum : "+sum);
	}
}
