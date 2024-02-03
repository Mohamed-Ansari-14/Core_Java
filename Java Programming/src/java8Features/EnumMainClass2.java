package java8Features;

enum Level
{
	LOW,MEDIUM,HIGH
}

public class EnumMainClass2 
{
	Days d1;
	
	EnumMainClass2(Days d1)
	{
		this.d1 = d1;
	}
	
	public void display()
	{
		switch(d1)
		{
			case LOW:
				System.out.println("LOWER");
				break;
			case MEDIUM:
				System.out.println("MEDIUM");
				break;
			case HIGH:
				System.out.println("HIGH");
				break;
			default:
				System.out.println("Error....");
		}
	}
	
	public static void main(String[] args) 
	{
		String str = "MEDIUM";
		EnumMainClass2 e2 = new EnumMainClass2(Days.valueOf(str));
		e2.display();
	}
}












