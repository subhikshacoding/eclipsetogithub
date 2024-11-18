package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {//selectable
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement element = driver.findElement(By.name("login"));
		
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		
		WebElement element2 = driver.findElement(By.xpath("//a[text() = 'Create new account']"));
		element2.click();
		
		Thread.sleep(3000);
		
		
		WebElement element3 = driver.findElement(By.xpath("//label[text() ='Female']"));
		element3.click();
		
		boolean selected = element3.isSelected();
		System.out.println(selected);
	}
	

}
