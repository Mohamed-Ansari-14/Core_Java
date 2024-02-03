package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMainClass3 
{
	public static void main(String[] args) 
	{
		List<Integer>marks = new ArrayList<>();
		marks.add(90);
		marks.add(43);
		marks.add(23);
		marks.add(85);
		marks.add(45);
		marks.add(12);
		marks.add(10);
		
		System.out.println(marks);
		
		long count = marks.stream().filter((m)->m>=35).count();
		System.out.println(count);
		
		List<Integer> passedList =  marks.stream().filter((m)->m>=35).collect(Collectors.toList());
		System.out.println(passedList);
		
		List<Integer> updatedList = marks.stream().map((m)->m+10).collect(Collectors.toList());
		System.out.println(updatedList);
		
		List<Integer> updatedMarks2 = marks.stream().filter((e)->e<=30).filter((e)->e%2==0)
										   .map((m)->m+10).collect(Collectors.toList());
		
		System.out.println(updatedMarks2);
		
		System.out.println(marks);
	}
}
