package bankApplication;

public class DebitCard extends SavingsAccount
{
	double accBal = SavingsAccount.accBal;
	
	int cardNo;
	int pin;
	int cvv;
	String cardHolderName;
	
	DebitCard(int cardNo,int pin,int cvv,String cardHolderName)
	{
		this.cardNo = cardNo;
		this.pin = pin;
		this.cvv = cvv;
		this.cardHolderName = cardHolderName;
	}
	
	void deposit(double amt)
	{
		System.out.println("Depositing Amount to Savings Account using Debit Card = "+amt);
		SavingsAccount.accBal = SavingsAccount.accBal + amt;
		super.balanceEnquiry();
	}
	
	void withdraw(double amt)
	{
		System.out.println("Withdrawing Amount from Savings Account using Debit Card = "+amt);
		SavingsAccount.accBal = SavingsAccount.accBal - amt;
		super.balanceEnquiry();
	}
	
	/*void calTds()
	{
		if(SavingsAccount.accBal>=500000)
		{
			System.out.println("you have to pay a tax of 5 percentage of your Balance");
			System.out.println("Tax Amount ="+accBal*0.05);
		}
		else
			System.out.println("No need to pay the tax");
	}*/
}
