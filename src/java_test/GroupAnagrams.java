package java_test;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class GroupAnagrams
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arrSize=sc.nextInt();
		
		String strs[]=new String[arrSize];
		for(int i=0;i<strs.length;i++) strs[i]=sc.next();
		ArrayList checkAnagram = checkAnagram(strs);
		System.out.println(checkAnagram);
	}
	
	public static ArrayList checkAnagram(String strs[])
	{
		ArrayList<ArrayList<String>> list=new ArrayList<ArrayList<String>>();
		ArrayList<String> str=new ArrayList<String>();
		str.add(strs[0]);
		list.add(str);
		for(int i=0;i<strs.length-1;i++)
		{
			String s=strs[i+1];
			ListIterator<ArrayList<String>> iterator = list.listIterator();
			boolean bool=true;
			while(iterator.hasNext())
			{
				ArrayList<String> arr = iterator.next();
				if(checkData(arr, s))
				{
					arr.add(s);
					bool=false;
					break;
				}
			}
			if(bool)
			{
				ArrayList<String> str2=new ArrayList<String>();
				str2.add(s);
				list.add(str2);
			}
		}
		return list;
	}
	public static boolean checkData(ArrayList str,String s)
	{
		ListIterator iterator = str.listIterator();
		while(iterator.hasNext())
		{
			String st=(String) iterator.next();
			char[] charArray = st.toCharArray();
			char[] charArray2 = s.toCharArray();
			ArrayList ch=new ArrayList();
			ArrayList ch2=new ArrayList();
			for(int i=0;i<charArray.length;i++)
			{
				ch.add(charArray[i]);
			}
			for(int i=0;i<charArray2.length;i++)
			{
				ch2.add(charArray2[i]);
			}
			if(ch.containsAll(ch2)) return true;
		}
		return false;
	}
}
