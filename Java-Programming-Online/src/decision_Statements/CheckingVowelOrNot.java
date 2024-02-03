package decision_Statements;

import java.util.Scanner;

public class CheckingVowelOrNot 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter the Anyone Character From A - Z ");
			char ch = sc.next().charAt(0);
			
			if((ch=='a'||ch=='A') || (ch=='e'||ch=='E') || (ch=='i'||ch=='I') || (ch=='o'||ch=='O')
					|| (ch=='u'||ch=='U'))
			{
				System.out.println(ch+" is a Vowel");
			}
			else
				System.out.println(ch+" is a Consonant");
		}
	}
}
