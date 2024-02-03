package fileHandling;

import java.io.File;
import java.io.IOException;

public class MainClass2 
{
	public static void main(String[] args) 
	{
		/*System.out.println("\"hi\"");
		System.out.println("\n");
		System.out.println("\\n");*/
		
		File f1 = new File("D:\\New folder-2(File Handling)\\data.txt");
		
		try
		{
			f1.createNewFile();
			System.out.println(f1.getName());
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.getParent());
			System.out.println(f1.isDirectory());
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			
			System.out.println(f1.setWritable(false)); 
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
