package loops;

public class Do_While_Loop 
{
	public static void main(String[] args)
	{
		int i = 1;
		do{
			if(i%2==0)
				System.out.println(i+" is a Even Number");
			i++;
		}while(i<=10);
	}
}
