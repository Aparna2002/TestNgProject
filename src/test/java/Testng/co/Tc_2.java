package Testng.co;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest2;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class Tc_2 extends BaseTest2 {
	
	
  @Test
  public void functnality() {
	  driver.findElement(By.xpath("//span[@class='sp-name']")).click();
	  
	  
  }
  
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  
	  init();
	  launch("chromebrowser");
	  navigateurl("toursurl");
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  report.close();
	  driver.close();
  }

}
