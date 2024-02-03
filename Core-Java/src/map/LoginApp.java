package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginApp 
{
	public static void main(String[] args)
	{
		Map<String, String> users = new HashMap<>();
		users.put("Ram", "1234");
		users.put("Sam", "555");
		users.put("Gopal","000");
		
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
				System.out.println("Welcome Mr. "+username);
			else
				System.out.println("Invalid Password...");
		}
		else
			System.out.println("Invalid UserName...");
	}
}
