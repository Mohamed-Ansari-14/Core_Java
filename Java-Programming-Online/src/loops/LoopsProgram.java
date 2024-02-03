package loops;

public class LoopsProgram 
{
	//WAJP print positive Even number between range (-5 to +5)
	public static void main(String[] args) 
	{
		int a = -5;
		while(a<=5)
		{
			if(a%2==0 && a>0)
			{
				System.out.println(a);
			}
			a++;
		}
		
		System.out.println("-----------------");
		
		for(int i=-5;i<=5;i++)
		{
			if(i%2==0 && i>0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("-----------------");
		
		int n = -5;
		do {
			if(n%2==0&&n>0)
			{
				System.out.println(n);
			}
			n++;
		}while(n<=5);
	}
}










