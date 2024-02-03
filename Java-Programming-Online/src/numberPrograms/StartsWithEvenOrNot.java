package numberPrograms;
//WAJP To check Given Number starts with Even or Odd ?
public class StartsWithEvenOrNot
{
	public static void main(String[] args) 
	{
		int num = 2678;
		
		while(num > 9)
		{
			num = num / 10;
		}
		
		if(num % 2 == 0)
			System.out.println("Given Number is Starts with Even Digit !!!");
		else
			System.out.println("Given Number is Starts with Odd Digit !!!");
	}
}
