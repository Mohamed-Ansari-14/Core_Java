package scanner;

import java.util.Scanner;

public class MainClass1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String name = sc.next();
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		System.out.println("Enter Your Annual Income: ");
		double sal = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Entered Name is "+name);
		System.out.println("Entered Age is "+age);
		System.out.println("Entered Annual Income is "+sal);
		
		sc.close();
	}
}
