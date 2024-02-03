package exceptionHandling;

public class MainClass2 	//==>Nested try catch block...
{
	public static void main(String[] args) 
	{
		System.out.println("**************************************");
		
		try
		{
			System.out.println("Before Exception...");
			System.out.println(10/0);
			System.out.println("After Exception...");
		}
		catch(Exception e1)
		{
			System.out.println("I am in Catch Block...");
			try
			{
				System.out.println(10/0);
			}
			catch(Exception e2)
			{
				System.out.println("I am in Catch-Catch...");
			}
			finally
			{
				System.out.println("I am in Catch-Finally...");
			}
		}
		finally
		{
			//System.exit(0);
			System.out.println("I am in Finally Block...");
		}
		
		System.out.println("**************************************");
	}
}










