package stringClass;

public class Palindrome2 
{
	public static void main(String[] args) 
	{
		String s1 = "madam";
		boolean res = true;
		int i = 0;
		int j = s1.length()-1;
		while(i<=j)
		{
			if(s1.charAt(i) != s1.charAt(j))
			{
				res = false;
				break;
			}
			i++;
			j--;
		}
		
		if(res)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
