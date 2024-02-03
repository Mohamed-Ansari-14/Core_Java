package fileHandling;

import java.io.File;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		File f1 = new File("D:\\New folder-2(File Handling)");
		if(f1.exists())
		{
			System.out.println("Deleting Old Folder and Creating New One...");
			f1.delete();
			f1.mkdir();
		}
		else
		{
			System.out.println("Creating New One...");
			f1.mkdir();
		}
		System.out.println("Done");
	}
}
