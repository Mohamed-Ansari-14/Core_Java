package array;

import java.util.Scanner;

public class MergedArrayUsingScanner 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);)
		{
			System.out.println("Enter how many values you want in First Array ?");
			int num1 = sc.nextInt();
			
			System.out.println("Enter how many values you want in Second Array ?");
			int num2 = sc.nextInt();
			
			int num3 = num1+num2;
			
			int arr1[] = new int[num1];
			int arr2[] = new int[num2];
			int arr3[] = new int[num3];
			
			System.out.println("Enter "+num1+" values for First Array");
			for(int i=0;i<arr1.length;i++)
			{
				arr1[i]=sc.nextInt();
			}
			
			System.out.println("Enter "+num2+" values for Second Array");
			for(int i=0;i<arr2.length;i++)
			{
				arr2[i]=sc.nextInt();
			}
			
			for(int i=0;i<arr1.length;i++)
			{
				arr3[i]=arr1[i];
			}
			
			for(int i=0;i<arr2.length;i++)
			{
				arr3[num1+i]=arr2[i];
			}
			
			System.out.print("Merged Array Value are = ");
			for(int i=0;i<arr3.length;i++)
			{
				System.out.print(arr3[i]+" ");
			}
		}
	}
}
















