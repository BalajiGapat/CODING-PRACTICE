package demo;

public class CreatingObjectByClone implements Cloneable
{
	public int n1;
	public static int  balance;
	public final static int IFSC;
	
	
	static
	{
		IFSC=23;
	}
	
	public void display()
	{
		System.out.println("in display ......");
	}
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Class<CreatingObjectByClone> obj= CreatingObjectByClone.class; //return object of Class<CreatingObjectByClone>
		System.out.println("obj : "+obj);
		System.out.println("obj.getClass()  : "+obj.getClass());
		
		
		
		
		CreatingObjectByClone ref=new CreatingObjectByClone();
		CreatingObjectByClone shadowCopy=ref;
		CreatingObjectByClone deepCopy=(CreatingObjectByClone) ref.clone();
		
		System.out.println("ref : "+ref);
		System.out.println("shadowCopy : "+shadowCopy);
		System.out.println("deepCopy : "+deepCopy);
		
		System.out.println("getClass() : "+ref.getClass());
		
	}
}
