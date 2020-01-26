package Testng.co;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class WebTable002 extends BaseTest {
  @Test
  public void actionOnTable() throws InterruptedException {
	  
	 // List<WebElement>  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
	  List<WebElement> col =driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		  System.out.println("Table totl size::"+col.size()); 
		  
		  int row_num,col_num ; 
		  
		  row_num=1;
		  col_num=1; 
		  //i want to iterate one by one
		  
		  for(WebElement tr_ele:col) {
		  
		  List<WebElement> td_ele = tr_ele.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
		  
		  for(WebElement ele : td_ele) { 
			  
		  System.out.println("ROW #"+ row_num +"COL #" +col_num +"TextName::"+ ((WebElement) td_ele).getText()); 
		  col_num++;
		  }
		  Thread.sleep(4000); 
		  row_num++;  
  }
  
		 
}

  
  @BeforeMethod
  public void startUp() throws IOException {
	  init();
	  launch("chromebrowser");
	  navigateurl("guruurl");
	  
  }

  @AfterMethod
  public void endProcess() {
	  driver.close();
  }

}
