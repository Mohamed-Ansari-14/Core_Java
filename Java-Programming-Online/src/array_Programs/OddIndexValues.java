package array_Programs;
//WAJP TO PRINT AN ODD INDEX VALUES IN AN ARRAY
import java.util.Scanner;

public class OddIndexValues 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		//Adding Elements
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Odd Index Elements are:");
		for(int i=0;i<size;i++)
		{
			if(i%2!=0)
				System.out.println(i+"-->"+arr[i]);
		}
		sc.close();
	}
}
