package numberPrograms2;
//WAJP TO FIND THE GIVEN NUMBER IS XYLEM OR PHLOEM.

/*1 and 4 is outer and 2,3 is inner...first and last number is outer
 * the rest inner numbers are innum numbers. 
 */
/*we have to sum the outer sum and inner sum
/*then check whether equal or not
 * if both are equal "Xylem" or else "Phloem".
 */
public class Xylem_Pholem_Numbers 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int oSum = 0, iSum = 0;
		int last = num%10;
		num = num/10;
		while(num>9)
		{
			int rem = num%10;
			iSum = iSum+rem;
			num = num/10;
		}
		oSum = num+last;
		if(oSum==iSum)
			System.out.println("Xylem Number");
		else
			System.out.println("Phloem Number");
		
		//System.out.println("Outer Sum = "+oSum);
		//System.out.println("Inner Sum = "+iSum);
	}
}
