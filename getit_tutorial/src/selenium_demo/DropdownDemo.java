package selenium_demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		Thread.sleep(10000);
		WebElement drop = driver.findElement(By.id("dropdown"));
		
		Select select=new Select(drop);
//		select.selectByValue("2");
//		select.selectByVisibleText("Option 2");
//		select.selectByIndex(2);
		List<WebElement> options = select.getOptions();
		for(WebElement temp: options){
			System.out.println(temp.getText());
		}
		
		Thread.sleep(10000);
		
		
				
	}

}
