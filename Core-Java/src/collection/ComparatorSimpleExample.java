package collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Sorting implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) 
	{
		return o2-o1;//==>Descending
	}
}

public class ComparatorSimpleExample 
{
	public static void main(String[] args)
	{
		Set<Integer> num = new TreeSet<>(new Sorting());
		
		num.add(10);
		num.add(15);
		num.add(100);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(95);
		
		for(int n : num)
		{
			System.out.println(n);
		}
	}
}
