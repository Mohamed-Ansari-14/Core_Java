package numberPrograms2;
//WAJP TO CHECK THE GIVEN NUMBER IS BUZZ NUMBER OR NOT

//Any Number Which is Completely Divisible By 7 and ..
//That Number Should Divisible By 10 and Remainder.
public class Buzz_Number
{
	public static void main(String[] args)
	{
		int num = 77;
		if(num%7==0 && num%10==7)
			System.out.println(num+" is Buzz Number");
		else
			System.out.println(num+" is Not a Buzz Number");
	}
}
