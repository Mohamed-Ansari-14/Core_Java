package objectDemo;

import com.asp.app.Student;

public class MainClass3				//Clone() , Finalize() , getClass()...
{
	public static void main(String[] args) 
	{
		Student std1 = new Student(123,"Loki",100.0);
		Student ref = std1.getStudentClone();
		System.out.println(std1);
		System.out.println(ref);	//Clone...
		
		std1 = null;
		System.gc();
		
		Class c1 = ref.getClass();
		System.out.println(c1.getName());
		System.out.println(c1.getPackageName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getPackage());
		
	}
}
