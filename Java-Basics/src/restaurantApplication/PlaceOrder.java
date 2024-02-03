package restaurantApplication;

public class PlaceOrder 
{
	void placeOrder(Zomato z)
	{
		if(z instanceof Hyderabad)
		{
			System.out.println("--------------------------------------------");
			System.out.println("Your Order Placed Sucessfully...");
			Hyderabad h = (Hyderabad)z;
			System.out.println("Customer Name: "+h.customerName);
			System.out.println("Customer Number: "+h.contactNumber);
			System.out.println("Customer Address: "+h.address);
			System.out.println("Choosen Dish: "+h.dishes);
			System.out.println("Each Price :"+h.price);
			System.out.println("Quantity :"+h.quantity);
			z.calPrice();
			z.payment(500);
			System.out.println("--------------------------------------------");
		}
		
		else if(z instanceof Dominos)
		{
			if(z instanceof Dominos)
			{
				System.out.println("--------------------------------------------");
				System.out.println("Your Order Placed Sucessfully...");
				Dominos d = (Dominos)z;
				System.out.println("Customer Name: "+d.customerName);
				System.out.println("Customer Number: "+d.contactNumber);
				System.out.println("Customer Address: "+d.address);
				System.out.println("Choosen Dish: "+d.dishes);
				System.out.println("Each Price :"+d.price);
				System.out.println("Quantity :"+d.quantity);
				z.calPrice();
				z.payment(1500);
				System.out.println("--------------------------------------------");
			}
		}
		
		else if(z instanceof BBQ)
		{
			System.out.println("--------------------------------------------");
			System.out.println("Your Order Placed Sucessfully...");
			BBQ b = (BBQ)z;
			System.out.println("Customer Name: "+b.customerName);
			System.out.println("Customer Number: "+b.contactNumber);
			System.out.println("Customer Address: "+b.address);
			System.out.println("Choosen Dish: "+b.dishes);
			System.out.println("Each Price :"+b.price);
			System.out.println("Quantity :"+b.quantity);
			z.calPrice();
			z.payment(500);
			System.out.println("--------------------------------------------");
		}
	}
}


















