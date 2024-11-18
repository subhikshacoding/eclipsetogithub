package org.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F {//css value

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		WebElement txthighlight = driver.findElement(By.xpath("//h2[contains(text(), 'Facebook helps ')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow')", txthighlight);
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		String color = btnlogin.getCssValue("background-color");
		String size = btnlogin.getCssValue("fontsize");
		String width = btnlogin.getCssValue("width");
		String font = btnlogin.getCssValue("font-family");
		String text = btnlogin.getCssValue("text-align");
		
		System.out.println(color);
		System.out.println(size);
		System.out.println(width);
		System.out.println(font);
		System.out.println(text);
		
	}
}
