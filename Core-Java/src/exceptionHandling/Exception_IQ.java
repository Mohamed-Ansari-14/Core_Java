package exceptionHandling;

public class Exception_IQ 
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("Before Exception");
			System.out.println(10/0);
			System.out.println("After Exaception");
		}
		finally
		{
			System.out.println("Done");
		}
		
		System.out.println("--------------------------------");
		
		try
		{
			try
			{

			}
			catch(Exception e)
			{
				
			}
			finally 
			{
				
			}
		}
		catch(Exception e)
		{
			try
			{

			}
			catch(Exception ex)
			{

			}
			finally 
			{
				
			}
//			catch(Exception e)
//			{
//				
//			}
		}
		finally 
		{
//			finally 
//			{
//				
//			}
			try
			{
				
			}
			catch(Exception ex)
			{
				
			}
			finally 
			{
				
			}
		}
	}
}















