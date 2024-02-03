package numberPrograms2;
//WAJP TO FIND FIBONACCI BETWEEN THE RANGE 500 - 2000;
public class FibonacciBetween500_2000
{
	public static void main(String[] args)
	{
		int a=0,b=1,c=0;
		int start=500,end = 2000;
		for(int i=start;i<=end;i++)
		{
			if(a>=500 && a<=2000)
			{
				System.out.println(a+" ");
			}
			c=a+b;
			a=b;
			b=c;
		}
	}
}
