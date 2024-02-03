package typeCasting;

class A
{
	int x = 10;
}

class B extends A
{
	int y = 20;
}

class C extends B
{
	int z = 30;
}

public class ClassOrReferenceCasting
{
	public static void main(String[] args) 
	{
		System.out.println("Up-Casting");
		C c1 = new C();
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
		
		B b1 = (B)c1; 
		System.out.println(b1.x);
		System.out.println(b1.y);
		
		A a1 = (A)b1;
		System.out.println(a1.x);
		
		System.out.println("Down-Casting");
		//B b11 = (B) new A();// --> ClassCastException
		
		A a2 = new C();		//Implicit upcasting
		System.out.println(a2.x);
		
		B b2 = (B)a2;
		System.out.println(b2.x);
		System.out.println(b2.y);
		
		C c2 = (C)b2;
		System.out.println(c2.x);
		System.out.println(c2.y);
		System.out.println(c2.z);
		
	}
}


















