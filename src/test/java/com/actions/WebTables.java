package com.actions;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class WebTables extends BaseTest {
	
  @Test
  public void dynamicTables() {
	  
	  List<WebElement> tr_collection=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
	 int row_num,col_num;
	 row_num=1;
	 for(WebElement trElement : tr_collection) {
		 
		List<WebElement> td_collection=trElement.findElements(By.id("td"));
		 	
		 
		 col_num=1;
		 for(WebElement tdcollection : td_collection) {
			 System.out.println("ROW #" +row_num+ ", COL # "+col_num+tdcollection.getText());
			col_num++;
		 }
		 row_num++;
	 }
	  
  }
  
  @BeforeMethod
  public void setUp() throws IOException {
	  init();
	  launch("chromebrowser");
	  navigateurl("w3school");
	  
	  
  }
  

  @AfterMethod
  public void endPocess() {
  }

}
