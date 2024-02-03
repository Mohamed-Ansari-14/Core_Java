package numberPrograms2;
//WAJP TO CHECK THE GIVEN NUMBER IS SUNNY NUMBER OR NOT
//SUNNY NUMBER IS A NUMBER,NECT TO THE GIVEN NUMBER..
//IS PERFECT SQUARE NUMBER.
public class SunnyNumber
{
	public static void main(String[] args) 
	{
		int num=3;
		//Find the Next Number...in the Given Number
		int next = num+1;	//8+1 = 9
		//Find Square Root For Next Number
		int root = 0;
		for(int i=1;i<=next/2;i++)
		{
			if(i*i==next)	//3*3 = 9
			{
				root = 1;
				break;
			}
		}
		if(root == 1)
			System.out.println(num+" is Sunny Number");
		else
			System.out.println(num+" is Not a Sunny Number");
	}
}
