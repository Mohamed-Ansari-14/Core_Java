package numberPrograms;
//Swap of Two Numbers Without Using Temp Variable
public class SwapOfNumber 
{
	public static void main(String[] args) 
	{
		int a=10,b=20;
		
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}
}
