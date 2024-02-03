package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.asp.app.Student;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		Collection<Object> c1 = new ArrayList<>();
		c1.add("Sql");
		c1.add(new String("Web"));
		c1.add(new StringBuffer("Java"));
		c1.add(new Student(123, "AK", 95.0));
		
		for(Object o1:c1)
		{
			System.out.println(o1);
		}
		
		System.out.println("---------------------------------");
		
		Iterator<Object> itr = c1.iterator() ;
		
		while(itr.hasNext())
		{
			Object o1 = itr.next();
			System.out.println(o1);
		}
	}
}
