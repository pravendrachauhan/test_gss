package selenium_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrayListDemo {
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Integer> num=new ArrayList<>();
		num.add(0);
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println(num);
		
		LinkedList<Integer> linked=new LinkedList<>();
		linked.add(0);
		linked.add(1);
		linked.add(2);
		linked.add(3);
		System.out.println(linked);
		
		
		Iterator<Integer> it= num.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
