package numberPrograms2;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.print("Enter the Number: ");
			int num = sc.nextInt();
			int a=0,b=1,c=0;
			
			for(int i=1;i<=num;i++)
			{
				System.out.print(a+" ");
				c = a+b;
				a=b;
				b=c;
			}
		}
	}
}
