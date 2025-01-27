package cj8;
import java.io.*;
import java.util.*;

public class FileRead {

	public static void main(String[]arg)
	{
		try {
			File obj=new File("myFile.txt");
			Scanner Read=new Scanner(obj);
			while(Read.hasNextLine())
			{
				String data=Read.nextLine();
				System.out.println(data);
				
			}
			Read.close();
		}
		catch(IOException e)
		{
			System.out.println("An error has occured");
			e.printStackTrace();
			
		}
	}
}
