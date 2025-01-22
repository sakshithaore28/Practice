package PracticeQue;

class Cellphone{
	public void contacts(String s,int n){
		
		System.out.println("Name=" +s);
		System.out.println("ContactNum=" +n);
	}
	
public void contacts(String s,int n,int n1){
		
		System.out.println("Name=" +s);
		System.out.println("ContactNum=" +n);
		System.out.println("ContactNum=" +n1);
	}
}

public class Task1 {
	public static void main(String[] arg)
	{
		Cellphone c = new Cellphone();
		c.contacts("sakshi",123456789, 123455);
		c.contacts("sakshi",123456789);
		
		
	}

}
