package javaBeans;

class Sample1
{
	private int x;
	public Sample1()
	{
		
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
}

public class MainClass1 
{
	public static void main(String[] args) 
	{
		Sample1 s1 = new Sample1();
		s1.setX(50);
		System.out.println("Value of X = "+s1.getX());
		
	}
}
