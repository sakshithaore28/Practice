package cj8;
interface MyInterface {
   
    void abstractMethod();
    
   
    default void defaultMethod() {
        System.out.println("This is the default method.");
    }
}

class MyClass implements MyInterface {
    
    public void abstractMethod() {
        System.out.println("Implemented abstract method.");
    }
}


    



public class DefaultMethodExp {
	public static void main(String[] args) {
        MyClass myClass = new MyClass();
        
       
        myClass.abstractMethod();
        
      
        myClass.defaultMethod();
    }

}
