package deadLockHandling;

public class BookTicketThread extends Thread
{
	Ticket tkt = null;
	
	public BookTicketThread(Ticket tkt)
	{
		this.tkt=tkt;
	}
	
	public void run()
	{
		tkt.bookTicket();
	}
}
