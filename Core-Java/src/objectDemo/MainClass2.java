package objectDemo;

import com.asp.app.Student;

public class MainClass2 
{
	public static void main(String[] args) 
	{
		Student std1 = new Student(123,"Raj",75.0);
		Student std2 = new Student(456,"Kumar",55.0);
		Student std3 = new Student(123,"Raj",75.0);
		
		String s1 = std1.toString();
		System.out.println(s1);
		
		System.out.println(std1);
		System.out.println(std2);
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(std1.equals(std2));
		System.out.println(std1.equals(std3));
	}
}
