package demo;

class Test 
{
	//private int x, y;  //compile time error
	protected int x,y;
}

public class ProtectedFields
{
	public static void main(String args[]) 
	{ 
		Test t = new Test();
		System.out.println(t.x + " " + t.y);
	}
}