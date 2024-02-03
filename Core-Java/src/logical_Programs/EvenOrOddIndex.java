package logical_Programs;

public class EvenOrOddIndex 
{
	public static void main(String[] args) 
	{
		System.out.println("--------------------------");
		
		int arr[] = {1,2,3,4,5,6,7,8};
		
		System.out.println("Even Numbers Position..."+"\n");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
				System.out.println("Even Number "+arr[i]+" at index "+i);
//			else
//				System.out.println("Odd Number "+arr[i]+" at index "+i);
				
		}System.out.println();
		
//		System.out.println("Odd Numbers Position..."+"\n");
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]%2 != 0)
//				System.out.println("Even Number "+arr[i]+" at index "+i);
//		}
//		
//		System.out.println("--------------------------");
	}
}
