package cj7;
import java.util.*;  

public class LinkedHashSetExp {
	
	
	 public static void main(String args[]){  
	  
	        LinkedHashSet<String> set=new LinkedHashSet();  
	               set.add("One");    
	               set.add("Two");    
	               set.add("Three");   
	               set.add("Four");  
	               set.add("Five");  
	               
	               
	               
	               Iterator<String> i=set.iterator();  
	               while(i.hasNext())  
	               {  
	               System.out.println(i.next());  
	               }  
	               
	               
	               
	               
	               
	               LinkedHashSet<String> hs=new LinkedHashSet<String>();
	               hs.add("ravi");
	               hs.add("ravi");
	               hs.add("vijay");
	               hs.add("ajay");
	               
	               Iterator<String> it=hs.iterator();
	               
	               while(it.hasNext()) {
	            	   String s=it.next();
	            	   
	            	   System.out.println(s);
	               }
	               
	               
	 }  
	} 

//Java LinkedHashSet class contains unique elements only like HashSet.
//Java LinkedHashSet class provides all optional set operations and permits null elements.
//Java LinkedHashSet class is non-synchronized.
//Java LinkedHashSet class maintains insertion order.