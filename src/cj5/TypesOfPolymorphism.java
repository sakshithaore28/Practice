package cj5;

class car1{
	public void drive()
	{
		System.out.println("driving a car");
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
class wagon1 extends car1{
	public void drive()
	{
		System.out.println("driving a wagon");
	}
}

public class TypesOfPolymorphism {
	public static void main(String[] args)
	{
		wagon1 w=new wagon1();
		w.drive();
		
		car1 c= new car1();
		c.drive();
		
		System.out.println(c.add(2, 3));
		System.out.println(c.add(2, 3,2));
	}

}
