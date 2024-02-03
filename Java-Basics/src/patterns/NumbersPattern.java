package patterns;

public class NumbersPattern 
{
	public static void main(String[]args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int s=5;s>i;s--)
			{
				System.out.print("  ");
			}
			int j;
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			for(int k=j-2;k>=1;k--)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i = 1;i<=5;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		int k = 1;
		for(int i = 1;i<=4;i++)			//Floyds triangle...
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		}
	}
























