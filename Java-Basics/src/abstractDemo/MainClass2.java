package abstractDemo;

abstract class Calculator
{
	abstract void add(int a,int b);
	
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}	
}

class MyCalculator extends Calculator
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

public class MainClass2 
{
	public static void main(String[] args)
	{
		Calculator c1 = new MyCalculator();
		c1.add(50, 50);
		c1.sub(150, 50);
	}
}
