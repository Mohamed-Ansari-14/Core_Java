package collection;

import java.util.Set;
import java.util.TreeSet;

public class MainClassEmp3 
{
	public static void main(String[] args) 
	{
		Set<Employee> emp3 = new TreeSet<>();
		
		emp3.add(new Employee(10, "Jack", 50000.0));
		emp3.add(new Employee(8, "Guru", 25000.0));
		emp3.add(new Employee(11, "Raj", 10000.0));
		emp3.add(new Employee(5, "Kumar", 40000.0));
		emp3.add(new Employee(7, "Gopal", 20000.0));
		
		for(Employee e1:emp3)
		{
			System.out.println(e1);		//==>Sorted by Name...
		}
		
		System.out.println("---------------------------------------------------------");
		
		SortBySalary sbs = new SortBySalary();
		
		Set<Employee>emps = new TreeSet<>(sbs);		//==>Sorted by Salary...
		emps.addAll(emp3);
		
		for(Employee e1:emps)
		{
			System.out.println(e1);
		}
	}
}
