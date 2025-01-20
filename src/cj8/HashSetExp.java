package cj8;
import java.util.*;
public class HashSetExp {
	  
	  
	public static void main(String[] args)  
	{  
	HashSet<String> hs= new HashSet<String>();  
	hs.add("India");  
	hs.add("America");  
	hs.add("Russia");  
	hs.add("China");  
	hs.add("India");                        
	hs.add("Russia");                                
	System.out.println("Set is "+hs);          
	Iterator it=hs.iterator();                    
	System.out.println("Elements using iterator:");  
	while(it.hasNext())                           
	{  
	String s=(String)it.next();  
	System.out.println(s);  
	}  
	}  
	}  


