package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpeedCheck
{
	public static void main(String[] args) 
	{
		List<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for(int i=1;i<=10000000;i++)
		{
			nums.add(r.nextInt());
		}
		long start = System.currentTimeMillis();
		long count = nums.parallelStream()
						 .filter(e->e%2==0)
						 .map(e->e/3).map(e->e-1).count();
		
		System.out.println(count);
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
	}
}
