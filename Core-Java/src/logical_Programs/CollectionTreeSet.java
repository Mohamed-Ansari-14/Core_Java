package logical_Programs;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeSet 
{
	public static void main(String[] args) 
	{
		Set<Integer> s1 = new TreeSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		
		System.out.println("---------------------------");
		System.out.println(s1);
		System.out.println("---------------------------");
		
		for(int i : s1)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		System.out.println("Sorting By Decending...");
		System.out.println("---------------------------");
		
		SortByDescending sbd = new SortByDescending();
		TreeSet<Integer> t1 = new TreeSet<>(sbd);
		t1.addAll(s1);
		
		for(int i : t1)
		{
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
	}
}


class SortByDescending implements Comparator<Integer>
{
	public int compare(Integer e1, Integer e2) 
	{
		return e2-e1;
	}
	
}


























