package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void beforeTest(String browser){
		//Open chrome browser
		if(browser.equals("FireFox")){
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Edge")){
			System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
	}

	@Test
	public void openBrowser(){
		//launch google.com
		driver.get("http://www.google.com");
		//search some text
		driver.findElement(By.id("lst-ib")).sendKeys("world");

	}

	@AfterTest
	public void afterTest(){
		//close browser
		driver.close();
	}


}
