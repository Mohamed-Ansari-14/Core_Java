package array_Programs;
////WAJP TO PRINT AN ODD ELEMENTS IN AN ARRAY.
import java.util.Scanner;

public class OddElementsValues 
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
		
		System.out.println("Even Elements are:");
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
