package bankApp;

import java.util.Scanner;

public class Account 
{
	long accNum;
	String accHolderName;
	String branch;
	String ifsc;
	double accBal = 5000.0;
	
	Scanner sc = new Scanner(System.in);
	
	public void scanner()
	{
		System.out.println("Welcome to State Bank of India");
		/*System.out.println("Enter Your Account Number: ");
		accNum = sc.nextLong();
		System.out.println("Enter Account Holder Name: ");
		accHolderName = sc.next();
		System.out.println("Enter Branch: ");
		branch = sc.next();
		System.out.println("Enter IFSC Code: ");
		ifsc = sc.next();*/
	}
	
	public void deposit()
	{
		double amt = 0.0;
		System.out.println("Enter the amount to Deposit: ");
		amt = sc.nextDouble();
		System.out.println("Depositing Amount = "+amt);
		accBal = accBal + amt;
		System.out.println("Do You want to Display the Balance (Type Yes/No)");
		String res = sc.next().toLowerCase();
		
		if(res.equals("yes"))
			System.out.println("Your Account Balance = "+accBal);
		else
			System.out.println("Transaction Completed...");
	}
	
	public void withdraw()
	{
		double amt = 0.0;
		System.out.println("Enter the Withdraw Amount: ");
		amt = sc.nextDouble();
		if(amt<=accBal)
		{
			System.out.println("Withdrawing Amount = "+amt);
			accBal = accBal - amt;
			System.out.println("Do You want to Display the Balance (Type Yes/No)");
			String res = sc.next().toLowerCase();
			
			if(res.equals("yes"))
				System.out.println("Your Account Balance = "+accBal);
			else
				System.out.println("Transaction Completed...");
		}
		else
		{
			System.out.println("Declined!!!...");
		}
	}
}











































