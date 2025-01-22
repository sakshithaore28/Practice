package cj3;

public class StringExp {
	public static void main(String[]args)
	{
		StringBuffer sb=new StringBuffer("sakshi");
		sb.append(" thaore");
		System.out.println(sb);
		//Length of a String:
		
		String str="hello";
		System.out.println(str);
		
		//Concatenation
		
		String str1=" world";
	
		System.out.println(	str.concat(str1));
		
		//Substring: To extract a substring from a string:
		
		String subStr=str.substring(0, 5);
		System.out.println(subStr);
		
		//String Comparison:
		
		System.out.println(str.equals(str1));
		
		//Changing Case:
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//Trimming Whitespace:
		
		String str2="   hello,world   ";
		System.out.println(str2.trim());
		
		//Replacing Substrings:
		System.out.println(str2.replace("world","java"));
		
		
		//Splitting a String: You can split a string based on a delimiter.
		String str3="apple, banana,grapes";
		String[] fruits=str3.split(",");
		for(String s:fruits)
		{
			System.out.println(s);
		}
		
		//Checking if String Contains Another String:
		
		System.out.println(str3.contains("apple"));
		
		
		//String Builder (for mutable strings)
		
		StringBuilder sbu = new StringBuilder("Hello");
		sbu.append(", World!");
		System.out.println(sbu.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
