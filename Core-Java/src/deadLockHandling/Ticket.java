package deadLockHandling;

public class Ticket 
{
	private static int availableTickets = 2;
	
	public synchronized void bookTicket()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" is Started Booking...");
		if(availableTickets>0)
		{
			availableTickets --;
			System.out.println(name+" is Got the Ticket and Remaining Tickets = "+availableTickets);
		}
		else
		{
			System.out.println(name+" Not Got the Ticket...");
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		bookTicket();
	}
	
	public synchronized void cancelTicket()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name+" is Cancelling his Ticket...");
		availableTickets += 3;
		notifyAll();
	}
}


















