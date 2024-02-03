package com.asp.app;

public class Student implements Cloneable
{
	int id;
	String name;
	double perc;
	
	public Student(int id, String name, double perc) 
	{
		this.id = id;
		this.name = name;
		this.perc = perc;
	}
	
	public String toString()
	{
		return "[id = "+id+",Name = "+name+",Percentage = "+perc+"]";
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
	
	public Student getStudentClone()
	{
		Student ref = null;
		try {
			ref = (Student) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return ref;
	}
	
	public void finalize()
	{
		System.out.println("I am in Finalize..............");
	}
	
}





















