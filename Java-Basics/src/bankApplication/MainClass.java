package bankApplication;

public class MainClass 
{
	public static void main(String[]args)
	{
		System.out.println("Bank Name: "+SavingsAccount.bankName); 
		SavingsAccount s1 = new SavingsAccount(1445559873,400000,"Tondiarpet","Ansari");
		System.out.println("Accout Number: "+s1.accNo);
		System.out.println("Account Holder Name: "+s1.accHolderName);
		System.out.println("Branch: "+s1.branch);
		System.out.println("Account Type: "+SavingsAccount.accType);
		System.out.println();
		System.out.println("Your Savings Account Initial Balance ="+SavingsAccount.accBal); 
		s1.deposit(500);
		s1.withdraw(1000);
		s1.minBal();
		s1.calTds();
		
		System.out.println("--------------------------------");
		
		System.out.println("Debit Card Transactions: ");
		DebitCard d1 = new DebitCard(123456,1410,756,"Ansari");
		//System.out.println(d1.accBal);
		d1.deposit(10000);
		d1.withdraw(5000);
		//d1.calTds();
		
		System.out.println("--------------------------------");
		
		System.out.println("Credit Card Transactions: ");
		CreditCard c1 = new CreditCard(123456,1410,756,"Ansari");
		c1.balanceEnquiry();
		c1.withdraw(10000);
		c1.balanceEnquiry();
		c1.deposit(5000);
		c1.balanceEnquiry();
	}
}
