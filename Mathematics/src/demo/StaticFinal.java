package demo;

public class StaticFinal 
{
	private String address;
	private static int balance;
	public final String bankName;
	private static final int  IFSC;
	
	public StaticFinal(String address, String bankName)
	{
		this.address=address;
		this.bankName=bankName;
	}
	
	public StaticFinal() 
	{
		this.bankName = "State Bank Of India";
		
	}

	static
	{
		balance=150000;
		IFSC=0004451;
	}
	
	public void disp()
	{
		System.out.println("in display.....");
	}
	
	public static void main(String[] args) 
	{
		StaticFinal ref=new StaticFinal();
		System.out.println(ref.bankName);
		//ref.bankName="Bank Of India"; //The final field StaticFinal.bankName cannot be assigned
		
		StaticFinal ref1=new StaticFinal("pune", "bank of Badoda");
		StaticFinal ref2=new StaticFinal("Mumbai", "RBI");
		
		System.out.println("ref1 : "+ref1.bankName);
		System.out.println("ref2 : "+ref2.bankName);
	}
}
