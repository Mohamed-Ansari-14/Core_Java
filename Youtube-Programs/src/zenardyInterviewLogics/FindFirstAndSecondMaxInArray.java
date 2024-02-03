package zenardyInterviewLogics;
//WAJP TO FIND FIRST MAX AND SECOND MAX IN THE GIVEN ARRAY
public class FindFirstAndSecondMaxInArray 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,90,30,100,50,20,5,99,55};
		int firstLargestNum = 0;
		int secondLargestNum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(firstLargestNum < arr[i])
			{
				secondLargestNum = firstLargestNum;
				firstLargestNum = arr[i];
			}
			else if(secondLargestNum < arr[i])
			{
				secondLargestNum = arr[i];
			}
		}
		
		System.out.println("First Largest Element = "+firstLargestNum);
		System.out.println("Second Largest Element = "+secondLargestNum);
	}
}
