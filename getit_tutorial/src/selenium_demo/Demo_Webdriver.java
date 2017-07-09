package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_Webdriver {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.co.in");
		
		WebElement txt = driver.findElement(By.id("lst-ib"));
		
		txt.sendKeys("world war");
		
		waitTime(5000L);
		
//		WebElement searchButton = driver.findElement(By.id("btnG"));
//		
//		searchButton.click();
		
		driver.quit();
		
	}
	
	public static void waitTime(Long ms){
		
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
