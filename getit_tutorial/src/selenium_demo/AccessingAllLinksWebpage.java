package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingAllLinksWebpage {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amtrak.com/home");
		
		List<WebElement> anchorTagList = driver.findElements(By.tagName("a"));
		
		for(WebElement elem : anchorTagList){
			try{
				elem.click();}
			catch(Exception e){
				System.out.println("element is not available");
			}
			if(driver.getTitle().equals("404 Found")){
				System.out.println("Page is not available: "+driver.getCurrentUrl());
			}
			else{
				System.out.println("Page is available: "+driver.getCurrentUrl());
			}
			driver.navigate().back();
			
		}
		
	}
	
	

}
