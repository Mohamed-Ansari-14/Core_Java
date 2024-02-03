package proTechSolft;

public class StringComparing 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello World";
		String s2 = "Hello";
		
		System.out.println(s1.equals(s2));
		
		String s3 = s1.substring(0,5);
		
		System.out.println(s2.equals(s3));
		
	}
}
