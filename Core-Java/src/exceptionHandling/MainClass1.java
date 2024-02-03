package exceptionHandling;

public class MainClass1
{
	public static void main(String[] args) 
	{
		System.out.println("***************************");
		
		int n1 = 10;
		int n2 = 0;
		int n3 = 0;
		
		try
		{
			System.out.println(n3=n1/n2);
		}
		catch(Exception e1)
		{
			System.out.println("Handling the Exception...");
			System.out.println(n3 = n1/1);
		}

		System.out.println("n1 value = "+n1);
		System.out.println("n2 value = "+n2);
		System.out.println("n3 value = "+n3);
		
		System.out.println("***************************");
	}
}
