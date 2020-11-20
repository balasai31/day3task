package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class course {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani KDM\\eclipse-workspace\\Demo\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
					
					WebElement txtint=driver.findElement(By.xpath("//input[@autocomplete='off']"));
					
				txtint.sendKeys("iphone 7");
				
				WebElement clcsrh=driver.findElement(By.xpath("//input[@type='submit']"));
				clcsrh.click();
				
				
				
	}

}
