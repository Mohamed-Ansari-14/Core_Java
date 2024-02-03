package logical_Programs;

import java.util.PriorityQueue;
import java.util.Queue;

public class Collection4 
{
	public static void main(String[] args) 
	{
		Queue<String>q1 = new PriorityQueue<>();
		q1.add("one");
		q1.add("twenty");
		q1.add("three");
		q1.add("four");
		q1.add("six");
		q1.add("fifteen");
		q1.add("seven");
		System.out.println(q1);
		
		String s1 = q1.peek();
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = q1.poll();
		}
		System.out.println(q1.size());
		
		
	}
}
