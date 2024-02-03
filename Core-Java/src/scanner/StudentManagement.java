package scanner;

public class StudentManagement 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.scanner();
		System.out.println("Total Marks = "+s1.totalMarks());
		System.out.println("Average of Your Mark = "+s1.average());
		s1.eligible();
	}
}

