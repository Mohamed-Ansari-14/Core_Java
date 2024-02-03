 package zenardyInterviewLogics;
//WAJP TO REMOVE THE DUPLICATE ELEMENTS IN AN ARRAY
public class RemoveDuplicateElementInArray 
{
	public static void main(String[] args) 
	{
		int num[] = {10,20,55,100,55,10,50,95,50,100};
		int visited = -1;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i] != -1)
			{
				for(int j=i+1;j<num.length;j++)
				{
					if(num[i]==num[j])
						num[j]= visited;
				}
				System.out.print(num[i]+" ");
			}
		}
	}
}
