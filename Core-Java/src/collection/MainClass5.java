package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass5 //==>Storing group of object without duplicate and Access via Index...
{
	public static void main(String[] args) 
	{
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		set.add(50);
		
		System.out.println(set);
		List<Integer> list = new ArrayList<>(set);
		
		System.out.println(list.get(2));
	}
}
