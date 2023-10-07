package demo;

class Test1
{
	
}

public class HashCodeAndToString
{
	public static int num=123;
	
	public static void main(String[] args) 
	{
		Test1 obj=new Test1();
		System.out.println("obj : "+obj.toString());
		System.out.println("obj : "+obj);           //  hexadecimal = decimal 
		System.out.println("obj : "+obj.hashCode());//     6F75E721 = 1869997857
		System.out.println("getClass() :: "+obj.getClass()); // class demo.Test
		System.out.println("getClass() :: "+obj.getClass().getName()); // demo.Test
	}
}
