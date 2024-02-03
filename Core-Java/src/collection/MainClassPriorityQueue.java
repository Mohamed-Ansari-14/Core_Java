package collection;

import java.util.PriorityQueue;

public class MainClassPriorityQueue 
{
	public static void main(String[] args) 
	{
		System.out.println("*************************************");
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("lion");
		pq.add("tiger");
		pq.add("cat");
		pq.add("dog");
		pq.add("tiger");
		System.out.println(pq);
		
		System.out.println("Head Element = "+pq.peek());
		Object head = pq.poll();
		while(head != null)
		{
			System.out.println(head);
			head = pq.poll();
		}
		System.out.println(pq.size());
		System.out.println("*************************************");
	}
}
