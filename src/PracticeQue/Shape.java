package PracticeQue;

class Circle{
	
	public int perimeter(int l) {
		return (int) (2*3.14*l);
		
	}
	public int area(int r)
	{
		return (int)(3.14*r);
	}
	
}
class Triangle{
	public int perimeter(int a,int b,int c) {
		return a+b+c;
		
	}
	public int area(int c,int h)
	{
		return (c*h)/2;
	}
}
class Square{
	public int perimeter(int a) {
		return 4*a;
		
	}
	public int area(int a)
	{
		return a*a;
	}
}
public class Shape {
	
	public static void main(String[] arg)
	{
		Circle c=new Circle();
		Triangle t = new Triangle();
		Square s=new Square();
		
		c.perimeter(2);
		c.area(1);
		System.out.println("perimeter of circle:" +c.perimeter(2));

		System.out.println("Area of circle:" +c.area(1));
		
		System.out.println("perimeter of Triangle:" +t.perimeter(2,2,2));
		
		System.out.println("Area of Triangle:" +t.area(1,4));
		
		System.out.println("perimeter of square:" +s.perimeter(2));
		
		System.out.println("Area of Square:" +s.area(4));
		
		
		
		
		
		
		
		

	
		
	}

}
