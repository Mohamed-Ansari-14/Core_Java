package array_Programs;

import java.util.Scanner;

public class CharArrayUserInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		char arr[]=new char[size];
		
		//Storing Elements
		System.out.println("Enter the Character: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		
		//Printing Elements
		System.out.println("Array Elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		//Printing ASCII Value
		System.out.println("ASCII Values are: ");
		for(int i=0;i<size;i++)
		{
			int ascii = arr[i];
			System.out.println(arr[i]+"-->"+ascii);
		}
		
		sc.close();
	}
}



