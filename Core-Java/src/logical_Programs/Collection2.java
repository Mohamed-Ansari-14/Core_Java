package logical_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collection2 
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		//List<String> list = new Vector<>();
		//List<String> list = new LinkedList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		
		System.out.println(list.get(2));
		System.out.println(list.subList(0, 5));
		System.out.println(list.size());
		
		System.out.println("-------------------------------------");
		System.out.println("Using ListIterator - Forward operation");
		
		ListIterator<String>itr = list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Using ListIterator - Backward operation");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		System.out.println("-------------------------------------");
	}
}


















