package getit_tutorial;
public class MainMethod {
	public static void main(String[] args) {
		
		parent p=new parent();
		p.sum(10, 10);
		
		child c=new child();
		c.sum(10, 10);
		
		parent ptoc=new child();
		ptoc.sum(10, 10);
		

	}
}
