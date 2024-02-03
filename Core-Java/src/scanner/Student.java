package scanner;

import java.util.Scanner;

public class Student 
{
	String s1;int s2;
	double m1,m2,m3,m4,m5;
	double total;
	
	public void scanner()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		s1 = sc.next();
		
		System.out.println("Enter Your Age: ");
		s2 = sc.nextInt();
		
		System.out.println("Enter Yours Marks: ");
		System.out.println("Tamil: ");
		m1 = sc.nextDouble();
		System.out.println("English: ");
		m2 = sc.nextDouble();
		System.out.println("Maths: ");
		m3 = sc.nextDouble();
		System.out.println("Science: ");
		m4 = sc.nextDouble();
		System.out.println("Social Science: ");
		m5 = sc.nextDouble();
		sc.close();
	}
	
	public double totalMarks()
	{
		total = 0.0;
		total = m1+m2+m3+m4+m5;
		return total;
	}
	
	public double average()
	{
		return total/5;
	}
	
	public void eligible()
	{
		if(total >= 360)
			System.out.println("Your Mark is Eligible...");
		else
			System.out.println("Your Mark is Not Eligible...");
	}
}
















