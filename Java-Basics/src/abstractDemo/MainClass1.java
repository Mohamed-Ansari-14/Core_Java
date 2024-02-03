package abstractDemo;

abstract class Demoo
{	//a Abstract class can contains only Concrete Methods
	void m1()
	{
		
	}
	
	int m2()
	{
		return 1;
	}
}

abstract class A
{
	abstract void m1();
	abstract void m2();
}

class B extends A
{
	void m1()
	{
		System.out.println("I am in m1()...");
	}
	
	void m2()
	{
		System.out.println("I am in m2()...");
	}
}

public class MainClass1 
{	
	public static void main(String[] args) 
	{
		//A a1 = new A();	//We Can't Create a Object for abstract class...
		A a1 = new B();
		a1.m1();
		a1.m2();
	}
}
