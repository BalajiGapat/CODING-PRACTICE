package demo;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("in myThread CLass : "+i);
			
			try 
			{
				Thread.sleep(2000);
			} 
			
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}


public class CreatingCustomThread
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		MyThread t1=new MyThread(); //creating new thread or instantiation of thread
		t1.start(); // t\starting of thread i.e thread in 
		
		for(int i=0;i<5;i++)
		{
			System.out.println("in main class : "+i);
			Thread.sleep(3000);
		}
		
				
	
	}
}
