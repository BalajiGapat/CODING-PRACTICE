package demo;

class Instance1
{
	public static int num=0;
	public Instance1() 
	{
		System.out.println("in constructor...");
	}
	
	//Instance block
	{
		num++;
		System.out.println("in instance block...");
	}
}


public class InstanceBlock 
{
	
	
	public static void main(String[] args) {
		//System.out.println("in main...");
		Instance1 obj1=new Instance1();
		Instance1 obj2=new Instance1();
		Instance1 obj3=new Instance1();
		Instance1 obj4=new Instance1();
		Instance1 obj5=new Instance1();
		System.out.println(Instance1.num);
		
		//System.out.println(super.hashCode()); //Cannot use super in a static context
		System.out.println(obj4.hashCode());
	}
}
