package stringBufferClass;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.append("defg"));
		
		System.out.println(sb1.insert(7, "hijk"));
		
		System.out.println(sb1.delete(1, 5));
		
		System.out.println(sb2.reverse());
		
	}
}
