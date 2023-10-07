package demo;

class TestDemo 
{
	public TestDemo()
	{
		
	}
	
}

public class CreatingObjectThroughReflection 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)  throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		TestDemo t= (TestDemo) Class.forName("TestDemo").newInstance();
	}
}
