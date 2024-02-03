package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass4 
{
	public static void main(String[] args)
	{
		File f1 = new File("D:\\\\New folder-2(File Handling)\\\\data.txt");
		FileReader fr = null;
		try
		{
			fr = new FileReader(f1);
			int size = (int)f1.length();
			System.out.println(size);
			char arr[]=new char[size];
			System.out.println(arr);
			f1.canRead();
			String data = new String(arr);
			System.out.println(data);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				fr.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
