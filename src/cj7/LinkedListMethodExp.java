package cj7;
import java.util.*;  

public class LinkedListMethodExp {
	public static void main(String args[]){  
		LinkedList<String> l=new LinkedList<String>();
		l.add("ravi");
		l.add("vijay");
		l.add("Ravi");
		l.add("Ajay");
		//adding element in linked list
		l.add(4,"piu");
		//Java LinkedList example to remove elements
		
		l.remove("piu");
		
		//Java LinkedList Example to reverse a list of elements
		
		
		Iterator<String> i=l.descendingIterator();
		while(i.hasNext())
		{
			String s=i.next();
			System.out.println(s);
		}
	}

}

//can print duplicate element.


