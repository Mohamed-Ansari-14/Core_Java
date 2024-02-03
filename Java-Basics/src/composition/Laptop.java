package composition;

class Memory
{
	int ram;
	int rom;
	
	Memory(int ram,int rom)
	{
		this.ram= ram;
		this.rom = rom;
	}
}
class Processor
{
	String process;
	Processor(String process)
	{
		this.process = process;
	}
}
class Computer
{
	String brand;
	Computer(String brand)
	{
		this.brand = brand;
	}
	
	Memory m1 = new Memory(8,256);
	Processor p1 = new Processor("Ryzen");
	
}

public class Laptop 
{
	public static void main(String[]args)
	{
		Computer c1 = new Computer("Lenova");
		System.out.println("Brand = "+c1.brand);
		System.out.println("Processor = "+c1.p1.process);
		System.out.println("Ram = "+c1.m1.ram);
		System.out.println("Rom = "+c1.m1.rom);
	}
}
