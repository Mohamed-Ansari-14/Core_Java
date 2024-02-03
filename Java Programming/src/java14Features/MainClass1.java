package java14Features;

public class MainClass1 
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(1, "Ram", 10000.0);
		Employee e2 = new Employee(2, "Sam", 20000.0);
		Employee e3 = new Employee(1, "Ram", 10000.0);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
		System.out.println(e1.id());
		System.out.println(e1.name());
		System.out.println(e1.salary());
	}
}
