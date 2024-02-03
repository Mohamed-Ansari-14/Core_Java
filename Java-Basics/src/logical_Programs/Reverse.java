package logical_Programs;

public class Reverse 
{
	public static void main(String[]args)
	{
		int num = 123456;
		while(num>0)
		{
			int rem = num % 10;
			System.out.print(rem);
			num = num/10;
		}
	}
}
