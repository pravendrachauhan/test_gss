package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumEdge {
	
	

	@Test
	public void openChrome(){
		//Open chrome browser
		System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
		WebDriver driver=new EdgeDriver();
		//launch google.com
		driver.get("http://www.google.com");
		//search some text
		driver.findElement(By.id("lst-ib")).sendKeys("world");
		//close browser
		driver.close();
	}

	
}
