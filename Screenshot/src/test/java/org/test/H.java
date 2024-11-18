package org.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class H {//waits and do actions and robot class and js excecutor
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.alertIsPresent());
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		
		WebElement element = driver.findElement(By.name("login"));
		element.click();
		
		driver.quit();
		
		
		
	}

}
