package com.actions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class MouseOperations {
	WebDriver driver;
	Actions a;

  @BeforeMethod
  public void initializingDrivers() {
	  System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOPALAKRISHNA\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
	  
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
  }
  @Test (priority =0,enabled = false)
	public void MoveToelement() throws InterruptedException
	{	
		//moveToElement(WebElement target)
		
		driver.get("https://www.snapdeal.com");
		
		
		a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"))).perform();
		driver.findElement(By.xpath(" //span[@class='accountBtn btn rippleWhite']")).click();
		Thread.sleep(3000);
		/*
		 * a=new Actions(driver); a.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/span[1]"))).perform(
		 * ); driver.findElement(By.xpath(
		 * "//*[@id='sdHeader']/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[1]/ul/li[1]/a"
		 * )).click(); Thread.sleep(3000);
		 */
	}
  @Test(priority = 1,enabled = false)
  public void dragAndDrop() {
	  driver.get("http://jqueryui.com/droppable/");
	  a=new Actions(driver);
	  driver.switchTo().frame(0);
	  WebElement drag = driver.findElement(By.xpath(" //div[@id='draggable']"));
	  WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	  a.dragAndDrop(drag, drop).build().perform();
	  
  }
  @Test
  public void resizeMethod() throws InterruptedException {
	/*
	 * driver.get("http://jqueryui.com/resizable/"); a=new Actions(driver);
	 * driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	 * WebElement
	 * drag=driver.findElement(By.xpath("//div[@id='resizable']/div[3]")); //
	 * a.moveToElement(drag, 100, 200).perform();
	 * a.clickAndHold(drag).moveByOffset(100, 200).release(drag).build().perform();
	 * Thread.sleep(4000); }
	 */
	  driver.get("http://jqueryui.com/resizable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement drag = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		a = new Actions(driver);
		System.out.println("element will be located");
	
		a.moveToElement(drag, 100, 200).perform();
		Thread.sleep(3000);
  }
  

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
  }

}
