package selenium_demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		WebElement startButton = driver.findElement(By.xpath(".//*[@id='start']/button"));
		
		startButton.click();
				
		Wait wait=new FluentWait(driver)
						.withTimeout(50, TimeUnit.SECONDS)
									.pollingEvery(3, TimeUnit.SECONDS)
										.ignoring(NoSuchElementException.class);
		
		WebElement foo = (WebElement) wait.until(new Function() {
			 
		    public Object apply(WebDriver driver) {
		 
		    return driver.findElement(By.xpath(".//*[@id='finish']/h4"));
		 
		    }

			@Override
			public Object apply(Object t) {
				// TODO Auto-generated method stub
				return null;
			}
		 
		   });
		
		WebElement helloWorldText = driver.findElement(By.xpath(".//*[@id='finish']/h4"));

		System.out.println(helloWorldText.getText());
		
		
	}

}
