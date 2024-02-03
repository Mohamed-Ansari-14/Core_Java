package randomLogics_1;

public class CreatingDeadlock 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Object o1 = new Object();
		synchronized (o1) 
		{
			o1.wait();
		}
		System.out.println("Not Happen");
	}
}
