package cj3;

public class EnumExp {
	public enum Season {
		WINTER,
		SUMMER,
		SPRING,
		FALL;
	}
	
	public static void main(String[] args) {  
		
		for(Season s:Season.values())
		{
			System.out.println(s);
		}
		
		System.out.println("Value of WINTER IS :"
		+Season.valueOf("WINTER"));
		
		System.out.println("Index of WINTER IS :"
				+Season.valueOf("WINTER").ordinal());
	}
}
