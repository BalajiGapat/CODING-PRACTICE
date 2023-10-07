package demo;
interface MyInterface1
{
	void show();
}

interface MyInterface2
{
	void sum(int n1, int n2);
}

public class FunctionalIntrface 
{
	public static void main(String[] args) 
	{
		//Anonymous class
		MyInterface1 ref1=new MyInterface1() {
			@Override
			public void show()
			{
				System.out.println("In show() annonymous class...");
			}
		}; 
		ref1.show();
		
		MyInterface1 ref11= ()->System.out.println("in show() by lambda expre..");
		ref11.show();
		
		MyInterface2 ref2=new MyInterface2() 
		{
			@Override
			public void sum(int n1, int n2) 
			{
				System.out.println("in sum() by annonymous class : "+(n1+n2));
			}
		};
		
		ref2.sum(12, 12);
		
		//by lambda expiration
		MyInterface2 ref22=(n1,n2)->{System.out.println("in sum() by lambda expression : "+(n1+n2));};
		ref22.sum(12, 23);
		
		
		
	}
}
