package map;

import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NaviMap
{
	public static void main(String[] args) 
	{
		NavigableMap<Integer, String> nm = new TreeMap<>(); 
		nm.put(1, "One");
		nm.put(2, "Two");
		nm.put(3, "Three");
		nm.put(4, "Four");
		nm.put(5, "Five");
		
		System.out.println("-----------------------------------------");
		System.out.println(nm);
		System.out.println("-----------------------------------------");
		Set<?> entries = nm.entrySet();
		
		for(Object o1:entries)
		{
			System.out.println(o1);
		}
		System.out.println("-----------------------------------------");
		
		Set<Integer> keys = nm.keySet();
		
		for(Object o1:keys)
		{
			System.out.println("Key ==> "+o1);
		}
		
		System.out.println("-----------------------------------------");
	}
}
