package objectDemo;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1); //Implicit toString()...
		System.out.println(o2.toString()); //Explicit toString()...
		
		System.out.println(new Object());
		
		int h1 = o1.hashCode();
		System.out.println(h1);
		System.out.println(o2.hashCode());
		
		boolean res = o1.equals(o2);
		System.out.println(res);
		System.out.println(o1.equals(o1));
	}
}
