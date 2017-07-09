package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("before suite");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("before method");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("before test");

	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("after suite");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("after class");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after method");
	}

	@AfterTest
	public void afterTest(){
		System.out.println("after test");
	}
	
	@Test
	public void test1(){
		System.out.println("test 1");

	}
	
	@Test
	public void test2(){
		System.out.println("test 2");

	}
	
	@Test
	public void test3(){
		System.out.println("test 3");

	}

	


}
