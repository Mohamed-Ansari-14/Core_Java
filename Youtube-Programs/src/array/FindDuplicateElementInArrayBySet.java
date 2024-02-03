package array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArrayBySet 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,10,50,60,70,20,100,55,30,90,65};
		
		Set<Integer> nums = new HashSet<>();
		for(int number : arr)
		{
			if(! nums.add(number))
				System.out.println("Duplicate Element: "+number);
		}
	}
}
