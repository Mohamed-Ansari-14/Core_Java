package collection;

public class Employee implements Comparable<Object>
{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return ("[Emp ID = "+id+", Emp Name = "+name+", Emp Salary = "+salary+"]");
	}
	
	public int hashCode()
	{
		return id;
	}
	
	public boolean equals(Object o1)
	{
		if(this.hashCode() == o1.hashCode())
			return true;
		else
			return false;
	}

	public int compareTo(Object o1) 
	{
		//return this.hashCode()-o1.hashCode();// ==>Ascending order...
		//return o1.hashCode()-this.hashCode(); //==>Decending Order...
		
		Employee ref = (Employee)o1;
		/*if(this.salary > ref.salary)	//==> Sorting by Salary...
			return 5;
		else if(this.salary < ref.salary)
			return -5;
		else
			return 0;*/
		
		return this.name.compareTo(ref.name);	//==>Sorting by Names...
	}
}












