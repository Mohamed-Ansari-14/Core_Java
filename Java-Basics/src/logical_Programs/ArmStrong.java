package logical_Programs;

public class ArmStrong 
{
	static int cube(int n)
	{
		return n * n * n;
	}
	
	public static void main(String[] args) 
	{
		int sum = 0;
		int num = 153,temp = num;
		while(num>0)
		{
			int rem = num % 10;
			sum = sum + cube(rem);
			num = num / 10;
		}
		if(temp == sum)
			System.out.println(temp+" is a ArmStrong Number");
		else
			System.out.println(temp+" is not a ArmStrong Number");
	}
}
