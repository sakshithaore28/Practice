package cj5;

abstract class car {
	public abstract void drive();
	
}
class wagnor extends car{
	
	public void drive()
	{
		System.out.println("driving");
	}
	
}

public class AbstractPrep {
	public static void main(String[] args)
	{
		wagnor w = new wagnor();
		w.drive();
	}
}
