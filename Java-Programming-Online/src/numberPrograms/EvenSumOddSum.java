package numberPrograms;

public class EvenSumOddSum 
{
	public static void main(String[] args) 
	{
		int EvenSum = 0;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				EvenSum = EvenSum+i;
		}
		
		System.out.println("Even-Sum = "+EvenSum);
		
		System.out.println("-------------");
		
		int OddSum = 0;
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				OddSum = OddSum+i;
		}
		
		System.out.println("Odd-Sum = "+OddSum);
	}
}
