package array;

//import java.util.Arrays;

public class MergingOfAnArray 
{
	public static void main(String[] args) 
	{
		int num1 = 3;
		int num2 = 2;
		int num3 = num1+num2;
		
		int arr1[] = new int[num1];
		int arr2[] = new int[num2];
		int arr3[] = new int[num3];
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		arr2[0] = 40;
		arr2[1] = 50;
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i] = arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			arr3[num1+i] = arr2[i];
		}
		
		System.out.print("Merged Array Value = ");
		//System.out.println(Arrays.toString(arr3));
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
		
	}
}





