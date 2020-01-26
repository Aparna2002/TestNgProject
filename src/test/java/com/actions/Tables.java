package com.actions;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Tables extends BaseTest {
  @Test
  public void actionOnTable() {
	  
	//Checks for Table row Count

			List<WebElement> tr_collection=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

			System.out.println("NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());

		

			

			int row_num,col_num;

	        row_num=1;

	        for(WebElement trElement : tr_collection)

	        {

	            List<WebElement> td_collection=trElement.findElements(By.xpath("td"));

	            //System.out.println("NUMBER OF COLUMNS="+row_num+" "+td_collection.size());

	            col_num=1;

	            for(WebElement tdElement : td_collection)

	            {

	               

	            	System.out.println("Row # "+row_num+", Col # "+col_num  + ", Text=" +tdElement.getText());
	                                   //	Row # 2, Col # 1, Text=Alfreds Futterkiste
	                col_num++;

	            }

	            row_num++;

	        }

	       // Thread.sleep(4000);

		}
  
  @BeforeMethod
  public void startProcess() throws IOException {
	  init();
	  launch("chromebrowser");
	  navigateurl("w3school");
	  
  }

  
  @AfterMethod
  public void endProcess() {
  }

}
