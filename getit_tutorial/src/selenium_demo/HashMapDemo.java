package selenium_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		
		HashMap<String, Integer> map1=new HashMap<>();
		map1.put("Ram", 25);
		map1.put("pravendra", 26);
		map1.put("shyam", 20);
		
		System.out.println(map1);
		
		int age = map1.get("pravendra");
		System.out.println(age);
		
//		for(Map.Entry<String, Integer> temp : map1.entrySet()){
//			System.out.println("Key: "+temp.getKey()+" Value: "+temp.getValue());
//		}
		
		for(String temp: map1.keySet()){
			System.out.println(map1.get(temp));
		}
		
	}

}
