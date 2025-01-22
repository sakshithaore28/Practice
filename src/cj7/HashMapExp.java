package cj7;
import java.util.*; 
public class HashMapExp {
	 
	
	 public static void main(String args[]){  
	   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(1,"Mango");  //Put elements in Map  
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(1,"Grapes"); //trying duplicate key  
	       
	   System.out.println("Iterating Hashmap...");  
	   for(Map.Entry m : map.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
	   }

	   
	   HashMap<Integer,String> hm= new HashMap<>();
	   hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	      
	      System.out.println("After invoking put() method ");  
	      
	      for(Map.Entry m: hm.entrySet()) {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	    	  
	      }
	      hm.putIfAbsent(103, "Gaurav"); 
	      
	      for(Map.Entry m: hm.entrySet()) {
	    	  System.out.println(m.getKey()+" "+m.getValue());
	    	  
	      }
	      
	}  
	}  

/*

Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.*/

