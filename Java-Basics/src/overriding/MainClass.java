package overriding;

class A
{
	void display()
	{
		System.out.println("i am in display A class");
	}
}

class B extends A
{
	void display()
	{
		System.out.println("i am in display B class");
	}
}

public class MainClass 
{
	public static void main(String[]args)
	{
		A a1 = new A();
		a1.display();
		B b1 = new B();
		b1.display();
	}
}
