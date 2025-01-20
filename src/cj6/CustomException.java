package cj6;
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}
public class CustomException {
	
	    public static void main(String[] args) {
	        try {
	            validateAge(17);
	        } catch (MyCustomException e) {
	            System.out.println("Caught custom exception: " + e.getMessage());
	        }
	    }

	    public static void validateAge(int age) throws MyCustomException {
	        if (age < 18) {
	            throw new MyCustomException("Age must be 18 or older");
	        }
	        System.out.println("Valid age: " + age);
	    }
	}


