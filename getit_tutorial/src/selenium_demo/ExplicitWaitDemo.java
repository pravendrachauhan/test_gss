package selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		WebElement startButton = driver.findElement(By.xpath(".//*[@id='start']/button"));
		
		startButton.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		WebElement helloWorldText = driver.findElement(By.xpath(".//*[@id='finish']/h4"));

		wait.until(ExpectedConditions.visibilityOf(helloWorldText));
		
		System.out.println(helloWorldText.getText());
		
		
	}

}
