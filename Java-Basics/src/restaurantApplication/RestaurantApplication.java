package restaurantApplication;

public class RestaurantApplication 
{
	public static void main(String[] args) 
	{
		PlaceOrder p = new PlaceOrder();
		p.placeOrder(new Hyderabad("Ansari",8190010,"Chennai","Chicken Biriyani",02,270));
		p.placeOrder(new Dominos("Kumar",564258,"Tambaram","Cheesy Pizza",05,300));
		p.placeOrder(new BBQ("Raj",756850,"Central","Grill Chicken",03,350));
	}
	
}
