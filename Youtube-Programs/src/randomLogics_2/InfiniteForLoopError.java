package randomLogics_2;

public class InfiniteForLoopError
{
	public static void main(String[] args) 
	{
		int a = 2;
		for( ; ; )
		{
			if(a == 2)
			{
				break;
				//UnReachabe Code
				//System.out.println("I want to get Printed");	//==>Compile Time Error
			}
		}
	}
}
