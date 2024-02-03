package composition;

class Engine
{
	int cc;
	Engine(int cc)
	{
		this.cc = cc;
	}
}

class Gear
{
	int gear;
	Gear(int gear)
	{
		this.gear = gear;
	}
}

class Bike
{
	String brand;
	Bike(String brand)
	{
		this.brand = brand;
	}
	static Engine e1 = new Engine(350);
	Gear g1 = new Gear(5);
}
public class TwoWheeler 
{
	public static void main(String[]args)
	{
		Bike b1 = new Bike("RE");
		System.out.println("Brand = "+b1.brand);
		System.out.println("CC = "+Bike.e1.cc);
		System.out.println("Gear = "+b1.g1.gear);
	}
}
