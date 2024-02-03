package bankApp;

import java.util.Scanner;

public class LoginByCard 
{
	Scanner sc1 = new Scanner(System.in);
	double accBal = 25000.0;
	double amt;
	long cardNumber;
	int pin;
	int cvv;
	String otp = "";
	String checkOtp = "";
	String response;
	String res;
	
	public void scanner()
	{
		System.out.println("Enter Card Number: ");
		cardNumber = sc1.nextLong();
		if(cardNumber == 987654321)
		{
			System.out.println("Enter Pin: ");
			pin = sc1.nextInt();
		}
		else
		{
			System.out.println("Check the Card Number...");
		}
		
		if(pin == 8900)
		{
			System.out.println("User Name - Mohamed Ansari");
			System.out.println("Enter CVV: ");
			cvv = sc1.nextInt();
			if(cvv == 123)
			{
				System.out.println("Login Sucessfully...");
			}
			else
			{
				System.out.println("Check the CVV...");
			}
		}
		else
		{
			System.out.println("Please Check the Pin Number...");
		}
	}
	
	/*public String generateOtp()
	{
		if(true)
		{
		int n1 = (int)(Math.random()*10);
		int n2 = (int)(Math.random()*10);
		int n3 = (int)(Math.random()*10);
		int n4 = (int)(Math.random()*10);
		otp = otp+n1+n2+n3+n4;
		}
		return otp;
	}
	
	public void withdraw()
	{
			System.out.println("Enter the OTP: ");
			checkOtp = sc1.next();
			if(otp.equals(checkOtp))
			{
				System.out.println("Withdraw is processing....");
				accBal = accBal - amt;
				System.out.println("Do you want to Display Balance...Type Yes/No");
				response = sc1.next().toLowerCase();
			}
			else
			{
				System.out.println("You Entered Wrong Otp...Please Check It");
			}
			
			if(response.equals("yes"))
			{
				System.out.println("Your Available Balance is "+accBal);
			}
			else
			{
				System.out.println("Your Transaction is Completed");
			}
	}
	
	public void res()
	{
		System.out.println("Do you want to continue the Transaction");
		System.out.println("If you want to continue Type(Yes/No)");
		res = sc1.next().toLowerCase();
		if(res.equals("yes"))
		{
			scanner();
		}
	}*/
}
