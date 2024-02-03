package collection;

import java.util.HashSet;
import java.util.Set;

public class MainClassEmp1 
{
	public static void main(String[] args) 
	{
		Set<Employee> emp1 = new HashSet<>();
		
		emp1.add(new Employee(01, "raj", 10000.0));
		emp1.add(new Employee(02, "bala", 20000.0));
		emp1.add(new Employee(03, "raju", 25000.0));
		emp1.add(new Employee(03, "raju", 25000.0));
		emp1.add(new Employee(04, "jack", 50000.0));
		
		for(Employee e1:emp1)
		{
			System.out.println(e1);
		}
		
	}
}
