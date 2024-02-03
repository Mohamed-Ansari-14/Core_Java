package numberPrograms2;

import java.util.Scanner;

public class PrimeBetweenTheRange 
{
	static boolean isPrime(int num)
	{
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Starting Range: ");
			int start = sc.nextInt();
			System.out.println("Enter the Ending Range: ");
			int end = sc.nextInt();
			
			for(int i=start;i<=end;i++)
			{
				if(isPrime(i))
					System.out.println(i);
			}
		}
	}
}





