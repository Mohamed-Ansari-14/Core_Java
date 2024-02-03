package logical_Programs;

public class FindingLargestOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		int a=20,b=40,c=10;
		
		int res = (a>b)?(a>c)?a : c :(b>c)? b : c;
		
		System.out.println(res);
	}
}
