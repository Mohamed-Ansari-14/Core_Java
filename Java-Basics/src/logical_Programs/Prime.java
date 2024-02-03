package logical_Programs;

public class Prime 
{
	public static void main(String[]args)
	{
		int num = 7;
		int count = 0;
		for(int i = 1;i<=num;i++)
		{
			if(num % i == 0)
			{
				count ++;
				if(count>2)
					break;
			}
		}
		if (count == 2)
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is not a Prime Number");
	}
}
