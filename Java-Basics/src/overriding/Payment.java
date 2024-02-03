package overriding;

class ShoppingV1
{
	void payment()
	{
		System.out.println("Payment is Based on COD");
	}
}

class ShoppingV2 extends ShoppingV1
{
	void payment()
	{
		System.out.println("Payment is Based on CARD");
	}
}
public class Payment 
{
	public static void main(String[]args) 
	{
		ShoppingV1 s1 = new ShoppingV1();
		s1.payment();
		
		ShoppingV2 s2 = new ShoppingV2();
		s2.payment();
	}
}
