package logical_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Collection1
{
	public static void main(String[] args) 
	{
		Collection<Integer> c1 = Arrays.asList(10,20,30,40,50);
		//c1.add(60);	//-->We can't add or remove elements in "asList"
		//c1.remove(10);
		Collection<Integer> c2 = new ArrayList<>();
		c2.addAll(c1);
		c2.add(60);
		c2.add(70);
		c2.add(80);
		c2.add(90);
		c2.add(100);
		
		System.out.println("Collection - 1");
		for(int num:c1)
		{
			System.out.println(num);
		}
		System.out.println("------------------");
		
		System.out.println("Collection - 2");
		for(int num:c2)
		{
			System.out.println(num);
		}
		System.out.println("------------------");
		
		System.out.println("Collection - 1(Iterator)");
		Iterator<Integer> itr = c1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------------------");
		
		System.out.println("Parsing...");
		String s1 = "12345";
		int i1 = Integer.parseInt(s1);
		double i2 = Double.parseDouble(s1);
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(c1.size());
		System.out.println(c2.size());
	}
}

















