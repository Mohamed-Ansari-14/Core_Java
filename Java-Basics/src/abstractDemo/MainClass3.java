package abstractDemo;

interface AbstractDemo
{
	void dog();//-->by default public ,static and final
	void cat();
}

class Demo implements AbstractDemo
{
	public void dog()
	{
		System.out.println("Dog is Barking");
	}
	public void cat()
	{
		System.out.println("This is a Cat");
	}
}

public class MainClass3
{
	public static void main(String[] args) 
	{
		AbstractDemo a1 = new Demo();
		a1.dog();
		a1.cat();
	}
}
