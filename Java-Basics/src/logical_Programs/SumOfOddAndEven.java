package logical_Programs;

class program
{
	static void oddEven(int n)
	{
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			sum = sum + i;
		}
		if(sum%2 == 0)
			System.out.println(sum+" is Even");
		else
			System.out.println(sum+" is Odd");
	}
}

public class SumOfOddAndEven 
{
	public static void main(String[] args) 
	{
		program.oddEven(5);
		program.oddEven(7);
		program.oddEven(2);
	}
}
