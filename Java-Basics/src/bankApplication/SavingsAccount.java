package bankApplication;

public class SavingsAccount 
{
	static String bankName = "State Bank of India";
	long accNo;
	static double accBal;
	String branch;
	static String accType = "Savings Account";
	String accHolderName;
	
	SavingsAccount(long accNo,double accBal,String branch,String accHolderName)
	{
		this.accNo = accNo;
		SavingsAccount.accBal = accBal;
		this.branch = branch;
		this.accHolderName = accHolderName;
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
