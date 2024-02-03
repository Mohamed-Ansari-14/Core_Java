package patterns;

public class AbcdPattern
{
	public static void main (String[]args)
	{
		for(char i = 'A';i<='E';i++)
		{
			for(char j = 'A';j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		for(char i = 'A';i<='E';i++)
		{
			for(char j = 'A';j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		char k='A';
		for(char i = 'A';i<='E';i++)
		{
			for(char j = 'A';j<=i;j++)
			{
				System.out.print(" "+k);
				k++;
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		for(int i = 1;i<=5;i++)
		{
			for(int s = 5;s>i;s--)
			{
				System.out.print("  ");
			}
			int j;
			char c;
			for(j=1,c='A';j<=i;j++)
			{
				System.out.print(c++ +" ");
			}
			c-=2;
			for(char z=c;z>='A';z--)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
	}
}


















