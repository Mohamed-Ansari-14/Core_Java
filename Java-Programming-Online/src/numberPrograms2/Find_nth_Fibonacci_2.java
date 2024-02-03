package numberPrograms2;
//USING ONLY TARGET
import java.util.Scanner;

public class Find_nth_Fibonacci_2 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Target:");
			int target = sc.nextInt();
			
			int a=0,b=1,c=0;
			for(int i=1;i<target;i++)
			{
				c=a+b;
				a=b;
				b=c;
			}
			
			System.out.println(a);
		}
	}
}
