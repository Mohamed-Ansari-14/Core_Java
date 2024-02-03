package stringClass;

public class Palindrome1 
{
	public static void main(String[] args) 
	{
		String s1 = "Malayalam";
		String s2 = "";
		
		for(int i = s1.length()-1;i>=0;i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
