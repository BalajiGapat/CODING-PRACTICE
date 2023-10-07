package maths;

public class MathsFunctionsRoundFloorCeil
{	
	public static void main(String[] args) 
	{	
		System.out.println("round() >> double to long...");
		//public static long round​(double a)
		long v1=Math.round(123.50); //124
		long v2=Math.round(123.91); //124
		long v3=Math.round(123.43); //123
		long v4=Math.round(123.49); //123
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
		
		System.out.println("round()  >> float to int...");
		//public static int round​(float a)
		int n1=Math.round(123.54f); //124
		int n2=Math.round(123.91F); // 124
		int n3=Math.round(123.43f); //123
		System.out.println(n1);  
		System.out.println(n2);
		System.out.println(n3);
		
		
		System.out.println("floor() >>  double to nearest double....");
		//public static double floor​(double a)
		double f1=Math.floor(123.89); //123.0
		double f2=Math.floor(123.43); //123.0
		System.out.println(f1);
		System.out.println(f2); 
		System.out.println((int)123.89);
		
		
		System.out.println("ceil() double to double...");
		//public static double ceil​(double a)
		double c1=Math.ceil(123.99);
		System.out.println("c1 : "+c1); //124.0
		double c2=Math.ceil(123.00);
		System.out.println("c2 : "+c2); //123.0
		double c3=Math.ceil(123.01); //124.0
		System.out.println("c3 : "+c3);
		

		//int p1=(int)Math.sqrt(23.45);
		//System.out.println(p1);
	
	}
}
