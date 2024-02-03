package java7Features;

import java.util.List;

public class Employee 
{
	private int id;
	private String firstName;
	private String lastName;
	private double salary;
	private List<String> project;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<String> getProject() {
		return project;
	}

	public void setProject(List<String> project) {
		this.project = project;
	}

	public Employee(int id, String firstName, String lastName, double salary, List<String> project)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", project=" + project + "]";
	}
}






















