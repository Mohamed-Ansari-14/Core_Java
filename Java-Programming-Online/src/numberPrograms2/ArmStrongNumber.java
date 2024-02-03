package numberPrograms2;
//Sum of Power of each Digit is Equals to Given Number
public class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 153,n1 = num,temp=num;
		//1.Find The Count
		int count = 0;
		while(num>0)
		{
			count++;
			num = num/10;
		}
		System.out.println("Count = "+count);
		
		//2.Find Power of Each Digit
		
		int sum = 0;
		while(n1>0)
		{
			int pow = 1;
			int rem = n1%10;
			
			for(int i=1;i<=count;i++)
			{
				pow = pow*rem;
			}
			System.out.println(rem+"-->"+pow);
			
			//3.Find Sum of Each Digit
			sum = sum+pow;
			n1 = n1/10;
		}
		
		System.out.println("Sum = "+sum);
		
		if(temp == sum)
			System.out.println(temp+" is ArmStrong Number");
		else
			System.out.println(temp+" is Not a ArmStrong Number");
	}
}
