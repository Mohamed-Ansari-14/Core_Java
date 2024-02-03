package logical_Programs;

public class SpyNumber 
{
	public static void main(String[]args)
	{
		int num = 123,temp = num;
		int sum = 0;
		int mul = 1;
		while(num>0)
		{
			int rem = num % 10;
			sum = sum + rem;
			mul = mul * rem;
			num = num / 10;
		}
		if(sum == mul)
			System.out.println(temp+" is Spy Number");
		else
			System.out.println(temp+" is not a Spy Number");
	}
}
