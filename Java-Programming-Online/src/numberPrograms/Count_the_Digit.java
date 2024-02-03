package numberPrograms;
//WAJP To Count the Number of Digit
public class Count_the_Digit 
{
	public static void main(String[] args) 
	{
		int num = 34567;
		int count = 0;
		while(num > 0)
		{
			count++;
			num = num/10;
		}
		
		System.out.println("Total Count = "+count);
	}
}
