package java8Features;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamMainClass4 
{
	public static void main(String[] args) 
	{
		Set<String>names = new TreeSet<>();
		names.add("arun");
		names.add("dura");
		names.add("bala");
		names.add("ram");
		names.add("chals");
		names.add("suresh");
		names.add("ramesh");
		
		System.out.println(names);
		
		Set<String> names2 = names.stream().filter((n)->n.startsWith("r")).collect(Collectors.toSet());
		System.out.println(names2);
	}
}
