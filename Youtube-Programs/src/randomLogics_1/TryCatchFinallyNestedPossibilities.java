package randomLogics_1;

public class TryCatchFinallyNestedPossibilities 
{
	public static void main(String[] args) 
	{
		try
		{
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException a1)
			{
				//catch(RuntimeException r1)	==>Not Possible
				{
					
				}
			}
			catch (Exception e1) 
			{
				
			}
			catch(Throwable t1)
			{
				
			}
			finally 
			{
				//finally ==>Not Possible
				{
					
				}
			}
		}
		catch(Exception e2)
		{
			
		}
		finally
		{
			
		}
	}
}
