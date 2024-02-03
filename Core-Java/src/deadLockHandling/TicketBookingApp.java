package deadLockHandling;

public class TicketBookingApp 
{
	public static void main(String[] args) 
	{
		Ticket tkt = new Ticket();
		BookTicketThread btt1 = new BookTicketThread(tkt);
		BookTicketThread btt2 = new BookTicketThread(tkt);
		BookTicketThread btt3 = new BookTicketThread(tkt);
		BookTicketThread btt4 = new BookTicketThread(tkt);
		BookTicketThread btt5 = new BookTicketThread(tkt);
		
		CancelTicketThread ctt1 = new CancelTicketThread(tkt);
		CancelTicketThread ctt2 = new CancelTicketThread(tkt);
		
		btt1.setName("t1");
		btt2.setName("t2");
		btt3.setName("t3");
		btt4.setName("t4");
		btt5.setName("t5");
		
		ctt1.setName("c1");
		ctt2.setName("c2");
		
		btt1.start();
		btt2.start();
		btt3.start();
		btt4.start();
		btt5.start();
		
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		ctt1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ctt2.start();
	}
}










