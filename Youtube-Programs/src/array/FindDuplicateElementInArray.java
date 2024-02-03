package array;

public class FindDuplicateElementInArray 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,10,50,60,70,20,100,55,30,90,65};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println("Duplicate Element: "+arr[i]);
			}
		}
	}
}
