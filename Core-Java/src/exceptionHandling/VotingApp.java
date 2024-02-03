package exceptionHandling;

import java.util.Scanner;

class InvalidAgeForVoteException extends Exception
{
	public InvalidAgeForVoteException() 
	{
		System.out.println("InvalidAgeForVoteException");
	}
	void dontVote()
	{
		System.out.println("You Are Not Eligible to Vote");
	}
}

public class VotingApp
{
	private static void check(int age) 
	{
		if(age>=18)
			System.out.println("You Can Vote");
		else
		{
			try
			{
				throw new InvalidAgeForVoteException();
			}
			catch(InvalidAgeForVoteException e1)
			{
				e1.dontVote();
			}
		}
	}
	private static void check1(int age) throws InvalidAgeForVoteException 
	{
		if(age>=18)
			System.out.println("You Can Vote");
		else
		{
			throw new InvalidAgeForVoteException();
		}
		
	}
	public static void main(String[] args) throws InvalidAgeForVoteException 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		check(age);
		check1(age);
		sc.close();
	}
}












