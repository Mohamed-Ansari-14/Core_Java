package array;

import java.util.Arrays;

public class SecondSmallestElement 		//using stream...
{
	public static void fetchSecondSmallestElement(int[]arr)
	{
		int secondSmallest = Arrays.stream(arr).sorted().skip(1).findFirst().orElseThrow(()->
						new IllegalArgumentException("Array does not have a second smallest element!!!"));
		
		System.out.println("Second Smallest Element in an Array = "+secondSmallest);
	}
	
	public static void main(String[] args)
	{
		int numbers[]= {5,2,4,3,1};
		fetchSecondSmallestElement(numbers);
	}
}
