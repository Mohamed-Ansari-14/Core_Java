package scanner;

import java.util.Scanner;

public class MainClass2 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s1 = sc1.next();
		System.out.println("Enter Character: ");
		char ch = sc1.next().charAt(0);
		int count = 0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) == ch)
				count++;
		}
		System.out.println(ch+" Present "+count+" times in "+s1);
		
		sc1.close();
	}
}
