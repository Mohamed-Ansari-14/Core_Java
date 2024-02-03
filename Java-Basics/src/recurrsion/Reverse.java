package recurrsion;

public class Reverse 
{
	static void reverse(int n)
	{
		if(n>0)
		{
			System.out.print(n%10);
			reverse(n/10);
		}
	}
	public static void main(String[]args)
	{
		reverse(1234);
	}
}
