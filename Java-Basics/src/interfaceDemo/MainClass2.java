package interfaceDemo;

interface Calculator
{
	double pi = 3.14; //-->By Default Final
	int add(int a,int b);
	
	int sub(int a,int b);
	
}

class MyCalculator implements Calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
}

public class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("PI Value = "+Calculator.pi);
		Calculator c1 = new MyCalculator();
		System.out.println(c1.add(5, 95));
		System.out.println(c1.sub(90, 40));
	}
}
