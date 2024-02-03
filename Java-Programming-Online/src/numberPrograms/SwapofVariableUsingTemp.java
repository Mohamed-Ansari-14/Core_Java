package numberPrograms;
//Swap of Two Numbers Using Temp Variable
public class SwapofVariableUsingTemp 
{
	public static void main(String[] args) 
	{
		int a = 10,temp = a;
		int b = 20;

		System.out.println(a);
		System.out.println(b);

		a=b;
		b=temp;

		System.out.println(a);
		System.out.println(b);
	}
}
	