package realTimeExamples;

class SavingsAccount
{
	static String bankName = "State Bank of India";
	long accNo;
	static double accBal;
	String branch;
	static String accType = "Savings Account";
	
	SavingsAccount(long accNo,double accBal,String branch)
	{
		this.accNo = accNo;
		SavingsAccount.accBal = accBal;
		this.branch = branch;
	}
	
	SavingsAccount()
	{
		
	}
	
	void deposit(double amt)
	{
		System.out.println("Depositing Amount to Savings Account = "+amt);
		accBal = accBal + amt;
		balanceEnquiry();
	}
	
	void withdraw(double amt)
	{
		System.out.println("Withdrawing Amount from Savings Account = "+amt);
		accBal = accBal - amt;
		balanceEnquiry();
	}
	
	final void balanceEnquiry()
	{
		System.out.println("Your Savings Account Balance ="+accBal);
	}
	
	void minBal()
	{
		if(accBal<=1000)
		{
			System.out.println("Charges will be collected for Low Balance Rs."+(accBal*0.03));
			accBal = accBal - accBal*0.03;
			balanceEnquiry();
		}
	}
	
	void calTds()
	{
		if(accBal>=500000)
		{
			System.out.println("you have to pay a tax of 5 percentage of your Balance");
			System.out.println("Tax Amount ="+accBal*0.05);
		}
		else
			System.out.println("No need to pay the tax");
	}
}

class DebitCard extends SavingsAccount
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
	
	void withdraw(double amt)		//Not Working properly.................. 
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

class CreditCard
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

public class BankApp 
{
	public static void main(String[]args)
	{
		System.out.println("Bank Name: "+SavingsAccount.bankName); 
		SavingsAccount s1 = new SavingsAccount(1445559873,400000,"Tondiarpet");
		System.out.println("Accout Number: "+s1.accNo);
		System.out.println("Branch: "+s1.branch);
		System.out.println("Account Type: "+SavingsAccount.accType);
		System.out.println();
		System.out.println("Your Savings Account Initial Balance ="+SavingsAccount.accBal); 
		s1.deposit(500);
		s1.withdraw(1000);
		s1.minBal();
		s1.calTds();
		
		System.out.println("--------------------------------");
		
		System.out.println("Debit Card Transactions");
		DebitCard d1 = new DebitCard(123456,1410,756,"Ansari");
		//System.out.println(d1.accBal);
		d1.deposit(10000);
		d1.withdraw(5000);
		//d1.calTds();
		
		System.out.println("--------------------------------");
		
		System.out.println("Credit Card Transactions");
		CreditCard c1 = new CreditCard(123456,1410,756,"Ansari");
		c1.balanceEnquiry();
		c1.withdraw(10000);
		c1.balanceEnquiry();
		c1.deposit(5000);
		c1.balanceEnquiry();
	}
}
