package numberPrograms2;
//WAJP TO CHECK THE GIVEN NUMBER IS AUTOMORPHIC NUMBER OR NOT.
/*
 * The given number is Completely present at the last of the its Square Value.
 */
public class Automorphic_Number 
{
	public static void main(String[] args) 
	{
		int num = 25;
		int sqrt = num*num;
		//System.out.println(num+"-->"+sqrt);
		while(num>0)
		{
			int r1 = num%10;
			int r2 = sqrt % 10;

			if(r1 == r2)
			{
				num = num/10;
				sqrt = sqrt/10;
			}
			else
				break;
		}
		if(num == 0)
			System.out.println("Automorphic Number");
		else
			System.out.println("Not a Automorphic Number");
	}
}
