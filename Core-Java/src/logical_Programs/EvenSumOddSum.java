package logical_Programs;

public class EvenSumOddSum 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int es = 0;
		int os = 0;
		
		for(int i:arr)
		{
			if(i%2==0)
				es = es+i;
			else
				os = os+i;
		}
		System.out.println("Even Sum = "+es);
		System.out.println("odd Sum = "+os);
	}
}
