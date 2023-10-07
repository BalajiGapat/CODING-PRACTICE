package demo;

class Parent
{
	public static void methodOne() 
	{
		System.out.println("in parent class");
	}
}
public class Child extends Parent 
{
	// Method Hiding >> this hide parent class method 
	public static void methodOne() 
	{
		System.out.println("in child class");
	}
	
	public static void main(String[] args) 
	{
		Parent obj=new Child(); // static 
		obj.methodOne();
		
		Parent.methodOne();
		Child.methodOne();
	}
}




