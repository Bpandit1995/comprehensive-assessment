package com.mindtree.seleniumclass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//auto suggestive
      /* WebElement source=driver.findElement(By.id("autocomplete"));
       source.click();
       source.sendKeys("al");
       Thread.sleep(2000L);
       source.sendKeys(Keys.ARROW_DOWN);
       source.sendKeys(Keys.ENTER);
      // Thread.sleep(2000L);
       
       //checkbox button
       driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
      // Thread.sleep(2000L);
       
       driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
      // Thread.sleep(2000L);
       driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
       
       //window handle
       driver.findElement(By.xpath("//button[contains(text(),'Open Window')]")).click();
       Thread.sleep(2000L);
       System.out.println(driver.getTitle());
       Set<String>allwindo=driver.getWindowHandles();
      
            Iterator<String> it=allwindo.iterator();
            String parent=it.next();
            String child=it.next();
            driver.switchTo().window(child);
            System.out.println(driver.getTitle());
            driver.switchTo().window(parent);
            System.out.println(driver.getTitle());*/
            driver.findElement(By.id("opentab")).click();
            System.out.println(driver.getTitle());
            System.out.println(driver.getTitle());
            Set<String>allow=driver.getWindowHandles();
            Iterator<String> it=allow.iterator();
            String p=it.next();
            String c=it.next();
            driver.switchTo().window(c);
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).click();
            Thread.sleep(2000L);
            
            
            driver.switchTo().window(p);
            System.out.println(driver.getTitle());
            
            
           // driver.findElement(By.xpath("//a[contains(text(),'Courses')]")).click();
            
       
       
       
       
       
       
       
	}
}
