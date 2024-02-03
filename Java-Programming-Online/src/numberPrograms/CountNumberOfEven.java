package numberPrograms;
//WAJP TO COUNT THE NUMBER OF EVEN,ODD IN GIVEN NUMBER
public class CountNumberOfEven 
{
	public static void main(String[] args) 
	{
		int num = 56723;
		int evenCount = 0 , oddCount = 0;
		
		while(num > 0)
		{
			int rem = num % 10;
			if(rem % 2 == 0)
				evenCount ++;
			else
				oddCount++;
			
			num = num/10;
		}
		System.out.println("Even-Count = "+evenCount);
		System.out.println("Odd-Count = "+oddCount);
	}
}
