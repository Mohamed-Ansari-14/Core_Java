package randomLogics_1;

//final class A
//{
//	
//}
//
//class B extends A	//-> Can't Inherit the final Class , but we can Inherit the Data & Function Members.
//{
//	
//}
public class FinalKeyword 
{
	final int x;
	public FinalKeyword() 
	{
		x = 10;
		int y = x;
		y++;
		System.out.println(y);		//11
		System.out.println(y++);	//11
		System.out.println(y); 		//12
	}
	
	public static void main(String[] args) 
	{
		FinalKeyword fn = new FinalKeyword();
	}
}
