package numberPrograms;
//WAJP TO FIND PRODUCT OF FACTORS 
public class ProductOfFactors 
{
	public static void main(String[] args) 
	{
		int num = 6,product = 1;
		for(int i=1;i<=num;i++)
		{
			if(num % i == 0)
				product = product*i;
		}
		
		System.out.println("Product of Factors = "+product);
	}
}
