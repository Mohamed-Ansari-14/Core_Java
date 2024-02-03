package realTimeExamples;

class Products
{
	int billNo;
	String brand;
	double price;
	double shippingFee = 50;
	
	Products(int billNo,String brand,double price)
	{
		this.billNo = billNo;
		this.brand = brand;
		this.price = price;
	}
	
	void calDiscount_Total()
	{
		price = price*0.02;
	}
}

class Mobile extends Products
{
	long imeiNo;
	
	Mobile(int billNo,String brand,double price,long imeiNo)
	{
		super(billNo,brand,price);
		this.imeiNo = imeiNo;
	}
	
	void calDiscount_Total()
	{
		double disPrice = price*0.03;
		System.out.println("Discount: "+disPrice);
		price = price - disPrice + shippingFee;
		System.out.println("Total Price: "+price);
	}
}

class Laptop extends Products
{
	int serielNo;
	
	Laptop(int billNo,String brand,double price,int serielNo)
	{
		super(billNo,brand,price);
		this.serielNo = serielNo;
	}
	
	void calDiscount_Total()
	{
		double disPrice = price*0.05;
		System.out.println("Discount: "+disPrice);
		price = price - disPrice + shippingFee;
		System.out.println("Total Price: "+price);
	}
}

class Tv extends Products
{
	int modelNo;
	
	Tv(int billNo,String brand,double price,int modelNo)
	{
		super(billNo,brand,price);
		this.modelNo = modelNo;
	}
	
	void calDiscount_Total()
	{
		double disPrice = price*0.08;
		System.out.println("Discount: "+disPrice);
		price = price - disPrice + shippingFee;
		System.out.println("Total Price: "+price);
	}
}

class Ac extends Products
{
	int ton;
	Ac(int billNo,String brand,double price,int ton)
	{
		super(billNo,brand,price);
		this.ton = ton;
	}
	
	void calDiscount_Total()
	{
		double disPrice = price*0.075;
		System.out.println("Discount: "+disPrice);
		price = price - disPrice + shippingFee;
		System.out.println("Total Price: "+price);
	}
}

class Cart
{
	void addCart(Products p1)
	{
		if(p1 instanceof Mobile)
		{
			System.out.println("--------------------------");
			Mobile m1 = (Mobile)p1;		//DownCasting
			System.out.println("Bill Number: "+m1.billNo);
			System.out.println("Mobile Brand: "+m1.brand);
			System.out.println("IMEI Number = "+m1.imeiNo);
			System.out.println("Price: "+m1.price);
			System.out.println("Shipping Fee: "+p1.shippingFee);
			m1.calDiscount_Total();
			//m1.calTotalCost();
			System.out.println("--------------------------");
			
		}
		else if(p1 instanceof Laptop)
		{
			System.out.println("--------------------------");
			Laptop l1 = (Laptop)p1;		//DownCasting
			System.out.println("Bill Number: "+l1.billNo);
			System.out.println("Laptop Brand: "+l1.brand);
			System.out.println("Seriel Number = "+l1.serielNo);
			System.out.println("Price: "+l1.price);
			System.out.println("Shipping Fee: "+p1.shippingFee);
			l1.calDiscount_Total();
			System.out.println("--------------------------");
		}
		else if(p1 instanceof Tv)
		{
			System.out.println("--------------------------");
			Tv t1 = (Tv)p1;				//DownCasting
			System.out.println("Bill Number: "+t1.billNo);
			System.out.println("TV Brand: "+t1.brand);
			System.out.println("Model Number = "+t1.modelNo);
			System.out.println("Price: "+t1.price);
			System.out.println("Shipping Fee: "+p1.shippingFee);
			t1.calDiscount_Total();
			System.out.println("--------------------------");
		}
		else if(p1 instanceof Ac)
		{
			System.out.println("--------------------------");
			Ac a1 = (Ac)p1;				//DownCasting
			System.out.println("Bill Number: "+a1.billNo);
			System.out.println("Ac Brand = "+a1.brand);
			System.out.println("Ton: "+a1.ton);
			System.out.println("Price: "+a1.price);
			System.out.println("Shipping Fee: "+p1.shippingFee);
			a1.calDiscount_Total();
			System.out.println("--------------------------");
		}
	}
}
public class ShoppingApplication 
{
	public static void main(String[] args)
	{
		Cart c1 = new Cart();
		c1.addCart(new Mobile(12,"Samsung Galaxy S23",119999,15236987));
		c1.addCart(new Laptop(13,"Lenova",59999,456978));
		c1.addCart(new Tv(14,"MI",34999,258693));
		c1.addCart(new Ac(15,"Kenstar",44999,2));
	}
}







