package scanner;

import java.util.Scanner;

public class MainClass3 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc1.next();
		int count = 0;
		for(int i=0;i<s1.length();i++)
		{
			char ch = s1.charAt(i);
			if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch  == 'u')
			{
				count++;
			}
		}
		System.out.println("Count of vowels in "+s1+" is "+count);
		
		sc1.close();
	}
}
