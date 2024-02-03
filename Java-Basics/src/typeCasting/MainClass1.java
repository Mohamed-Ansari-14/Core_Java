package typeCasting;

class Sample
{
	/*static void test(byte x)
	{
		System.out.println("i am in test(byte)..."+x);
	}*/
	static void test(int x)
	{
		System.out.println("i am in test(int)..."+x);
	}
	static void test(float x)
	{
		System.out.println("i am in test(float)..."+x);
	}
	static void test(double x)
	{
		System.out.println("i am in test(double)..."+x);
	}
}

public class MainClass1 
{
	public static void main (String[]args)
	{
		Sample.test(10);
		Sample.test(100.0);
		Sample.test((byte)1);//it will cast to next larger size of data type...
		int i = 68;
		char ch = (char)i;
		System.out.println(ch);
		byte b = 23;
		System.out.println(b);
		byte b1 = (byte)512;
		System.out.println(b1);
		System.out.println((long)((Math.pow(2, 64)/2)-1));
		System.out.println((int)((Math.pow(2, 32)/2)-1));
		int i1 = 056;//Octal Value
		System.out.println(i1);
		int i2 = 0x23A;//Hexa Decimal
		System.out.println(i2);
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println(ch1+1);
		System.out.println(ch1+ch1);
		System.out.println(ch1++);
		System.out.println(ch1);
		System.out.println(++ch1);
		for(char x = 'A';x<='Z';x++)
		{
			System.out.print(x+" ");
		}
	}
}
