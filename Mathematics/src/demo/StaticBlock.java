package demo;

public class StaticBlock 
{
	private int num;
	private String name;
	private double salary;
	
	public StaticBlock()
	{
		System.out.println("in Demo5 constructor.......");
		num=100;
		name="balaji";
		salary=50000;
	}

	public static void main(String[] args)
	{
		System.out.println("in main....");
		StaticBlock obj=new StaticBlock();
	}
	static
	{
		 System.out.println("in static block......");
	}
	
	
}
