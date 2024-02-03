package bankApplication;

public class CreditCard 
{
double accBal = SavingsAccount.accBal;
	
	int cardNo;
	int pin;
	int cvv;
	String cardHolderName;
	
	double credBal;
	CreditCard(int cardNo,int pin,int cvv,String cardHolderName)
	{
		this.cardNo = cardNo;
		this.pin = pin;
		this.cvv = cvv;
		this.cardHolderName = cardHolderName;
		
		if(accBal>=400000)
		{
			credBal = 200000;
			System.out.println("Your Savings Account is Eligible to use Credit Card upto 2 Lakhs...");
		}
		else if(accBal>=200000)
		{
			credBal = 100000;
			System.out.println("Your Savings Account is Eligible to use Credit Card upto 1 Lakhs...");
		}
		else
			System.out.println("Your Savings Account is not Eligible to use Credit Card...");
	}
	
	void deposit(double amt)
	{
		if(accBal>=200000)
		{
			System.out.println("Depositing Amount to Credit Card = "+amt);
			credBal = credBal + amt;
		}
		else
			System.out.println("You Cannot Access the Credit Card...");
	}
	
	void withdraw(double amt)
	{
		if(accBal>=200000)
		{
			System.out.println("Withdrawing Amount from Credit Card = "+amt);
			credBal = credBal - amt;
		}
		else
			System.out.println("You Cannot Access the Credit Card...");
	}
	
	final void balanceEnquiry()
	{
		System.out.println("Your Credit Availabe Balance ="+credBal);
	}
}
