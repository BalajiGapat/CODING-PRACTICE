package demo;
class A
{
	private int num1;
	private static int num2=100;
	
	public A() {
		
	}
	
	public A(int num1)
	{
		this.num1=num1;
	}
	
	static
	{
		num2=155;
	}
}

public class Demo4 
{
	public static void main(String[] args) {
		A var=new A(12);
		System.out.println("hii pratap...");
	}
}
