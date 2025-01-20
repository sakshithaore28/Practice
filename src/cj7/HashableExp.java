package cj7;
import java.util.Hashtable;  
import java.util.HashMap;  
import java.util.Map;
public class HashableExp {
	  
  
	    public static void main(String[] args) {  
	      
	        Map<String , Integer> map = new HashMap<>();  
	        map.put("One", 1);  
	        map.put("Two", 2);  
	        map.put("Three", 3);          
	        
	        Hashtable<String ,Integer> hashtable = new Hashtable<>(map);          
	         
	        System.out.println("Hashtable: " + hashtable);  
	     
	}  
}

