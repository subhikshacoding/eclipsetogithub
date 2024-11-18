package org.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {//window handle

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.snapdeal.com/");
		WebElement txtsearch = driver.findElement(By.id("inputValEnter"));
		txtsearch.sendKeys("hand sanitizer");
		
		WebElement btnsearch = driver.findElement(By.xpath("//span[text()='Search']"));
		btnsearch.click();
		
		WebElement image = driver.findElement(By.xpath("//img[@src='https://t1.sdlcdn.com/imgs/k/b/5/230X258_sharpened/Mirah-Belle-Lemon-Hand-Sanitizer-SDL592272775-1-6ae85.webp']"));
		image.click();
		
		String parenttab = driver.getWindowHandle();
		System.out.println("parent tab"+parenttab);
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		List<String> list = new ArrayList<String>(allwindows);
		driver.switchTo().window(list.get(1));
		
		System.out.println(driver.getCurrentUrl());

		
	//to switch into child window by iteration
		
		for(String c : allwindows) {
			
			if(!parenttab.equals(c)) {
				
				//switch to child
				
				driver.switchTo().window(c);
				System.out.println("window"+c);
			}
		}
		
	WebElement btnclick = driver.findElement(By.id("add-cart-button-id"));
		btnclick.click();
		
		driver.switchTo().defaultContent();
		
		driver.quit();
	}
}
