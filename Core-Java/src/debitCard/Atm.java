package debitCard;

public class Atm 
{
	public static void main(String[] args) throws InterruptedException 
	{
		DebitCard d1 = new DebitCard();
		d1.scanner();
		System.out.println(d1.generateOtp());
		d1.withdraw();
		d1.res();
	}
}
