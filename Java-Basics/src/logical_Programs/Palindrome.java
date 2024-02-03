package logical_Programs;

public class Palindrome 
{
	public static void main(String[]args)
	{
		int num = 555,temp = num;
		int rev = 0;
		while(num>0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if(temp == rev)
			System.out.print(temp+" is Palindrome");
		else
			System.out.print(temp+" not a Palindrome ");
	}
}
