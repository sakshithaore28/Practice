package cj7;
import java.util.*;


public class IteratorExp {
	public static void main(String[] arg)
	{
		ArrayList<String> al =new ArrayList<String>();
		al.add("a");
		al.add("aa");
		al.add("aaa");
		al.add("aaaa");
		al.add("aaaa");
		
		Iterator<String>it=al.iterator();
		
		while(it.hasNext())
		{
			String s=it.next();
			System.out.println(s);
		}
		
		
	}


}
