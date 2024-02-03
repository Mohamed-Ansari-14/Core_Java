package inheritance;

public final class Demo 
{
	
}

//class Demo2 extends Demo	//-->We can't inherit the final class
//{
//	
//}

class Demo3
{
	static void m1()
	{
		
	}
}

class Demo4 extends Demo3 //--> The static methods or variables we can't inherit
{							//--> Without inheritance we can't perform the method overriding
	static void m1() //-->Because of static its not a method overriding
	{
		
	}
}
