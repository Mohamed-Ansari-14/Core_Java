package collection;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) 
	{
		if(o1.salary > o2.salary)
			return 5;
		else if(o1.salary < o2.salary)
			return -5;
		else
			return 0;
	}
}
