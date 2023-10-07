package demo;

public class Demo1 
{
	public void disply()
	{
		System.out.println(" in display");
	}
	
	public void print()
	{
		System.out.println("in print");
		disply();
	}
	
	 public static long factorial(long N) 
	    {
	        // long fact=1;
	        // for(int i=1;i<=N;i++)
	        // {
	        //     fact=fact*i;
	        // }
	        // return fact;
	        
	        if(N==1)
	            return 1;
	        return N*factorial(N-1);
	    }
	
	public static void main(String[] args) 
	{
		Demo1 d=new Demo1();
		//d.print();
		
		System.out.println(factorial(7));
		
	}
}
		