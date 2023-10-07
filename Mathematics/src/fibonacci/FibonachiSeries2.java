package fibonacci;

import java.util.Arrays;

public class FibonachiSeries2 
{
	public static int fibo(int pos) //5
	{
		int arr[]=new int[pos]; //5
		arr[0]=0;
		arr[1]=1;
		
		if(pos==0)
			return arr[0];
		if(pos==1)
			return arr[1];
		
		int i;
		for(i=2;i<pos;i++) //pos=5
		{
			arr[i]=arr[i-2]+arr[i-1];
		}
		System.out.println("arr : "+Arrays.toString(arr));
		return arr[i-1];
		
	}
	
	public static void main(String[] args) 
	{
		int ans=fibo(8);
		System.out.println("ans : "+ans);
	}
}
