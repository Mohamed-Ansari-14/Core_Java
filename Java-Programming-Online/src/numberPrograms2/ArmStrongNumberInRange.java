package numberPrograms2;
//WAJP TO FIND THE ARMSTRONG NUMBER IN THE RANGE OF 100 to 1000
public class ArmStrongNumberInRange 
{
	public static void main(String[] args) 
	{
		for(int k=100;k<=1000;k++)
		{
			int num = k, n1=num;
			int count = 0;
			while(num>0)
			{
				count++;
				num = num/10;
			}
			
			int sum = 0;
			while(n1>0)
			{
				int pow = 1;
				int rem = n1%10;
				
				for(int i=1;i<=count;i++)
				{
					pow = pow*rem;
				}
				
				sum = sum+pow;
				n1 = n1/10;
			}
			if(k==sum)
				System.out.println(k);
		}
	}
}














