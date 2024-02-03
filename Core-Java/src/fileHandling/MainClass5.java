package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass5 
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("D:\\New folder-2(File Handling)\\data.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}
