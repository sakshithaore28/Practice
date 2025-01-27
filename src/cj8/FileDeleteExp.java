package cj8;
import java.io.*;
public class FileDeleteExp {
public static void main(String[]arg)
{
	File obj=new File("myFile.txt");
	if(obj.delete())
	{
	System.out.println("the deleted file  "+obj.getName());
	
	
	}
	else {
		System.out.println("Failed in deleting a file");
	}
}
}
