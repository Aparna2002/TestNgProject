package TestngProject.com.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest;

public class Test_003 extends BaseTest {
	public static WebDriver driver;
	
  @Test
  public void actuallogic() {
	  WebElement loc = driver.findElement(By.xpath("//input[@id='global-search-input']"));
	  loc.sendKeys("books");
		/*
		 * driver.findElement(By.
		 * xpath("//button[@id='global-search-submit']//span[@class='g_a g_f']")).click(
		 * ); System.out.println("functions are doing operations.....");
		 */
  }
  @BeforeMethod
  @Parameters("browser")
  public static void prerequisites() throws IOException {
		/*
		 * WebDriver driver;
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\GOPALAKRISHNA\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe"
		 * );
		 * 
		 * driver=new ChromeDriver();
		 * 
		 * driver.get("https:\\www.walmart.com");
		 * System.out.println("chrome browser launched......");
		 */
	  init();
	  
	  launch("chromebrowser");
	  navigateurl("bestbuyurl");
  }
  @AfterMethod
  public static void finaltouch() {
	  
	  driver.quit();
	  System.out.println("everthing finally closed");
  }
}
