package decision_Statements;

import java.util.Scanner;

public class Else_IF_Ladder 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter Your Mark: ");
			double mark = sc.nextInt();
			
			if(mark >= 90 && mark <= 100)
			{
				System.out.println("A-Grade");
			}
			else if(mark >= 80 && mark < 90)
			{
				System.out.println("B-Grade");
			}
			else if(mark >= 60 && mark < 80)
			{
				System.out.println("C-Grade");
			}
			else if(mark >= 40 && mark < 60)
			{
				System.out.println("D-Grade");
			}
			else if(mark >= 35 && mark <= 40)
			{
				System.out.println("E-Grade");
			}
			else
			{
				System.out.println("Fail !!!");
			}
		}
	}
}
