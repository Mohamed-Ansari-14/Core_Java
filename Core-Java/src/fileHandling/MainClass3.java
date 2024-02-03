package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass3
{
	public static void main(String[] args) 
	{
		File f1 = new File("D:\\New folder-2(File Handling)\\data.txt");
		FileWriter fw = null;
		
		try
		{
			f1.setWritable(true);
			fw = new FileWriter(f1);
			fw.write("Hello this Data is Coming From the Program...\n");
			fw.write("Hello World............");
			fw.flush();
			fw.close();
			System.out.println("Done...");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			try
			{
				fw.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
