package selenium_demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HashSetDemo {
	public static void main(String[] args) throws InterruptedException {
		
		HashSet<String> hash=new HashSet<>();
		hash.add("a");
		hash.add("a");
		hash.add("a");
		hash.add("a");
		hash.add("b");
		hash.add("c");
		hash.add("d");
		hash.add("e");
		hash.add("f");
		hash.add(null);
		
		for(String temp: hash){
				System.out.println(temp);
		}
		
	}

}
