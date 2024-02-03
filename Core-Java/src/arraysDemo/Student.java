package arraysDemo;

import java.util.Arrays;

public class Student 
{
	int id;
	String name;
	double marks[];
	
	public Student(int id, String name, double[] marks) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public double totalMarks()
	{
		double total = 0.0 ;
		for(double mark:marks)
		{
			total = total + mark;
		}
		return total;
	}
	
	public double average()
	{
		return totalMarks()/marks.length;
	}
	
	public String result()
	{
		String res = "Pass";
		for(double mark:marks)
		{
			if(mark<35)
			{
				res = "Fail";
				break;
			}
		}
		return res;
	}
	
	public String toString()
	{
		return "[Student id = "+id+"\n,Student Name = "+name+",\nStudent Marks = "
		+Arrays.toString(marks)+",\nResult = "+result()+",\nTotal = "+totalMarks()+",\nAverage = "+average()+"]";
	}
}




















