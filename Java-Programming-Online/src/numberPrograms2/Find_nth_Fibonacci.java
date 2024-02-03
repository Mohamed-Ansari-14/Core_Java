package numberPrograms2;
//USING TAGET AND RANGE...
import java.util.Scanner;

public class Find_nth_Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Target: ");
		int target = sc.nextInt();
		
		System.out.println("Enter Range: ");
		int range = sc.nextInt();
		
		if(target <= range)
		{
			int a=0,b=1,c=0;
			for(int i=1;i<=range;i++)
			{
				if(i==target)
				{
					System.out.println(a+" ");
				}
				c = a+b;
				a=b;
				b=c;
			}
		}
		else
		{
			System.out.println("Target is out of range !!!");
		}
		sc.close();
	}
}











