package bankApp;

public class BankApplication 
{
	public static void main(String[] args) 
	{
		/*Account a1 = new Account();
		a1.scanner();
		a1.deposit();
		a1.withdraw();*/
		LoginByUserNameAndPassword log = new LoginByUserNameAndPassword();
		log.LoginByUserName();
		
		LoginByCard log2 = new LoginByCard();
		log2.scanner();
		/*System.out.println(log2.generateOtp());
		log2.withdraw();
		log2.res();*/
	}
}
