package testng_demo;

import org.testng.annotations.Test;

public class Testng1 {
	
	

	@Test(priority=0)
	public void pravendra(){
		System.out.println("Login Successful");
	}
	
	@Test(priority=2)
	public void arvind(){
		System.out.println("Login Successful");
	}
	
	@Test(priority=3)
	public void ram(){
		System.out.println("Login Successful");
	}
	
}
