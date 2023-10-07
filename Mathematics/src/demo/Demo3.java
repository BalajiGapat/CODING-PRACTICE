package demo;
class Student
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
}
public class Demo3 
{
	public static void main(String[] args) 
	{
		Thread th=Thread.currentThread();
		System.out.println(th.getState());  //RUNNABEL
		System.out.println(th.getState().name()); //RUNNABLE
		System.out.println(th.getId());
		
		//Student st=new Student();
	}
}
