package com.mindtree.seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tide {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe"); 
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
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
			
			System.out.println(driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(1000L);
			
			System.out.println(driver.getTitle());
			
			Actions b=new Actions(driver);
			b.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Our Commitment')]"))).build().perform();
			Thread.sleep(2000L);
			
			//America’s #1 Detergent
			
			driver.findElement(By.xpath("//span[contains(text(),'America’s #1 Detergent')]")).click();
			Thread.sleep(2000L);
			
            System.out.println(driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(1000L);
			System.out.println(driver.getTitle());
			
			
			Actions s=new Actions(driver);
			s.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Shop Products')]"))).build().perform();
			Thread.sleep(2000L);
			
			driver.findElement(By.xpath("//span[contains(text(),'Powder')]")).click();
			Thread.sleep(2000L);
			System.out.println(driver.getTitle());
			
			
		

	}

}
