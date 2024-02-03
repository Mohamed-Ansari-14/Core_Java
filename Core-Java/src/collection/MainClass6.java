package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass6 
{
	public static void main(String[] args) 
	{
		int arr[] = {4,1,5,8,2,9};
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 15));//==>true means returns + number else - number
		
		List<Integer> nums = Arrays.asList(10,2,3,40,50);
		//Collections.sort(nums);
		System.out.println(nums);
		Collections.sort(nums,new DecendingClass6());
		System.out.println(nums);
	}
}
