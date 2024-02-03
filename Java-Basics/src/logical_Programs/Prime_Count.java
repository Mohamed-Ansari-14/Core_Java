package logical_Programs;

public class Prime_Count 
{
	static boolean isPrime(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n % i == 0)
			{
				count ++;
				if(count>2)
					break;
			}
		}
		if(count == 2)
			return true;
		else
			return false;
	}
	
	public static void main(String[]args)
	{
		int pc = 0;
		for(int num = 1;num<=100;num ++)
		{
			if(isPrime(num))
			{
				pc ++;
				System.out.println(num);
			}
		}
		System.out.println("Total Count = "+pc);
		
	}
}
