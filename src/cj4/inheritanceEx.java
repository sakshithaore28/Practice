package cj4;

class calc{
	public int sum(int a,int b)
	{
		return a+b;
	}
}
class Advcalc extends calc{
	public int multi(int a,int b)
	{
		return a*b;
	}
}

public class inheritanceEx {
	public static void main(String[] arg)
	{
		Advcalc obj = new Advcalc();
		System.out.println(obj.sum(2, 2));
		System.out.println(obj.multi(2, 2));
		
	}

}
