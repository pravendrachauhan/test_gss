package wiki_test_automation;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class wiki_test {
	WebDriver driver;
	//trying to test git hub url
	@BeforeTest
	public void setUp(){
		//Open FF browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}


	@Test(priority=1)
	public void testWelcomePage() throws IOException{
		try{

		//launch wikipedia.com
		driver.get("https://www.wikipedia.org/");
		//Click on English langauge
		driver.findElement(By.xpath(".//*[@id='js-link-box-en']/strong")).click();	
		//Click on Login link
//		driver.findElement(By.xpath(".//*[@id='pt-login']/a")).click();	
		driver.findElement(By.xpath(".//*[@id='pt-login-1']/a")).click();	
		
		//input user name
		driver.findElement(By.id("wpName1")).sendKeys("pravendra.chauhan");	
		//input password
		driver.findElement(By.id("wpPassword1")).sendKeys("pravendra");	
		//Click on Login button
		driver.findElement(By.id("wpLoginAttempt")).click();
		//Assert welcome text on page
		String welcomeText= driver.findElement(By.xpath(".//*[@id='mp-topbanner']/div/div[1]")).getText();
		System.out.println("text: "+welcomeText);
		Assert.assertEquals(welcomeText, "Welcome to Wikipedia,");
		}
		catch(Exception e){
			getScreenShot();
		}
	}
	
	@Test(priority=2, dependsOnMethods={"testWelcomePage"})
	public void testSearchFunctionality() throws InterruptedException{
		String searchString="World";
		//input search text
		driver.findElement(By.id("searchInput")).sendKeys(searchString);
		
		Thread.sleep(2000);
		//get the list
		driver.findElements(By.xpath("//div[@class='suggestions-results']/a//span")).get(0).click();
		
		Assert.assertEquals(driver.getTitle(), searchString+" - Wikipedia");
	}

	@AfterTest
	public void tearDown(){
		driver.close();
	}
	
	public void getScreenShot() throws IOException{
		File fs= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fs, new File("D:\\fresh_workspace\\abc.jpg"));
		throw new NoSuchElementException();
		
	}

}
