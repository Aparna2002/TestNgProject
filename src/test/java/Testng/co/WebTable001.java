package Testng.co;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class WebTable001 extends BaseTest {
	
  @Test
  public void tableManuplations() throws InterruptedException {
	  
		
	  
	        
      //No.of Columns
      List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
      System.out.println("No of cols are : " +col.size()); 
      //No.of rows 
      List  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
      System.out.println("No of rows are : " + rows.size());
    
	
  }
  
  @BeforeMethod
  public void setUp() throws IOException {
	  init();
	  launch("chromebrowser");
	  navigateurl("guruurl");
	  
	  
	  
  }

  @AfterMethod
  public void endProcess() {
	  driver.close();
  }

}
