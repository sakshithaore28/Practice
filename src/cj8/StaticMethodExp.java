package cj8;
interface MyInterface1 {
    
    void abstractMethod();
    
    
    default void defaultMethod() {
        System.out.println("This is the default method.");
    }
}

class MyClass1 implements MyInterface1 {
    
    public void abstractMethod() {
        System.out.println("Implemented abstract method.");
    }
}






public class StaticMethodExp {
	  public static void main(String[] args) {
	        MyClass1 myClass = new MyClass1();

	        myClass.abstractMethod();
	        
	        myClass.defaultMethod();
	    }

}
