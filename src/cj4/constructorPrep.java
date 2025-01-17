package cj4;

class Demo
{
	int id;
	String name;
	Demo(int id,String name)
	{
		this.name=name;
		this.id=id;
		
	}
}

public class constructorPrep {
	
	public static void main(String[] args)
	{
		Demo d = new Demo(1,"sakshi");
		System.out.println(d.id );
		System.out.println(d.name );
	}

}
