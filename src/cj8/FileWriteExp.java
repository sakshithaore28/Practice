package cj8;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExp {
	public static void main(String[] arg)
	{
		try {
			FileWriter w= new FileWriter("myFile.txt");
			w.write("files in jav is ggod");
			w.close();
			
			System.out.println("successfully written");
		}
		catch(IOException e)
		{
			System.out.println("an error is occured");
			e.printStackTrace();
		}
	
	}
}
