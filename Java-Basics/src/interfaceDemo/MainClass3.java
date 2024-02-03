package interfaceDemo;

interface I1
{
	void m1();
//	void m11()
//	{
//		//We can't create a concrete method in interface !!!
//	}
	default void m2() //by using Default keyword we can create the Concrete method in interface
	{
		System.out.println("It is a Default m2()...");
	}
	default void m3() //Default Methods are only allowed in inside the interface
	{
		System.out.println("It is a Default m3()...");
	}
	static void m4()
	{
		System.out.println("It is a static m4()...");
	}
}

class C1 implements I1
{
	public void m1()
	{
		System.out.println("It is a Overrided method of m1()...");
	}
	
	public void m3()
	{
		System.out.println("It is a Overrided method of m3()...");
	}
	
}

public class MainClass3 
{
	public static void main(String[] args)
	{
		I1 i1 = new C1();
		i1.m1();
		i1.m2();
		i1.m3();
		I1.m4();
	}
}













