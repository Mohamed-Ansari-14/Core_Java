package stringClass;

final class Immutable		//Immutable Class....
{
	final int x;
	Immutable(int x)
	{
		this.x = x;
	}
	int getx()
	{
		return x;
	}
}

public class A 
{
	public static void main(String[] args) 
	{
		Immutable i1 = new Immutable(50);
		System.out.println(i1.getx());
	}
}
