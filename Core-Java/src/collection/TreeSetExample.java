package collection;

import java.util.TreeSet;

public class TreeSetExample 
{
	public static void main(String[] args) 
	{
		TreeSet<String> set = new TreeSet<>();
		
		set.add("Thala");
		set.add("ThalaPathi");
		set.add("SK");
		set.add("Surya");
		set.add("Thala");
		set.add("ThalaPathi");
		
		//set.add(new StringBuffer("Dhanush"));	==>ClassCastException
		//set.add(null);	==>NullPointerException
		
		System.out.println(set);
	}
}
