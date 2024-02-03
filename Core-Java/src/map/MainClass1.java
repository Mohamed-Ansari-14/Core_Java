package map;


import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MainClass1 
{
	public static void main(String[] args)
	{
		Map<Object, Object> map = new HashMap<>();
		//Map map = new Hashtable<>();
		
		map.put("1","one");
		map.put("2","two");
		map.put("3","three");
		map.put("4","four");
		map.put("5","five");
		map.put("6","five");
		map.put(null,null);
		
		System.out.println(map.keySet());
		System.out.println(map.size());
		System.out.println(map.get("5"));
		System.out.println(map.getOrDefault("6","six"));
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map);
		//System.out.println(map.remove("2"));
		
		Set<Object> keys = map.keySet();
		for(Object o1:keys)
		{
			System.out.println(o1+"==>"+map.get(o1));
		}
		
		System.out.println("----------------------------------");
		
		Set<?> entries = map.entrySet();
		for(Object o1:entries)
		{
			System.out.println(o1);
		}
	}
}












