package interfaceDemo;

interface A
{
	int x = 10;
	void m1();
}

class B implements A
{
	public void m1()
	{
		System.out.println("I am in m1()...");
	}
}

public class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println(A.x);//--> x is by default static variable
		//A a1 =  new A();	-->We cannot create a object for interface
		A a1 = new B();
		a1.m1();
	}
}
