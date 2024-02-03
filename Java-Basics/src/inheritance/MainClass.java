package inheritance;

class A
{
	int x = 100;
	A()
	{
		System.out.println("I am in A()...");
	}
}

class B extends A
{
	int y = 200;
	B(int a)
	{
		System.out.println("I am in B(int)...");
	}
}

class C extends B
{
	int z = 300;
	C(double b)
	{
		super(5);
		System.out.println("I am in C(Double)...");
	}
}

class D
{
	String a = "Constructor Chaining";
	D()
	{
		this(5);
		System.out.println("I am in D()...");
	}
	D(int x)
	{
		this(10.5);
		System.out.println("I am in D(int)...");
	}
	D(double y)
	{
		this("Abcd");
		System.out.println("I am in D(double)...");
	}
	D(String z)
	{
		System.out.println("I am in D(String)...");
	}
}
public class MainClass 
{
	public static void main(String[]args)
	{
		C c1 = new C(10.5);
		System.out.println("X value = "+c1.x);
		System.out.println("Y value = "+c1.y);
		System.out.println("Z value = "+c1.z);
		
		D d1 = new D();
		System.out.println(d1.a);
	}
}
