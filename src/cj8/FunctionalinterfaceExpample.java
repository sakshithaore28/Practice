
	package cj8;
	import java.util.function.Function;
	public class FunctionalinterfaceExpample {
		

	
		    public static void main(String[] args) {
		        
		        Function<Integer, Integer> squareFunction = x -> x * x;

		        int result = squareFunction.apply(5);
		        System.out.println("The square of 5 is: " + result);
		    }
		}

	

