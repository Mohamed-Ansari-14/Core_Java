package numberPrograms2;
//WAJP TO FIND THE PRIME DIGIT IN THE GIVEN NUMBER
public class Find_Prime_Digit
{
	public static void main(String[] args)
	{
		int num = 754;
		while(num>0)
		{
			int count = 0;
			int rem = num%10;	//Extract Each Digit and Check Prime or Not
			for(int i=1;i<=rem;i++)
			{
				if(rem%i==0)
					count++;
			}
			if(count == 2)
				System.out.print(rem+" ");
			num = num/10;
		}
	}
}
