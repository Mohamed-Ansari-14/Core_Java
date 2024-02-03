package randomLogics_1;

class A
{
	public void m1()
	{
		System.out.println(1111);
	}
}

class B extends A
{
	//void m1()			//==>Compile Time Error...(We can't reduce the visibility)
	{
		System.out.println(2222);
	}
}

public class LowVisibilityError 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.m1();
	}
}
