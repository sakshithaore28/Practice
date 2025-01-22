package cj7;
import java.util.*;


public class ArratListExp {
	  
	
	 public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	  list.add("Mango");    
	  list.add("Apple");    
	  list.add("Banana");    
	  list.add("Grapes");  
	  
	  ArrayList<String> list1=new ArrayList<String>();
	  
	  list1.add("Apple");
	  list1.add("Grapes");
	  
	  //Get and Set ArrayList
	  System.out.println("Getting element  :"+list.get(1)); 
	  
	  list.set(0,"kiwi");
	  
	  
	  //Sort ArrayList
	  
	  Collections.sort(list);
	  
	  //Java ArrayList example to remove elements
	  
	  list.remove("Banana");
	  
	  //Java ArrayList example of retainAll() method
	  list.retainAll(list1);
	 
	  for(String fruit:list)    
	    System.out.println(fruit);    
	  
	 }  

	}  


