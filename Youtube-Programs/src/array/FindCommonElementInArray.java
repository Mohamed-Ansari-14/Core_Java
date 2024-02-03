package array;

public class FindCommonElementInArray 
{
	public static void main(String[] args) 
	{
		int arr1[]= {1,3,5,7,9,11,13,15,17,19};
		int arr2[]= {2,3,4,6,8,9,10,12,14};
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
					System.out.println("Common Element: "+arr1[i]);
			}
		}
	}
}
