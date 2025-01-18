package cj5;

class car{
	public void drive()
	{
		System.out.println("driving a car");
	}
}
class wagon extends car{
	public void drive()
	{
		System.out.println("driving a wagon");
	}
}

public class PolymorphismPrep {
	
	public static void main(String[] args)
	{
		wagon w=new wagon();
		w.drive();
		
		car c= new car();
		c.drive();
	}

}
