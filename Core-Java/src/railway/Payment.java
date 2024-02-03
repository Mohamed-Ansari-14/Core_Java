package railway;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Payment 
{
	Scanner sc = new Scanner(System.in);
	double accBal = 10000.0;
	double amt;
	
	public void netBanking()
	{
		Map<String, String> users = new HashMap<>();
		users.put("rock","123");
		users.put("gayle","555");
		users.put("ans","1410");
		
		System.out.print("Enter UserName: ");
		String username = sc.next();
		
		if(users.containsKey(username))
		{
			System.out.print("Enter Password: ");
			String password = sc.next();
			String actualPassword = users.get(username);
			
			if(actualPassword.equals(password))
			{
				System.out.println("Login SucessFully...");
				System.out.print("Enter the Amount to Pay: ");
				amt = sc.nextDouble();
				if(amt>accBal)
					System.out.println("Insufficient Balance...");
				else
				{
					accBal = accBal - amt;
					//System.out.println("Available Balance = "+accBal);
				}
			}
			else
			{
				System.out.println("Invaid Password...");
			}
		}
		else
		{
			System.out.println("Invalid Username...");
		}
	}
}



















