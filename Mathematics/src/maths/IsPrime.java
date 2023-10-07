package maths;

import java.util.Scanner;

public class IsPrime 
{	
	static boolean isPrime(int num) 
	{
		num = Math.abs(num);

		if (num == 0 || num == 1)
			return false;

		for (int i = 2; i <= (int) Math.sqrt(num); i++) 
		{
			if (num % i == 0)
				return false;
		}
		return true;
	}
	// time complexity=O(sqrt(n))

	
	
//	static boolean isPrimee(int num) 
//	{
//		if (num == 0 || num == 1)
//			return false;
//		for (int i = 2; i <= num / 2; i++) {
//			if (num % i == 0)
//				return false;
//		}
//		return true;
//	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num  :");
		int num = sc.nextInt();
		System.out.println("Is Prime : " + isPrime(num));
	}

}
