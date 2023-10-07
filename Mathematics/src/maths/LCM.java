package maths;
import java.util.Scanner;

public abstract class LCM {

	static int lcm(int n1, int n2) {
		n1 = Math.abs(n1);
		n2 = Math.abs(n2);

		int nn1 = n1;
		int nn2 = n2;

		while (n1 != n2) {
			if (n1 > n2)
				n1 = n1 - n2;
			else
				n2 = n2 - n1;
		}

		int hcf = n1;

		// return hcf*(nn1/hcf)*(nn2/hcf);

		return (nn1 * nn2) / hcf; // n1*n2=LCM*HCF
	}
	// time complexity =O(log(min(n1, n2)))
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1 : ");
		int n1 = sc.nextInt();
		System.out.println("enter num1 : ");
		int n2 = sc.nextInt();
		System.out.println("LCM : " + lcm(n1, n2));
	}
}
