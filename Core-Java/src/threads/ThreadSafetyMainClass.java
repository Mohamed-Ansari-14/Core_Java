package threads;

public class ThreadSafetyMainClass 
{
	public static void main(String[] args) 
	{
		Greeting g1 = new Greeting();
		Greeting g2 = new Greeting();
		Greeting g3 = new Greeting();
		
		g1.start();
		g2.start();
		g3.start();
	}
}
