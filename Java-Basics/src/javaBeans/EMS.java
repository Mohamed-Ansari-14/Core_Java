package javaBeans;

class Employee
{
	private int empId;
	private String empName;
	private double empSal;
	
	public Employee()
	{
		
	}
	
	public int getId()
	{
		return empId;
	}
	
	public void setId(int empId)
	{
		this.empId = empId;
	}
	
	public String getName()
	{
		return empName;
	}
	
	public void setName(String empName)
	{
		this.empName = empName;
	}
	
	public double getSal()
	{
		return empSal;
	}
	
	public void setSal(double empSal)
	{
		this.empSal = empSal;
	}
}

public class EMS
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		
		emp.setId(123);
		emp.setName("Ram");
		emp.setSal(500000.0);
		
		System.out.println("Employee Id: "+emp.getId());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Salary: "+emp.getSal());
	}
}

















