package logical_Programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection3 
{
	public static void main(String[] args)
	{
		System.out.println("---------------------");
		Set<String>set = new HashSet<>();
		set.add("Sam");
		set.add(null);
		set.add(null);
		set.add("Sam");
		set.add("U1");
		set.add("U1");
		
		for(String s1:set)
		{
			System.out.println(s1);
		}
		
		System.out.println("---------------------");
		
		Set<String> set2 = new TreeSet<>();
		set2.add(new String("Ansari"));
		//set2.add(new StringBuffer("Ansari"));
		set2.add("Ansari");
		//set2.add(null);
		
		for(Object s1:set2)
		{
			System.out.println(s1);
		}
	}
}
