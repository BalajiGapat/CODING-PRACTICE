package demo;
import java.util.Arrays;
import java.util.Collection;

public class Demo2 {
	public static void main(String[] args) 
	{
		Collection<Integer> list=Arrays.asList(12,4,5);
		list.stream().map(x->x*x).forEach(x->System.out.println(x));
	}
}
