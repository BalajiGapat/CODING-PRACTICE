package leaders_of_array;

public class LeadersOfArray 
{
	public static int[] findLeaders(int arr[])
	{
		int temp[]=new int[arr.length];
		int cnt=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int max=arr[i];
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(max < arr[j])
				{
					flag=false;
					break;
				}
			}
			if(flag)
				temp[cnt++]=max;
			 
		}
		temp[cnt]=arr[arr.length-1];
		return temp;
	}
	
	
	public static void main(String[] args) 
	{
		int arr[] = { 4, 15, 12, 3, 7, 11, 6, 8, 9 };
		int ans[]=findLeaders(arr);
		for(int i=0;i<ans.length;i++)
		{
			if(ans[i]!=0)
				System.out.print(ans[i]+" ");
		}
		
	}
}
