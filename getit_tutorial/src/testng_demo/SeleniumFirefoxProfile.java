package testng_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class SeleniumFirefoxProfile {
	

	@Test
	public void openFF(){
		
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("intl.accept_languages", "ES");
		
		//Open chrome browser
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver(profile);
		//launch google.com
		driver.get("https://gmail.com");
		
		
	}

	
}
