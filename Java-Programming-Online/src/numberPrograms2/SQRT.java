package numberPrograms2;
//WAJP TO FIND SQRT OF GIVEN NUMBER
public class SQRT 
{
	public static void main(String[] args) 
	{
		int num = 9;
		for(int i=1;i<=num/2;i++)
		{
			if(i*i == num)
			{
				System.out.println(i);
				break;
			}
		}
	}
}
