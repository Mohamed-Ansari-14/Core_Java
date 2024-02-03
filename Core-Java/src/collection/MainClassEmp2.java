package collection;

import java.util.Set;
import java.util.TreeSet;

public class MainClassEmp2 
{
	public static void main(String[] args) 
	{
		Set<Employee> emp2 = new TreeSet<>();
		
		emp2.add(new Employee(100, "Jack", 50000.0));
		emp2.add(new Employee(200, "Guru", 25000.0));
		emp2.add(new Employee(300, "Raj", 10000.0));
		emp2.add(new Employee(400, "Kumar", 40000.0));
		emp2.add(new Employee(500, "Gopal", 20000.0));
		
		for(Employee e1:emp2)
		{
			System.out.println(e1);
		}
	}
}
