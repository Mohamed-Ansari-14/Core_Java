package array;

public class LargestAndSmallestElementOfAnArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,3,4,50,60,70,800,9,100};
		
		int large = arr[0];
		int small = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
				large = arr[i];
			else if(small>arr[i])
				small = arr[i];
		}
		
		System.out.println("Large Element = "+large);
		System.out.println("Small Element = "+small);
	}
}
