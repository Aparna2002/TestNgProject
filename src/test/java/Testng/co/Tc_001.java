package Testng.co;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Tc_001 extends BaseTest2 {
	
	
  @Test
  public void functnality() {
	  
	  driver.findElement(By.id("header-account-menu")).click();
	  
	  
  }
  
  @BeforeTest
  public void beforeMethod() throws IOException {
	  
	  init();
	  launch("chromebrowser");
	  navigateurl("toursurl");
	  
  }
  

  @AfterTest
  public void afterMethod() {
	  report.close();
	  driver.close();
  }

}
