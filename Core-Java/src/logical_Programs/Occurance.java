package logical_Programs;

public class Occurance 
{
	public static void main(String[] args) 
	{
		String s1 = "ansari";
		char ch = 'a';
		int count = 0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch)
				count++;
		}
		System.out.println(ch+" is Present in "+s1+" "+count+" times.");
	}
}
