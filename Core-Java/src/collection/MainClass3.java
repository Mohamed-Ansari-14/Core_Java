package collection;

import java.util.ArrayList;
import java.util.Collection;

public class MainClass3 
{
	public static void main(String[] args) 
	{
		Collection<String> names = new ArrayList<>();
		
		names.add("Wasim");
		names.add("Mohamed");
		names.add("Akram");
		names.add("Ansari");
		names.add("Hema");
		
		for(String name:names)
		{
			//String name = (String)o1;	//==> No need to downcast...
			System.out.println(name+"==>"+name.length()+"==>"+name.charAt(0)+"==>"+name.charAt(name.length()-1));
		}
	}
}
