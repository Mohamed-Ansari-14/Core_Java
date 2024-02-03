package zenardyInterviewLogics;

public class PatternProgram 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1)
					System.out.print(i);
			}
			
			for(int j=1;j<=i;j++)
			{
				if(j==2)
					System.out.print(i*2);
			}
			
			for(int j=1;j<=i;j++)
			{
				if(j==3)
					System.out.print(i*3);
			}
			
			for(int j=1;j<=i;j++)
			{
				if(j==4)
					System.out.print(i*4);
			}
			
			for(int j=1;j<=i;j++)
			{
				if(j==5)
					System.out.print(i*5);
			}
			System.out.println();
		}
	}
}
