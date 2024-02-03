package array_Programs;
//WAJP TO PRINT SUM OF EVEN INDEX ELEMENTS IN AN ARRAY
import java.util.Scanner;

public class SumEvenIndexElements 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		//Adding Elements
		System.out.println("Enter the Elements: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		//Finding the sum of even Index Elements
		int sum = 0;
		for(int i=0;i<size;i++)
		{
			if(i%2==0)
			{
				sum = sum+arr[i];
				System.out.println(i+"-->"+arr[i]);
			}
		}

		System.out.println("Sum of Even Index Elements = "+sum);
		sc.close();
	}
}
