package exceptionHandling;

public class Default 
{
	public static void main(String[] args) 
	{
		try 
		{
			m1();
		}
		catch(Exception e1)
		{
			System.out.println("Exception is Handled...");
			e1.printStackTrace();
		}
	}

	private static void m1() 
	{
		m2();
	}

	private static void m2() 
	{
		System.out.println(10/0);
	}
}
