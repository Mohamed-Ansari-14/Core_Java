package bankApp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginByUserNameAndPassword 
{
	public void LoginByUserName()
	{
		Map<String, String> users = new HashMap<>();
		users.put("Ans", "1410");
		users.put("Ansari", "786");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter UserName:");
		String username = sc.next();
		
		if(users.containsKey(username))
		{
			System.out.print("Enter Password: ");
			String password = sc.next();
			String actualPassword = users.get(username);
			if(actualPassword.equals(password))
			{
				System.out.println("Welcome Mr. "+username);
				System.out.println("Login Sucessfully...");
			}
			else
				System.out.println("Invalid Password...");
		}
		else
			System.out.println("Invalid UserName...");
	}
	
}
