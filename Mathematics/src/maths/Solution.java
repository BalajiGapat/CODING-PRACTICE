package maths;

import java.util.ArrayList;

//Back-end complete function template for Java

class Solution 
{
	public static ArrayList<Integer> quadraticRoots(int a, int b, int c) 
	{
		ArrayList<Integer> roots = new ArrayList<Integer>();
		int root1 = 0, root2 = 0;
		// value of b^2-4ac
		int temp = (int) (Math.pow(b, 2) - 4 * a * c);

		// if b^2-4ac is less then zero then roots are imaginary
		if (temp < 0)
			roots.add(-1);
		else {
			// calculate root1 and root2 using fomula
			// Math.floor method returns greatest integer below ( -b + sqrt(temp) )
			// Math.sqrt method returns square root of temp
			// (int) converts returned value type to integer
			root1 = (int) Math.floor((-b + Math.sqrt(temp)) / (2 * a));
			root2 = (int) Math.floor((-b - Math.sqrt(temp)) / (2 * a));
			// store both roots calculated in List
			// Math.max method returns greater value between root1 and root2
			// Math.min method returns smaller value between root1 and root2
			roots.add(Math.max(root1, root2));
			roots.add(Math.min(root1, root2));
		}
		return roots;
	}
	
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=quadraticRoots(1, 6, 6);
    	System.out.println(al);
	}
}
