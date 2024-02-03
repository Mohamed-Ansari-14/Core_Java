package studentManagmentSystem;

public class Admin 
{
	int stuId;
	String stuName;
	String fatherName,motherName;
	String address;
	int pin;
	String sslcScllName;
	int sslcMark;
	int sslcPO;
	String hscScllName;
	int hscMark;
	int hscPO;
	String stream;
	
	final static String clgName = "Peri College of Arts & Science";
	final static String clgAdd = "Mannivakkam, Chennai-600048";
	String degree;
	double semFees,bookFees,labFees,maintainanceFees,totalFees;	
	
	
	Admin(int stuId,String stuName,String fatherName,String motherName,String address,int pin,
			String sslcScllName,int sslcMark,int sslcPO,String hscScllName,int hscMark,int hscPO,String stream,String degree)
	{
		this.stuId = stuId;
		this.stuName = stuName;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
		this.pin = pin;
		this.sslcScllName = sslcScllName;
		this.sslcMark = sslcMark;
		this.sslcPO = sslcPO;
		this.hscScllName = hscScllName;
		this.hscMark = hscMark;
		this.hscPO = hscPO;
		this.stream = stream;
		this.degree = degree;
	}
	
	void checkSSLC()
	{
		if(sslcMark >= 380)
			System.out.println("Your SSLC-Mark is Eligible");
		else
			System.out.println("Your SSLC-Mark is Less,So Un-eligible");
	}
	
	void checkHSC()
	{
		if(hscMark >= 450)
			System.out.println("Your HSC-Mark is Eligible");
		else
			System.out.println("Your HSC-Mark is Less,So Un-eligible");
	}
	
	void checkAvailability()
	{
		System.out.println("Available Courses in our College: ");
		System.out.println("UG COURSES: ");
		System.out.println("BCA");
		System.out.println("BSC CS");
		System.out.println("BSC CHEMISTRY");
		System.out.println("BSC MICRO BIOLOGY");
		System.out.println("B.COM (GENERAL)");
		System.out.println("B.COM (CS)");
	}
	
	void degreeDetails()
	{
		if(degree == "BCA")
		{
			System.out.println("You Choosed the Degree => BCA");
			System.out.println("Stream of: Computer Application");
			semFees = 40000;
			bookFees = 5000;
			labFees = 3000;
			maintainanceFees = 2000;
			double totalFees = semFees+bookFees+labFees+maintainanceFees;
			System.out.println("Sem Fees = "+semFees + "    " + "Book Fess = " + bookFees + "    " + "Lab Fees = " + 
			labFees + "    " + "Maintainance Fees = " + maintainanceFees);
			System.out.println("Total Fees Amount = "+totalFees);
		}
		
		else if(degree == "BSC CS")
		{
			System.out.println("You Choosed the Degree => BSC CS");
			System.out.println("Stream of: Computer Science");
			semFees = 45000;
			bookFees = 5000;
			labFees = 3000;
			maintainanceFees = 2000;
			totalFees = semFees+bookFees+labFees+maintainanceFees;
			System.out.println("Sem Fees = "+semFees + "    " + "Book Fess = " + bookFees + "    " + "Lab Fees = " + 
			labFees + "    " + "Maintainance Fees = " + maintainanceFees);
			System.out.println("Total Fees Amount = "+totalFees);
		}
	}
	
	void payment(double amt)
	{
		if(totalFees == amt)
		{
			System.out.println("Payment is Sucessfull...No Pending");
			totalFees = totalFees - amt;
		}
		else
		{
			double pending = totalFees - amt;
			System.out.println("Paided Amount = "+amt);
			System.out.println("Pending Amount = "+pending);
		}
	}
}





















