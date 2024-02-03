package logical_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 
{
	public static void main(String[] args)
	{
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Set<?> entries = map.entrySet();
		for(Object o1:entries)
		{
			System.out.println(o1);
		}
	}
}
