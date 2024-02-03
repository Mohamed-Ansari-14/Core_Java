package java8Features;

interface Demo
{
	void m1();
}

public class InnerClass 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo()
		{
			@Override
			public void m1() 
			{
				System.out.println("Overrided in Anonymous InnerClass...");
			}
		};
		d1.m1();
		Demo d2 = ()->System.out.println("Hi I am in Lambda Expression...");
		d2.m1();
	}
}
