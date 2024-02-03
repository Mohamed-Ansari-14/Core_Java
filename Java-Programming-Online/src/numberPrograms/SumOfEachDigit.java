package numberPrograms;
//WAJP To Find Sum of Each Digit in the given Number
public class SumOfEachDigit 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int sum = 0;
		while(num > 0)
		{
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println(sum);
	}
}
