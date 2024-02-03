package decision_Statements;

import java.util.Scanner;

public class Nested_IF 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter the Number: ");
			int num = sc.nextInt();
			
			if(num % 2 == 0)
			{
				if(num % 6 == 0)
				{
					System.out.println("Even Number And Divisible By 6");
				}
				else
				{
					System.out.println("Even Number but Not Divisible By 6");
				}
			}
			else
			{
				if(num % 3 == 0)
				{
					System.out.println("Odd Number And Divisible By 3");
				}
				else
				{
					System.out.println("Odd Number But Not Divisible By 3");
				}
			}
		}
	}
}
