package org.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {//table
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//to get table first
		
		WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
		
		//to get rows in table
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		
		 
		 //to iterating over row
		 
		 for(int i=0; i<rows.size(); i++) {
			 
			 WebElement getrowes = rows.get(i);
			 
			 List<WebElement> tablehead = getrowes.findElements(By.tagName("th"));
			 
			 for(int j=0; j<tablehead.size(); j++) {
				 
				 WebElement tableheadget = tablehead.get(j);
				 String tabletext = tableheadget.getText();
				 System.out.println(tabletext);
			 }
			 
			 List<WebElement> tabledata = getrowes.findElements(By.tagName("td"));
			 
			 for(int j=0;j<tabledata.size(); j++) {
				 
				 WebElement gettabledatas = tabledata.get(j);
				 String tabletext2 = gettabledatas.getText();
				 System.out.println(tabletext2);
			 }
		
			 
			 
		 }
		 
		 driver.quit();
		 
	}

}
