package randomLogics_2;

public class DeadLockExample 
{
	public static void main(String[] args) 
	{
		final String r1 = "Resource 1";
		final String r2 = "Resource 2";
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				synchronized (r1)
				{
					System.out.println("Thread 1 acquired lock on Resource 1");
					try 
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					synchronized (r2) 
					{
						System.out.println("Thread 1 acquired lock on Resource 2");
					}
				}
			}
		};
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				synchronized (r2)
				{
					System.out.println("Thread 2 acquired lock on Resource 2");
					try
					{
						Thread.sleep(1000);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					synchronized (r1) 
					{
						System.out.println("Thread 2 acquired lock on Resource 1");
					}
				}
			}
		};
	
		t1.start();
		t2.start();
	}
}













