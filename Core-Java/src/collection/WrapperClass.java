package collection;

import java.util.Collection;
import java.util.LinkedList;

public class WrapperClass 
{
	public static void main(String[] args) 
	{
		Collection<Integer> number = new LinkedList<>();
		number.add(10);//==> autoBoxing
		number.add(20);
		number.add(30);
		
		for(int num:number)//==> auto UnBoxing
		{
			System.out.println(num);
		}
		
		String s1 = "123456";
		System.out.println(s1);
		int x = Integer.parseInt(s1);
		double y = Double.parseDouble(s1);
		System.out.println(x);
		System.out.println(y);
		
		String s2 = String.valueOf(1234);
		String s3 = 1234+"";
		System.out.println(s2+"   "+s3);
	}
}
