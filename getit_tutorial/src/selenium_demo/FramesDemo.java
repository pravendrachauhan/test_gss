package selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		driver.switchTo().frame("classFrame");
		
		driver.findElements(By.xpath("//a[@href='index-files/index-1.html']")).get(0).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageListFrame");
		
		driver.findElements(By.xpath("//a[@href='allclasses-frame.html']")).get(0).click();

		
				
	}

}
