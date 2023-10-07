package demo;

class StaticVariable
{
	public static int num=1222;
	public String name;
	
	public void method()
	{
		System.out.println(this.num); // no error
	}
}
public class StaticDemo
{
	 public static void main(String[] args) 
	 {
		 StaticVariable obj1=null;
		 System.out.println(obj1.num);    // No exception
		 //System.out.println(this.num);  // Cannot use this in a static context
		 //System.out.println(obj1.name); // java.lang.NullPointerException
		 
		 StaticVariable obj2=new StaticVariable();
		 obj2.method();
	}
}
 