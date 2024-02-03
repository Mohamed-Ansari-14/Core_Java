package stringBufferClass;

public class Palindrome 		// -->Using Reverse()Method
{
	public static void main(String[] args) 
	{
		String s1 = "amma";
		
		//convert String to StringBuffer
		StringBuffer sb1 = new StringBuffer(s1);
		sb1.reverse();
		
		//convert StringBuffer to String
		//String s2 = new String(sb1);		//-->By Constructor
		String s2 = sb1.toString();			//-->By toString()Method
		
		if(s1.equals(s2))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
	}
}
