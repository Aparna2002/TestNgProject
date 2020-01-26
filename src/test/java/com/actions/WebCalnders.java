package com.actions;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class WebCalnders extends BaseTest {
	
  @Test
 public void selectOption(String day, String month_year) throws InterruptedException {
	List<WebElement> completeClender = driver.findElements(By.xpath("//span[@class='rsdc-months']/span/span"));
	System.out.println(completeClender.size());
	
	for(int i=1;i < completeClender.size();i++) {
		System.out.println(completeClender.get(i).getText());
		if(completeClender.get(i).getText().equals(month_year)) {
			
			List<WebElement> days=driver.findElements(By.xpath("//div[@class='rsdc-months']/span["+(i+1)+"]/span"));
			for(WebElement d: days)

			{

				System.out.println(d.getText());

				if(d.getText().equals(day))

				{

					d.click();

					return;

				}
			}
			WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='rsdc-next rsdc-nav ui_icon single-chevron-right']"))));
		
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='rsdc-prev rsdc-nav ui_icon single-chevron-left']"))));
		
		Thread.sleep(3000);
		selectOption(day, month_year);
		}
		
	}


  
}


@BeforeMethod
  public void setUp() throws IOException, InterruptedException {
	  init();
	  launch("chromebrowser");
	  navigateurl("tripurl");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();

		driver.findElement(By.xpath("//div[@class='unified-picker citrus departure']")).click();
//check in day iteration
		String date="4-january2020";
		String Splitter[]=date.split("-");
		String checkInDay=Splitter[0];
		String cheackInMonth="Splitter[1]";
		selectOption(checkInDay,cheackInMonth);
		
//chckout day iteration
		String date1="8-january2020";
		String Splitters[]=date1.split("-");
		String checkoutDay = Splitters[0];
		String checkoutMonth=Splitters[1];
		selectOption(checkoutDay,checkoutMonth);
		
		
		
		
	//List<WebElement> completeClender = driver.findElement(By.xpath("//span[@class='rsdc-months']/span/span"));


  }

  



@AfterMethod
  public void endProcess() {
	 
  }

}
