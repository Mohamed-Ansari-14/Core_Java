package logical_Programs;

public class Fibonacci
{
	public static void main(String[]args)
	{
		int n = 10;
		int a = 0, b = 1;
		if(n==1)
			System.out.print(a+" ");
		else
		{
			System.out.print(a+" ");
			System.out.print(b+" ");
			n = n - 2;
			while(n>0)
			{
				int c = a+b;
				System.out.print(c+" ");
				a = b;
				b = c;
				n --;
			}
		}
	}
}
