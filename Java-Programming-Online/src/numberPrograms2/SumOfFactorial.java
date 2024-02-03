package numberPrograms2;

public class SumOfFactorial 
{
	public static void main(String[] args) 
	{
		int num = 45;
		int sum=0;
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i=1;i<=rem;i++)
			{
				fact = fact*i;
			}
			
			System.out.println(rem+"-->"+fact);
			
			sum = sum+fact;
			num = num/10;
		}
		
		System.out.println("Sum of Factorial = "+sum);
	}
}
