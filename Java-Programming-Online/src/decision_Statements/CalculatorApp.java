package decision_Statements;

import java.util.Scanner;

public class CalculatorApp 
{
	public static void calApp()
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter Two Number: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
		
			System.out.println();
			
			System.out.println("Use + , - , * , % , / ");
			String symbol = sc.next();
		
			switch(symbol)
			{
				case "+" :
					System.out.println("Addition ==> "+num1+"+"+num2+" = "+(num1+num2));
					break;
				
				case "-" :
					System.out.println("Subtraction ==> "+num1+"-"+num2+" = "+(num1-num2));
					break;
					
				case "*" :
					System.out.println("Multiplication ==> "+num1+"*"+num2+" = "+(num1*num2));
					break;
				
				case "%" :
					System.out.println("Modules ==> "+num1+"%"+num2+" = "+(num1%num2));
					break;
				
				case "/" :
					System.out.println("Division ==> "+num1+"/"+num2+" = "+(num1/num2));
					break;
				
				default:
					System.out.println("Enter Only These Symbols + , - , * , % , / ");
			}
			
			System.out.println("Do you want to do more calculation ???");
			System.out.println("Type 1 to continue , Type 2 for Exit");
			
			int res = sc.nextInt();
			
			if(res == 1)
				calApp();
		}
	}
	
	public static void main(String[] args)
	{
		calApp();
	}
}












