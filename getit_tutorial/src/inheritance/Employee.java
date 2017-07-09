package inheritance;

public class Employee {

	private int salary=5000;
	private static String org="TCS";
	
	public int getSalary() {
		return salary;
	}

	protected void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(){
//		String ab="hello";
//		System.out.printf("Constructor Of %S Employee class",ab);
	}
	
	public void message(){
		System.out.println("Hello All");
	}
	
}
