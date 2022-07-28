package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tide {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe"); 
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://tide.com/en-us");
			//class="lilo3746-close-link lilo3746-close-icon"
			Thread.sleep(6000L);
			
			driver.findElement(By.xpath("//a[contains(@class,'lilo3746-close-icon')]")).click();
			
			Thread.sleep(3000L);
			//Actions a=new Actions(driver);
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'How to Wash Clothes')]"))).build().perform();
			
			Thread.sleep(3000L);
			//Washing Different Fabrics and Colors
			driver.findElement(By.xpath("//span[contains(text(),'Washing Different Fabrics and Colors')]")).click();
		

	}

}
