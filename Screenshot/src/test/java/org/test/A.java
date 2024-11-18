package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {//takescreenshot
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://toolsqa.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src =ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\user\\eclipse-workspace\\Screenshot\\snaps\\image.png");
		
		FileUtils.copyFile(src, dest);
		
	}

}
