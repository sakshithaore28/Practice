package PracticeQue;
 interface Test{
	 public int square(int a);
 }
 class Arithmetic implements Test{

	@Override
	public int square(int a) {
		
		return a*a;
	}
	 
 }
 
public class ToTestInt {
	public static void main(String[]arg)
	{
		Arithmetic a = new Arithmetic();
		System.out.println(a.square(2));
		
		
	}


}
