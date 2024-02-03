package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java7Features.Employee;

public class EmployeeMainClass 
{
	private static List<Employee> employees = new ArrayList<>();
	
	static
	{
		employees.add(new Employee(7890, "Kamal", "Hassan", 50000.0, List.of
				("Project-1","Project-2","Project-3")));
		
		employees.add(new Employee(1234, "Ajith", "Kumar", 70000.0, List.of
				("Project-1","Project-2","Project-3","Project-4","Project-5")));
		
		employees.add(new Employee(4567, "Joseph", "Vijay", 60000.0, List.of
				("Project-1","Project-2","Project-3","Project-4")));
		
		employees.add(new Employee(1546, "Ajay", "Kumar", 40000.0, List.of
				("Project-1","Project-2")));
		
		employees.add(new Employee(5698, "Adolf", "Hitler", 30000.0, List.of
				("Project-1","Project-2","Project-3")));
		
		employees.add(new Employee(5788, "Mahatma", "Gandhi", 55000.0, List.of
				("Project-1","Project-2","Project-3")));
	}
	
	public static void main(String[] args) 
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		employees.stream().forEach((emp)->System.out.println(emp));
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		employees.stream().forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		
		//Salary Hike 10 percentage For Everyone....
		List<Employee> updatedSalary = employees.stream().map(emp-> new Employee(emp.getId(), emp.getFirstName(), emp.getLastName(),
				emp.getSalary()+emp.getSalary()*0.1, emp.getProject())).collect(Collectors.toList());
		
		updatedSalary.forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		
		//Sorting By Ascending the FirstName...............
		employees.stream().sorted((e1,e2)->e1.getFirstName().compareToIgnoreCase(e2.getFirstName()))
											 .forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		
		//Sorting By Descending the FirstName...............
				employees.stream().sorted((e1,e2)->e2.getFirstName().compareToIgnoreCase(e1.getFirstName()))
													 .forEach(System.out::println);
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		
		//Salary Hike 10 percentage For skip 1st one and limit 5....
				List<Employee> updatedSalary2 = employees.parallelStream().skip(1).limit(3).map(emp-> new Employee(emp.getId(), emp.getFirstName(), emp.getLastName(),
						emp.getSalary()+emp.getSalary()*0.1, emp.getProject())).collect(Collectors.toList());
				
		updatedSalary2.forEach(System.out::println);
		
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
				
	}
}


































