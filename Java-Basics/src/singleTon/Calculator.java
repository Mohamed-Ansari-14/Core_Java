package singleTon;

public class Calculator 
{
	private Calculator()
	{
		System.out.println("Calculator is Created Sucessfully......");
	}
	
	private static Calculator c1 = new Calculator();
	
	public static Calculator getCalc()
	{
		return c1;
	}
}
