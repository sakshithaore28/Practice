package cj5;

class car3{
	public void drive1()
	{
		System.out.println("driving a car");
	}
}
class wagon extends car3{
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
		
		car3 c= new car3();
		c.drive();
	}

}
