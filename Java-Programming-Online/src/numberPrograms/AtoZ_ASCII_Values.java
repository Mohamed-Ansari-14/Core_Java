package numberPrograms;
//WAJP TO PRINT 'A' TO 'Z' ASCII VALUES
public class AtoZ_ASCII_Values 
{
	public static void main(String[] args) 
	{
		for(char i='A';i<='Z';i++)
		{
			int a = i; //implicit Widening
			System.out.println(a);
		}
	}
}
