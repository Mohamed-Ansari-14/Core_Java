package collection;

import java.util.Comparator;

public class DecendingClass6 implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2) 
	{
		/*if(o1>o2)
			return -3;
		else if(o1<o2)
			return 3;
		else
			return 0;*/
		
		//==>OR
		
		return o2-o1;//==>Descending
		//return o1-o2;//==>Ascending
	}
}
