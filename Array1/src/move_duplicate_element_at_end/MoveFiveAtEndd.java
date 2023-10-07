package move_duplicate_element_at_end;

public class MoveFiveAtEndd 
{
	public static void moveFiveAtEnd(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==5)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					boolean flag=false;
					if(arr[j]!=5)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						flag=true;
					}
					if(flag)
						break;
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr=new int[] {12,5,23,5,0,0,14,65,5,5,99,77,5};
		for(int i: arr)
			System.out.print(i+" ");
		moveFiveAtEnd(arr);
		System.out.println();
		for(int i: arr)
			System.out.print(i+" ");
		
	}
}
