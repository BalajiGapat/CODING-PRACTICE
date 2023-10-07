package maths;

import java.util.Scanner;

public class FindingPrimeFactors {
	static boolean isPrime(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void findingPrimeFactors(int n)// 50
	{
		int arr[] = new int[n];
		int cnt = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) // 2 3 5
			{
				while (n % i == 0) // i=2 n=50 25
				{
					arr[cnt++] = i;
					n = n / i;
					//System.out.print(i+" ");
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				break;
			System.out.print(arr[i] + " ");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 : ");
		int n1 = sc.nextInt();
		findingPrimeFactors(n1);
	}
}
