package PracticeQue;
class Box{
	public int length;
	public int breadth;
	public int height;
	

	public Box(int length,int breadth,int height) {
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		
		
	}
	public int area()
	{
		return this.length*this.breadth*this.height;
	}
	public int volume()
	{
		return this.length*this.length*this.length;
		
	}
	
	
	
	
}
class Box3d extends Box{

	public Box3d(int length, int breadth, int height) {
		super(length, breadth, height);
		
	}
	
}
public class Task5 {
	
	public static void main(String[] arg)
	{
		Box3d b = new Box3d(2,2,3);
		
		System.out.println(b.area());
		System.out.println(b.volume());
		
	}

}
