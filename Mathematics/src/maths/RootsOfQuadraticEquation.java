package maths;

import java.util.ArrayList;

public class RootsOfQuadraticEquation 
{
	 public static ArrayList<Integer> quadraticRoots(int a, int b, int c) 
	    {
	        ArrayList<Integer> al=new ArrayList<Integer>();
	        int d=b*b-4*a*c;
	        if(d<0)
	        {
	            al.add(-1);
	            return al;
	        }
	        
	        // int r1= (int) Math.floor( (-b+Math.sqrt(d))/(2*a) );
	        // int r2= (int) Math.floor( (-b-Math.sqrt(d))/(2*a) );
	        // al.add(r1);
	        // al.add(r2);
	        
	        double r1 = (-b + Math.sqrt(d)) / (2 * a);
	        double r2 = (-b - Math.sqrt(d)) / (2 * a);
	        al.add((int) Math.floor(r1));
	        al.add((int) Math.floor(r2));
	        return al;
	        
	    }
    
    public static void main(String[] args)
    {
    	//ArrayList<Integer> al=quadraticRoots(1,-7,12);
    	ArrayList<Integer> al=quadraticRoots(1,5,6);
    	System.out.println(al);
    }
}
