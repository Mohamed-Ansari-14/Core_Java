package abstractDemo;

abstract class Account
{
	int accNo;
	double accBal;
	
	Account(int accNo,double accBal)
	{
		this.accNo = accNo;
		this.accBal = accBal;
	}
	
	abstract void deposit(double amt);
	abstract void withdraw(double amt);
	
	final void bal()
	{
		System.out.println("Your Account Balance = "+accBal);
	}
}

class SavingsAccount extends Account
{
	SavingsAccount(int accNo,double accBal)
	{
		super(accNo,accBal);
	}
	
	void deposit(double amt)
	{
		System.out.println(accBal = accBal+amt);
	}
	
	void withdraw(double amt)
	{
		System.out.println(accBal = accBal-amt);
	}
}

public class BankApp 
{
	public static void main(String[] args)
	{
		Account a1 = new SavingsAccount(1234,5000); 
		System.out.println("Account Number: "+a1.accNo);
		System.out.println("Account Balance: "+a1.accBal);
		a1.deposit(6000);
		a1.bal();
		a1.withdraw(1000);
		a1.bal();
	}
}













