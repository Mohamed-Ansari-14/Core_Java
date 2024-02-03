package zenardyInterviewLogics;

import java.util.Scanner;

//WAJP TO ROTATE THE ARRAY ELEMENTS TO RIGHT
//I/P --> {1,2,3,4,5}
//O/P --> {3,4,5,1,2}
public class RotationofArrayElements 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			int num[] = {1,2,3,4,5};

			System.out.println("Input Array: ");
			for(int n : num)
			{
				System.out.print(n+" ");
			}

			System.out.println("\nEnter how many times to Rotate");
			int n = sc.nextInt();

			for(int i=0;i<n;i++)
			{
				int first = num[0];
				for(int j=0;j<num.length-1;j++)
				{
					num[j]=num[j+1];
				}
				num[num.length-1]=first;		//-->Adding to last memory block
			}
			
			System.out.println();
			System.out.println("Rotate of Array Element: ");

			for(int a : num)
			{
				System.out.print(a+" ");
			}
		}
	}
}

























