package restaurantApplication;

public class Zomato 
{
	String customerName;
	long contactNumber;
	String address;
	String dishes;
	int quantity;
	double price;
	//double cGst = 0.06,sGst = 0.06;
	
	Zomato(String customerName,long contactNumber,String address,String dishes,int quantity,double price)
	{
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.dishes = dishes;
		this.quantity = quantity;
		this.price = price;
	}
	
	Zomato(String customerName,long contactNumber,String address)
	{
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	void calPrice()
	{
		if(quantity == 2)
		{
			price = price * 2;
			System.out.println("Total price = "+price);
		}
		else if(quantity == 3)
		{
			price = price * 3;
			System.out.println("Total price = "+price);
		}
		else if(quantity == 4)
		{
			price = price * 4;
			System.out.println("Total price = "+price);
		}
		else if(quantity == 5)
		{
			price = price * 5;
			System.out.println("Total price = "+price);
		}
	}
	
	void payment(double amt)
	{
		if(price == amt)
		{
			System.out.println("Amount Paid = "+amt);
			System.out.println("Your payment is Sucessfull...");
		}
		else
		{
			System.out.println("Amount Paid = "+amt);
			price = price - amt;
			System.out.println("Balance Payment Amount is "+price);
		}
	}
}
















