package com.mindtree.seleniumclass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ms3herokuapp {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//open window page
		driver.get("https://the-internet.herokuapp.com/");
		//step-1
		driver.findElement(By.xpath("//a[@href='/hovers']")).click();
		
		 System.out.println(driver.findElement(By.tagName("h5")).getText());
	    System.out.println(driver.findElement(By.xpath("//h5[contains(text(), 'name: user1')]")).getText());
	    
	    driver.navigate().back();
	    // STEP-2.checkbox
	    driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
	    driver.findElement(By.xpath("//input[contains(@type,'checkbox')][2]")).click();
	    Thread.sleep(2000L);
	    driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
	    driver.findElement(By.xpath("//input[contains(@type,'checkbox')][2]")).click();
	    
	    driver.navigate().back();
	    
	    //STEP-3 INPUT
	    driver.findElement(By.xpath("//a[@href='/inputs']")).click();
	    WebElement  source=driver.findElement(By.xpath("//input[@type='number']"));
	    source.click();
	    source.sendKeys("1234");
	    Thread.sleep(2000L);
	    driver.navigate().back();
		
	    //STEP-4 DROP
		driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
		 Select s=new Select(driver.findElement(By.id("dropdown")));
		 Thread.sleep(2000L);
		 s.selectByValue("2");
		 Thread.sleep(2000L);
		 
		 driver.navigate().back();
		
		 //STEP-5 UPLOAD
		driver.findElement(By.xpath("//a[@href='/upload']")).click();
		driver.findElement(By.id("file-submit")).click();
		System.out.println("'\bFile upload!\' ");
		 driver.navigate().back();
		 Thread.sleep(2000L);
		 
		 driver.navigate().back();
		 
		 //STEP-6
		driver.findElement(By.xpath("//a[contains(text(), 'Sortable Data Tables')]")).click();
		System.out.println(driver.findElement(By.xpath("//td[contains(text(), 'tconway@earthlink.net')]")).getText());
		System.out.println(driver.findElement(By.xpath("//td[contains(text(), 'http://www.timconway.com')]")).getText());
		driver.navigate().back();
		
		//STEP-7
		/*driver.findElement(By.xpath("//a[@href='/key_presses']")).click();
		Actions aa=new Actions(driver);
		WebElement mov=driver.findElement(By.id("target"));
		aa.moveToElement(mov).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		driver.navigate().back();*/
		
		
		
		//STEP-8
		
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		 Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
	       Thread.sleep(2000L);
	       
	       Set<String>allwindo=driver.getWindowHandles();
	      
	            Iterator<String> it=allwindo.iterator();
	            String parent=it.next();
	            String child=it.next();
	            driver.switchTo().window(child);
	            
	            System.out.println(driver.findElement(By.xpath("//h3[contains(text(), 'New Window')]")).getText());
	            Thread.sleep(2000L);
	            driver.switchTo().window(parent);
	            System.out.println(driver.getTitle());
	            
	            driver.navigate().back();
	            
	     //DTEP-9
		
		driver.findElement(By.xpath("//a[@href='/context_menu']")).click();
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.id("hot-spot"));
		a.moveToElement(move).contextClick().build().perform();
		driver.switchTo().alert().accept();
		
	            
		
		
		
		
		 
		
		
	    
	    
	    
	    
	    
	    
	    
	    
	            
	           

	}

}
