package cj7;
import java.util.*; 
public class TreeSetExp {
  
	 public static void main(String args[]) {  
	  //Creating and adding elements  
	  TreeSet<String> al=new TreeSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  //Traversing elements  
	  
	  
	
	  Iterator<String> itr=al.descendingIterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  } 
	  
	  TreeSet<Integer>ts=new TreeSet<Integer>();
	  ts.add(24);
	  ts.add(66);
	  ts.add(12);
	  ts.add(15);
	//  System.out.println(ts.pollFirst());  
	 // System.out.println(ts.pollLast());  
	  
	  System.out.println(ts.descendingSet());
	  
	  System.out.println(ts.headSet(12,true));
	  System.out.println(ts);  
	  
	 // System.out.println(ts.subSet(24,false,15,true));
	  
	  System.out.println(ts.tailSet(66));  
	  
	  
	  TreeSet<String> set=new TreeSet<String>();  
      set.add("A");  
      set.add("B");  
      set.add("C");  
      set.add("D");  
      set.add("E");  
        
      System.out.println("Intial Set: "+set);  
        
      System.out.println("Head Set: "+set.headSet("C"));  
       
      System.out.println("SubSet: "+set.subSet("A", "E"));  
        
      System.out.println("TailSet: "+set.tailSet("C"));  
	  
	  
	  
	  
	 
	 }  
	}  

//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class doesn't allow null elements.
//Java TreeSet class maintains ascending order.

//pollfirst and polllast method
//headset
//subset
//tailset
