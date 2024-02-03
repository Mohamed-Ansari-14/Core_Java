package randomLogics_1;
/*
 * In primitive Data Type we can't modify the final properties...
 * 
 * but in Objects we can Modify the final properties because of its not re-assigning
 * its creating the new object and storing the new data...
 * 
 * */
public class FinalVariable 
{
	final int a;

	FinalVariable(int a)
	{
		this.a = a;
	}
	
	void m1()
	{
		
	}
	
	public static void main(String[] args) {
		FinalVariable finalVariable = new FinalVariable(10);
		System.out.println(finalVariable.a);
	}
}

final class FinalClass
{
	//We can't Inherit the final class But we can inherit the final class Members...
}

//class FinalB extends FinalClass
//{
//	
//}









