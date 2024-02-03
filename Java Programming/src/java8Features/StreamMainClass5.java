package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamMainClass5 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		double arr2[] = {1.1,2.2,3.3,4.4,5.5,6.6,7.7};
		
		IntStream stream =  Arrays.stream(arr);
		DoubleStream stream2 = Arrays.stream(arr2);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(stream);
		System.out.println(stream2);
		
		stream.forEach((e)->System.out.print(e+" "));
		System.out.println();
		stream2.forEach((e)->System.out.print(e+" "));
		
		System.out.println("\n-----------------------------------------");
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		nums.forEach((e)->System.out.print(e+" "));
		System.out.println();
		nums.forEach((e)->System.out.print(e+1+" "));
		
		System.out.println("\n-----------------------------------------");
		
		
	}
}
