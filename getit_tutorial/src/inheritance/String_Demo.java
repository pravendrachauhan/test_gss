package inheritance;

public class String_Demo {

	static{
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
//		String name="pravendra";
		String name=new String("pravendra");
		
		System.out.println("1: "+name);
		
		System.out.println(name.concat(" hello"));
		System.out.println(name);
		
		StringBuilder str=new StringBuilder("good");
		
		str.append(" class");
		
		System.out.println(str);
		
		
		
	}
}
