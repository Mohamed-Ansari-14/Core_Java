package randomLogics_1;

public class StaticNonStaticError 
{
	static void m1()
	{
		System.out.println("Hiii");
		//m2();			// ==>Compile time Error...Due to m2 is non static
		System.out.println("Bye..");
	}
	
	/*static*/ void m2()
	{
		System.out.println("GoodByeee");
	}
}

class MainClass
{
	public static void main(String[] args) 
	{
		StaticNonStaticError.m1();
	}
}