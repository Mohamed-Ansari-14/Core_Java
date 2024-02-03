package interfaceDemo;

interface Sample
{
	int a = 100;	//By Default public ,Static and Final
	
	void m1(); 		//By Default Abstract
	abstract void m2();
}

class Sample2 implements Sample
{
	public void m1()	//-->We Should define with Public Because...
						//We can't reduce the Visibility
	{
		System.out.println("Default Abstract Method");
	}
	
	public void m2()
	{
		System.out.println("Abstract Method");
	}
}

public class InterfaceMainClass 
{
	public static void main(String[] args) 
	{
		//Sample s1 = new Sample2();
		Sample2 s1 = new Sample2();
		s1.m1();
		s1.m2();
	}
}
