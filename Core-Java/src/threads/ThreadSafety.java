package threads;

public class ThreadSafety 
{
	public synchronized static void greet()
	{
		String s1 = "Happy Morning";
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i));
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e1)
		{
			e1.printStackTrace();
		}
		System.out.println();
	}
}

class Greeting extends Thread
{
	public void run()
	{
		ThreadSafety.greet();
	}
}


