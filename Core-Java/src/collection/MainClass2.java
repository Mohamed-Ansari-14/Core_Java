package collection;

import java.util.ArrayList;
import java.util.Collection;

public class MainClass2 
{
	public static void main(String[] args) 
	{
		Collection<Object> names = new ArrayList<>();
		
		names.add("Wasim");
		names.add("Mohamed");
		names.add("Akram");
		names.add("Ansari");
		names.add("Hema");
		names.add(new StringBuffer("Gopi"));
		
		for(Object o1:names)
		{
			String name = (String)o1;
			System.out.println(name+"==>"+name.length()+"==>"+name.charAt(0)+"==>"+name.charAt(name.length()-1));
		}
	}
}
