package numberPrograms;
//WAJP TO FIND SUM OF FACTORS 
public class SumOfFactors 
{
	public static void main(String[] args) 
	{
		int num = 6,sum = 0;
		for(int i=1;i<=num;i++)
		{
			if(num % i == 0)
				sum = sum+i;
		}
		
		System.out.println("Sum of Factors = "+sum);
	}
}
