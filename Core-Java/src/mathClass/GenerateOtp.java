package mathClass;

public class GenerateOtp 
{
	private static String generateOtp()
	{
		String otp = "";
		int n1 = (int)(Math.random()*10);
		int n2 = (int)(Math.random()*10);
		int n3 = (int)(Math.random()*10);
		int n4 = (int)(Math.random()*10);
		
		otp = otp+n1+n2+n3+n4;
		return otp;
	}
	
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			String otp = generateOtp();
			System.out.println(otp);
		}
	}
}
