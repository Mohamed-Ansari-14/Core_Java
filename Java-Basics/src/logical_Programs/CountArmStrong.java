package logical_Programs;

public class CountArmStrong 
{
	static int count(int num)
	{
		int count = 0;
		while(num>0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	
	static int power(int digit,int pow)
	{
		int res = 1;
		for(int i=1;i<=pow;i++)
		{
			res = res * digit;
		}
		return res;
	}
	
	static boolean isArmStrong(int num)
	{
		int temp = num;
		int sum = 0;
		int nod = count(num);
		while(num>0)
		{
			int rem = num % 10;
			sum = sum + power(rem,nod);
			num = num/10;
		}
		return temp == sum;
	}
	
	public static void main(String[] args) 
	{
		int armCount = 0;
		for(int num = 100;num<=1000;num++)
		{
			if(isArmStrong(num))
			{
				armCount++;
				System.out.println(num);
			}
		}
		System.out.println("Total Count = "+armCount);
	}
}








