package fibonacci;

import java. util.Arrays;

public class FibonachiSeries 
{
	public static int[] fibo()
	{
		int[] arr=new int[15];
		
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<arr.length;i++)
		{
			arr[i]=arr[i-2]+arr[i-1];
		}
		return arr;
	}
	
	public static void main(String[] args) 
	{
		// 0 1 1 2 3 5 8 13 21...
		int[] arr=fibo();
		System.out.println("fibo : "+Arrays.toString(arr));
		System.out.println("8th pos of fibo num : "+arr[7]);
	}
}
