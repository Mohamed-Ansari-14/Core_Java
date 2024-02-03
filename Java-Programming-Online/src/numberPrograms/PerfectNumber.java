package numberPrograms;
//WAJP TO FIND PERFECT NUMBER OR NOT
/*Find the sum of factors except that the given number and
/Check the given number and sum of number is equal or Not
 * if equals Perfect Number else not a perfect number.*/

public class PerfectNumber 
{
	public static void main(String[] args)
	{
		int num = 6,sum = 0;
		for(int i=1;i<num;i++)
		{
			if(num % i == 0)
				sum = sum+i;
		}
		
		if(num == sum)
			System.out.println(num+" is Perfect Number");
		else
			System.out.println(num+" is Not a Perfect Number");
	}
}
