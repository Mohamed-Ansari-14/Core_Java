package exceptionHandling;

public class MainClass3 
{
	public static void main(String[] args) 
	{
		try
		{
			String s1 = null;
			System.out.println(10/0);
			System.out.println(s1.charAt(0));
		}
		catch(ArithmeticException | NullPointerException e1)
		{
			System.out.println("I am in ArithmeticException | NullPointerException");
		}
		catch(RuntimeException e1)
		{
			System.out.println("I am in RunTimeException");
		}
		catch(Exception e1)
		{
			System.out.println("I am in Exception");
		}
		catch(Throwable t1)
		{
			System.out.println("I am in Throwable");
		}
	}
}
