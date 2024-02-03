package abstraction;

interface Pet
{
	void dog();
	void cat();
}

abstract class dummy implements Pet
{
	//interface to abstract class also we have to use implements keyword
}

class Sound implements Pet
{
	public void dog()	//we have to use public keyword beacuse we can't reduce the visibility
	{
		System.out.println("Dog is Barking");
	}
	
	public void cat()
	{
		System.out.println("This is Cat");
	}
}

public class MainClass1 
{
	public static void main(String[] args)
	{
		Pet pet = (Pet) new Sound();
		pet.dog();
		pet.cat();
	}
}
