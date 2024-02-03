package patterns;

public class StarPatterns 
{
	public static void main(String[]args)
	{
		System.out.println("---------------------");
		System.out.println("---------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3||j==3||i+j==6||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("---------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int s=5;s>i;s--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("---------------------");
	}
	
}










