package patterns;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int s=4;s>=i;s--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		for(int i=1;i<=5;i++)
		{
			for(int s=5;s>i;s--)
			{
				System.out.print("  ");
			}
			int j;
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=j-2;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}	
	}
}














