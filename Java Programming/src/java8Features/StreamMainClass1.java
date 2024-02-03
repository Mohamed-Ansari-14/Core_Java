package java8Features;

import java.util.stream.Stream;

public class StreamMainClass1 
{
	public static void main(String[] args)
	{
		Stream<Integer> num = Stream.of(10,11,21,20,30,22,12,15,25,30);
		
		//System.out.println(num.count());
		//System.out.println(num.distinct().count());
		
		System.out.println(num.filter((e)->e%2==0).count());
	}
}
