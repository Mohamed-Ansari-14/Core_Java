package collection;

import java.util.HashSet;
import java.util.Set;

public class MainClass4 
{
	public static void main(String[] args)
	{
		Set<Object> set = new HashSet<>();
		set.add(new String("Samantha"));//-->By Default Hashcode is overrided
		set.add(new String("Samantha"));
		set.add("Tamanna");
		set.add("Tamanna");
		set.add(new StringBuffer("Nayanthara"));//-->By Default Hashcode is not overrided
		set.add(new StringBuffer("Nayanthara"));
		set.add(null);
		set.add(null);
		
		for(Object o1 :set)
		{
			System.out.println(o1);
		}
	}
}
