package stringClass;

public class BuiltInMethods 
{
	public static void main(String[] args) 
	{
		String s1 = " Java Developer " ,s2 = "Java" , s3 = "java";
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(3));
		//System.out.println(s1.charAt(15));  -->StringIndexOutOfBoundsException
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat("'S"));
		System.out.println(s1.replace('a', '*'));
		//char[]ch = s1.toCharArray();
		//System.out.println(ch);
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.endsWith("per"));
		System.out.println(s1.contains("Deve"));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 5));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.compareToIgnoreCase(s3));
		//String[]sh = s1.split(" ");
		//System.out.println(sh);
		System.out.println(s1.trim());
		
		
	}
}
