package java8Features;

enum Days
{
	LOW,MEDIUM,HIGH
}

public class EnumMainClass1 
{
	public static void main(String[] args) 
	{
		for(Days d1:Days.values())
		{
			System.out.println(d1.ordinal()+1+"-->"+d1);
		}
	}
}
