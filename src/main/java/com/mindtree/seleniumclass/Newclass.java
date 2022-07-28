package com.mindtree.seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Newclass {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe"); 
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			driver.get("https://www.moneycontrol.com/");
			//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			Thread.sleep(9000L);
			
			
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//li[@cid='8']"))).build().perform();
			
			WebDriverWait wd=new WebDriverWait(driver, 90);
			wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Income Tax Calculator']")));
			driver.findElement(By.xpath("//a[@title='Income Tax Calculator']")).click();

	}

}
