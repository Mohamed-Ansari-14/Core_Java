package numberPrograms2;
//WAJP TO CHECK THE GIVEN NUMBER IS NEON NUMBER OR NOT 
public class Neon_Number 
{
	public static void main(String[] args)
	{
		int num = 9;
		//1.Find the square value of given number.
		int sqr = num*num;
		//2.Sum of Each Digit of Square Value
		int sum = 0;
		while(sqr>0)
		{
			int rem = sqr%10;
			sum = sum+rem;
			sqr = sqr/10;
		}
		if(sum == num)
			System.out.println(num+" is Neon Number");
		else
			System.out.println(num+" is not a Neon Number");
	}
}
