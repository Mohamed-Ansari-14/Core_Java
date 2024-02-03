package logical_Programs;

public class Strong 
{
	static int fact(int n)
	{
		int f = 1;
		for(int i=1;i<=n;i++)
		{
			f = f * i;
		}
		return f;
	}
	public static void main(String[] args) 
	{
		int num = 145,temp = num;
		int sum = 0;
		
		while(num>0)
		{
			int rem = num%10;
			sum = sum+fact(rem);
			num = num/10;
		}
		if(temp == sum)
			System.out.println(temp+" is a Strong Number");
		else
			System.out.println(temp+" Not a Strong Number");
	}
}
