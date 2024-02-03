package railway;

import java.util.Scanner;
public class TrainApplication 
{
	public static void main(String[] args) 
	{
		double totalCost = 1;
		//String payment = "";
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		TrainApp app = new TrainApp();
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Station List:");
		System.out.println("----------------------------------------------------------");
		app.stationDetails();
		System.out.println("----------------------------------------------------------");
		
		System.out.print("Enter Source Station: ");
		String src = sc.next().toLowerCase();
		System.out.print("Enter Destination Station: ");
		String des = sc.next().toLowerCase();
		
		System.out.println("If You Want Return Ticket Also Means (Type yes or no)");
		String res = sc.next().toLowerCase();
		
		totalCost = app.cost(src, des);
		
		if(res.equals("yes"))
		{
			System.out.println("Total Cost = "+totalCost +" x "+"2");
			System.out.println(totalCost = totalCost * 2);
		}
		
		System.out.println("How Many Tickets Needed: ");
		int count = sc.nextInt();
		
		if(count <=5)
		{
			switch(count)
			{
			case 1:
				totalCost = totalCost * 1;
				System.out.println("Total Cost = "+totalCost);
				break;
			case 2:
				totalCost = totalCost * 2;
				System.out.println("Total Cost = "+totalCost);
				break;
			case 3:
				totalCost = totalCost * 3;
				System.out.println("Total Cost = "+totalCost);
				break;
			case 4:
				totalCost = totalCost * 4;
				System.out.println("Total Cost = "+totalCost);
				break;
			case 5:
				totalCost = totalCost * 5;
				System.out.println("Total Cost = "+totalCost);
				break;
			}
		}
		else
		{
			System.out.println("Maximum 5 Tickets Only Allowed...");
		}
		
		
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("Selected From :"+src);
		System.out.println("Selected To :"+des);
		System.out.println("No of Tickets :"+count);
		System.out.println("Ticket Fare is "+totalCost);
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		
		/*System.out.println("Choose the Mode of Payment: ");
		System.out.println("==>If Card Payment Means Type Card Payment: ");
		System.out.println("==>If Cash Payment Means Type Cash Payment: ");
		//payment = sc.next().toLowerCase();*/
		
		Payment pay = new Payment();
		pay.netBanking();
		if(totalCost == pay.amt)
		{
			System.out.println("Paided Amount = "+pay.amt);
			System.out.println("Your Payment is Sucessfull...");
			System.out.println("Your Ticket is Confirmed...");
		}
		else
		{
			System.out.println("Payment is Failure...");
			System.out.println("Check the Total Cost & Make Payment...");
		}
			
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		
	}
}























