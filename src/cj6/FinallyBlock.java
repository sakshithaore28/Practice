package cj6;

public class FinallyBlock {
	    public static void main(String[] args) {
	        try {
	            System.out.println("In the try block");
	            int result = 10 / 0;  
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e);
	        } finally {
	            System.out.println("This is the finally block.");
	        }
	    }
	}



