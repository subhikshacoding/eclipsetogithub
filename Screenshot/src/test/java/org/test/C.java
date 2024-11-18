package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C {//frame
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		
		driver.findElement(By.id("name")).sendKeys("main page1");//main
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		Select s = new Select(driver.findElement(By.id("course")));
		s.selectByVisibleText("Java");
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("hello");//frame3
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("main page");//main


		
//		driver.findElement(By.id("name")).sendKeys("subhi");
//		
//		driver.switchTo().frame(driver.findElement(By.id("frm1")));
//		
//		Select s = new Select(driver.findElement(By.id("course")));
//		s.selectByVisibleText("Java");
//		
//		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("name")).sendKeys("world");
		
	}

}
