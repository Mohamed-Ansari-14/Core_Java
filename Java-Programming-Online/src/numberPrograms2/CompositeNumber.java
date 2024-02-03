package numberPrograms2;
//-->Opposite to Prime Number................
public class CompositeNumber 
{
	public static void main(String[] args)
	{
		int num = 6;
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count>2)
			System.out.println(num+" is a Composite Number");
		else
			System.out.println(num+" is  not a Composite Number");
	}
}
