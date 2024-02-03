package threads;

class Hero extends Thread
{
	public void run()
	{
		for(int a=1;a<=10;a++)
		{
			System.out.println("Value of A = "+a);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class Hero2 extends Thread
{
	public void run()
	{
		for(int b=10;b<=20;b++)
		{
			System.out.println("Value of B = "+b);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class Demon implements Runnable
{
	public void run()
	{
		for(int c=10;c>=1;c--)
		{
			System.out.println("Value of C = "+c);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

public class MainClass1 
{
	public static void main(String[] args) 
	{
		Hero h1 = new Hero();
		//Hero h2 = new Hero();
		h1.start();
		//h2.start();
		
		Hero2 h2 = new Hero2();
		h2.start();
		
		Demon d1 = new Demon();
		//Demon d2 = new Demon();
		
		Thread t1 = new Thread(d1);
		//Thread t2 = new Thread(d2);
		t1.start();
		//t2.start();
		
	}
}
















