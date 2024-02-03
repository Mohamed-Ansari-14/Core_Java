package com.atm.app;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account 
{
	private int customerNumber;
	private int pinNumber;
	private double CurrentAccountBalance = 30000.0;
	private double savingsAccountBalance = 5000.0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("##0.00");
	
	public double getCurrentAccBalance() {
		return CurrentAccountBalance;
	}
	public double getSavingsAccBalance() {
		return savingsAccountBalance;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	public double calCurrentAccWithdraw(double amount){
		CurrentAccountBalance = CurrentAccountBalance - amount;
		return CurrentAccountBalance;
	}
	
	public double calSavingsAccWithdraw(double amount){
		savingsAccountBalance = savingsAccountBalance - amount;
		return savingsAccountBalance;
	}
	
	public double calCurrentAccDeposit(double amount){
		CurrentAccountBalance = CurrentAccountBalance + amount;
		return CurrentAccountBalance;
	}
	
	public double calSavingsAccDeposit(double amount){
		savingsAccountBalance = savingsAccountBalance + amount;
		return savingsAccountBalance;
	}
	
	public void getCurrentAccWithdrawInput() 
	{
		System.out.println("Checking Account Balance: "+moneyFormat.format(CurrentAccountBalance));
		System.out.print("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if((CurrentAccountBalance - amount) >= 0) {
			calCurrentAccWithdraw(amount);
			System.out.println("New Checking Account Balance: "+moneyFormat.format(CurrentAccountBalance));
		}else {
			System.out.println("Balance Cannot be Negative."+"\n");
		}
	}
	
	public void getSavingsAccWithdrawInput() 
	{
		System.out.println("Savings Account Balance: "+moneyFormat.format(savingsAccountBalance));
		System.out.print("Amount you want to withdraw from Savings Account: ");
		double amount = input.nextDouble();
		
		if((savingsAccountBalance - amount) >= 0) {
			calSavingsAccWithdraw(amount);
			System.out.println("New savings Account Balance: "+moneyFormat.format(savingsAccountBalance));
		}else {
			System.out.println("Balance Cannot be Negative."+"\n");
		}
	}
	
	public void getCurrentAccDepositInput() 
	{
		System.out.println("Checking Account Balance: "+moneyFormat.format(CurrentAccountBalance));
		System.out.print("Amount you want to Deposit to Checking Account: ");
		double amount = input.nextDouble();
		
		if((CurrentAccountBalance + amount) >= 0) {
			calCurrentAccDeposit(amount);
			System.out.println("New Checking Account Balance: "+moneyFormat.format(CurrentAccountBalance));
		}else {
			System.out.println("Balance Cannot be Negative."+"\n");
		}
	}
	
	public void getSavingsAccDepositInput() 
	{
		System.out.println("Savings Account Balance: "+moneyFormat.format(savingsAccountBalance));
		System.out.print("Amount you want to Deposit to Savings Account: ");
		double amount = input.nextDouble();
		
		if((savingsAccountBalance + amount) >= 0) {
			calSavingsAccDeposit(amount);
			System.out.println("New savings Account Balance: "+moneyFormat.format(savingsAccountBalance));
		}else {
			System.out.println("Balance Cannot be Negative."+"\n");
		}
	}
}





















