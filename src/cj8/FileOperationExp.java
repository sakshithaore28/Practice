package cj8;
import java.io.File;
import java.io.IOException;

public class FileOperationExp {
	public static void main(String[] arg)
	{
		try {
			File obj=new File("myFile.txt");
			if(obj.createNewFile()) {
				System.out.println("file is created "+obj.getName());
				
			}
			else{
				System.out.println("File Alreadt Exist");
				
			}
		}
		catch(IOException e)
		{
			System.out.println("error occured");
			
			e.printStackTrace();
		}
	}

}
