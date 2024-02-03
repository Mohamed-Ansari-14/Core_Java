package array_Programs;

import java.util.Scanner;

public class IntArrayUserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		//creation of Array
		int arr[] = new int[size];

		//Storing of Elements
		System.out.println("Enter Elements: ");
		for(int i =0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array Elements are: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"-->"+arr[i]);
		}
		sc.close();
	}
}
