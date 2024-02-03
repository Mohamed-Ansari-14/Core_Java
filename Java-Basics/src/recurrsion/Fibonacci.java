package recurrsion;

public class Fibonacci
{
	static int fib(int n)
	{
		if(n == 1)
			return 0;
		else if(n == 2||n==3)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[]args)
	{
		int x = fib(8);
		System.out.println("nth Fibonacci Series= "+x);
	}
}
