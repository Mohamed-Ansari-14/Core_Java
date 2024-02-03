package numberPrograms;
//WAJP TO FIND LARGEST OF THREE NUMBER USING TERNARY OPERATOR
public class GreatestOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		int a=55,b=95,c=105;
		
		int result = (a>b)? a>c? a : c  : b>c? b : c;
		
		System.out.println("Largest Number = "+result);
	}
}
