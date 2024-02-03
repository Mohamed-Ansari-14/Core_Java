package numberPrograms2;
//WAJP TO FIND GIVEN NUMBER IS HAPPY NUMBER OR NOT.

public class HappyNumber 
{//the sum should be in 1 or 4 or else we have to perform same operation.
	//1 means happy number , 4 means sad number.
	public static void main(String[] args)
	{
		int num = 13;
		while(num!=1 && num!=4)
		{
			int sum = 0;
			while(num>0)
			{
				int rem = num%10;
				int sqrt = rem*rem;
				sum = sum+sqrt;
				num = num/10;
			}
			//System.out.println(sum);
			if(sum == 1)
			{
				System.out.println("Happy Number");
				break;
				
			}
			else if(sum == 4)
			{
				System.out.println("Sad Number");
				break;
				
			}
			num = sum;
		}

	}
}
