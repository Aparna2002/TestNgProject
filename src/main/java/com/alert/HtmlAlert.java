package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlAlert {
	public static WebDriver driver;
	//public static String projectpath=System.getProperty("user.dir");

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\GOPALAKRISHNA\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
	  
			  driver=new ChromeDriver();
       driver.get("http://demo.guru99.com/test/delete_customer.php");
       driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("aparna");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       driver.switchTo().alert().accept();
       driver.switchTo().alert().accept();
       driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("aparna");
       driver.findElement(By.xpath("//input[@name='res']")).click();
       driver.switchTo().alert().accept();
       
	}

}
