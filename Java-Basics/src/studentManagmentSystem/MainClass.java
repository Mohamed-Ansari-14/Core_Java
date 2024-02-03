package studentManagmentSystem;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Admin a = new Admin(32526,"Ansari","Asmathulla","Sharmila Banu","Chennai",600081,"St.Thomas",401,2018,"St.Thomas",490,2020,"Computer Application","BSC CS");
		System.out.println("Student Id: "+a.stuId);
		System.out.println("Student Name: "+a.stuName);
		System.out.println("Father's Name: "+a.fatherName);
		System.out.println("Mother's Name: "+a.motherName);
		System.out.println("Address: "+a.address);
		System.out.println("Pin Code: "+a.pin);
		System.out.println("SSLC School Name: "+a.sslcScllName);
		System.out.println("SSLC Mark: "+a.sslcMark);
		System.out.println("SSLC Passed Out Year: "+a.sslcPO);
		System.out.println("HSc School Name: "+a.hscScllName);
		System.out.println("HSc Mark: "+a.hscMark);
		System.out.println("HSC Passed Out Year: "+a.hscPO);
		System.out.println("Stream: "+a.stream);
		a.checkSSLC();
		a.checkHSC();
		System.out.println("College Name: "+Admin.clgName);
		System.out.println("College Address: "+Admin.clgAdd);
		a.checkAvailability();
		a.degreeDetails();
		a.payment(50000);
	}
}
