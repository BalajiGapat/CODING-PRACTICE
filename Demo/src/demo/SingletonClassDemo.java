package demo;

class Singleton
{
	private static Singleton obj;
	
	private Singleton() 
	{
		
	}
	
	public static Singleton creatObject() //factory method
	{
		if(obj==null)
			obj=new Singleton();
		
		return obj;
	}
	
}


public class SingletonClassDemo 
{
	public static void main(String[] args) 
	{
		Singleton obj= Singleton.creatObject();
		Singleton obj1= Singleton.creatObject();
		Singleton obj2= Singleton.creatObject();
		
		System.out.println(obj);  // demo.Singleton@6f75e721 
		System.out.println(obj1); // demo.Singleton@6f75e721 
		System.out.println(obj2); // demo.Singleton@6f75e721 
	}
}
