package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumChrome {
	
	

	@Test
	public void openChrome(){
		//Open chrome browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//launch google.com
		driver.get("http://www.google.com");
		//search some text
		driver.findElement(By.id("lst-ib")).sendKeys("world");
		//close browser
		driver.close();
	}

	
}
