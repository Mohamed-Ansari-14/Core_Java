package numberPrograms2;

public class Perfect_SQRT 
{
	public static void main(String[] args) 
	{
		int num = 9;
		int flag = 0;
		for(int i=1;i<=num/2;i++)
		{
			if(i*i == num)
				flag = 1;
		}
		
		if(flag == 1)
			System.out.println("Perfect Square Root");
		else
			System.out.println("Not a Perfect Square Root");
	}
}
