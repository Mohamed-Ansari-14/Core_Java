package numberPrograms;
//WAJP PRINT THE FACTORS OF GIVEN NUMBER.
//Factors are number which divide the given number completely.
public class FactorsProgram 
{
	public static void main(String[] args) 
	{
		int n = 6;
		for(int i=1;i<=n;i++)
		{
			if(n % i == 0)
				System.out.println(i);
		}
	}
}

/*
 * 6 % 1 == 0(true)
 * 6 % 2 == 0(true)
 * 6 % 3 == 0(true)
 * 6 % 4 == 0(false)
 * 6 % 5 == 0(false)
 * 6 % 6 == 0(true)
 * */
 