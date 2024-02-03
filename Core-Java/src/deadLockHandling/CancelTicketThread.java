package deadLockHandling;

public class CancelTicketThread extends Thread
{
	Ticket tkt = null;
	
	public CancelTicketThread(Ticket tkt)
	{
		this.tkt = tkt;
	}
	
	public void run()
	{
		tkt.cancelTicket();
	}
}
