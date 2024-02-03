package randomLogics_1;

import java.util.Scanner;

public class SeriesBy5UsingScanner 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter the Number: ");
			int num = sc.nextInt();
			
			for(int i=1;i<=num;i++)
			{
				if(i % 5 == 0)
					System.out.println(i);
			}
		}
	}
}
