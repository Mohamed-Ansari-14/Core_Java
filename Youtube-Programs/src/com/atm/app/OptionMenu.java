package com.atm.app;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account
{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<>();
	
	public void getLogin() throws IOException
	{
		try
		{
			data.put(555, 555);
			data.put(999, 000);
				
			System.out.println("Welcome to State Bank Of India !!!");
			System.out.println("Enter Your Customer Number: ");
			setCustomerNumber(menuInput.nextInt());
				
			System.out.println("Enter Your PIN Number: ");
			setPinNumber(menuInput.nextInt());
			sleep();
		}
		catch(Exception e)
		{
			System.out.println("\n"+"Invalid Characters. Only Numbers."+"\n");
		}
			
		int cn = getCustomerNumber();
		int pn = getPinNumber();
		if(data.containsKey(cn) && data.get(cn)==pn)
		{
			getAccountType();
			sleep();
		}
		else
		{
			System.out.println("\n"+"Wrong Customer Number or PIN Number"+"\n");
		}
	}
	
	public void sleep()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void getAccountType()
	{
		System.out.println("Select the Account you want to Access: ");
		System.out.println("Type 1 - Current Account");
		System.out.println("Type 2 - Savings Account");
		System.out.println("Type 3 - Exit");
		
		int selection = menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			getChecking();
			break;
		case 2:
			getSavings();
			break;
		case 3:
			System.out.println("Thank You For Using SBI ATM."+"\n");
			break;
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
		}
	}
	
	public void getChecking()
	{
		sleep();
		System.out.println("Current Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2  Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		
		int selection = menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			System.out.println("Current Balance: "+moneyFormat.format(getCurrentAccBalance()));
			getAccountType();
			break;
		case 2:
			getCurrentAccWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCurrentAccDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank You For Using SBI ATM."+"\n");
			break;
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			getChecking();
		}	
	}
	
	public void getSavings()
	{
		sleep();
		System.out.println("Savings Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		
		int selection = menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			System.out.println("Savings Balance: "+moneyFormat.format(getSavingsAccBalance()));
			getAccountType();
			break;
		case 2:
			getSavingsAccWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingsAccDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank You For Using SBI ATM."+"\n");
			break;
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			getChecking();
		}	
	}
			
	
}




















