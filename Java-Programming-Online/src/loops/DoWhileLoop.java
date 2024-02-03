package loops;

import java.util.Scanner;

public class DoWhileLoop 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			char ch;
			
			do {
				System.out.println("Welcome");
				
				System.out.println("Do you want to print the same message");
				System.out.println("Type y for Yes or Type n for No");
				ch = sc.next().charAt(0);
			}while(ch == 'y');
			
			System.out.println("Thank-You");
		}
		
	}
}
