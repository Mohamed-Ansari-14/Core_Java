package java7Features;

import java.util.Scanner;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		try(Scanner  sc = new Scanner(System.in);) 	//try with multiple resource
		{
			System.out.println("Enter Data");
			while(sc.hasNext())
			{
				System.out.println(sc.next());
			}
		}
	}
}
