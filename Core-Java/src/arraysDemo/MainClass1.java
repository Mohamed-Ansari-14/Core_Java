package arraysDemo;

import java.util.Scanner;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		try(Scanner sc1 = new Scanner(System.in);)
		{
			//int[] arr = {10,20,30,40,50};
			//int arr[] = {1,2,3,4,5,6,7,8,9,10};
			
			//--> Datatype[]var=new Datatype[size]-->size can be 0 or + ve;
			
			/*
			 * int arr[] = new int[3]; arr[0] = 10; arr[1] = 20; arr[2] = 30;
			 */
			
			System.out.println("How Many Elements You want to Store? ");
			int size = sc1.nextInt();
			int arr[] = new int[size];
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("Enter "+(i+1)+" Element");
				arr[i] = sc1.nextInt();
			}
			
			for(int i=0;i<=arr.length;i++)
			{
				System.out.println(i);
			}
			
			System.out.println();
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(i+"--->"+arr[i]+"\n");
			}
			
			/*
			 * for(int x: arr) { System.out.print(x+" "); }
			 */
		}
	}
}
