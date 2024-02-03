package numberPrograms2;
//Factorial of each number and sum of each number and check whether sum is equal to given 
//or not...
public class StrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 145,temp=num;
		int sum = 0;
		while(num>0)
		{
			int rem = num%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact = fact * i;
			}
			System.out.println(rem+"-->"+fact);
			sum = sum+fact;
			num = num/10;
		}
		System.out.println("Sum = "+sum);
		if(temp == sum)
			System.out.println(temp+" is a Strong Number");
		else
			System.out.println(temp+" is Not a Strong Number");
	}
}
