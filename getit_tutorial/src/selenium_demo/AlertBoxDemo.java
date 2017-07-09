package selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.amtrak.com/home");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath(".//*[@id='subscribe_home']/div[1]/a")).click();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
				
	}

}
