package Testng.co;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class WebTables004 extends BaseTest{
  @Test
  public void tableManuplations() {
	  
	  //*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
	  //*[@id="leftcontainer"]/table/tbody/tr[2]/td[1]/a
	  //*[@id="leftcontainer"]/table/tbody/tr[4]/td[1]/a
	  
	  String beforeXpath = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
	  String afterXpath="]/td[1]/a";
	  List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
	 int rowCount = rows.size();
	 System.out.println("No of rows are in my table::"+rowCount);
	 System.out.println("rowvalues from my table");
	 for(int i=2;i<=rowCount;i++) {
		 String actualXpath = beforeXpath+ i +afterXpath; 
		 WebElement rowvalues = driver.findElement(By.xpath(actualXpath));
		      // String rownames = rowvalues.getText();
		       System.out.println(rowvalues.getText());
	 }
	 
		
		  //*[@id="leftcontainer"]/table/tbody/tr[1]/td[2]
		  //*[@id="leftcontainer"]/table/tbody/tr[2]/td[2]
		  //*[@id="leftcontainer"]/table/tbody/tr[1]/td[2]
		  
		  String afterXpathGroup="]/td[2]";
		  System.out.println("****Colume values on my table****"); 
		  for(int i=2; i<=rowCount;i++) {
			  WebElement groupList = driver.findElement(By.xpath(beforeXpath +i+ afterXpathGroup));
			  System.out.println(groupList.getText());
		  }
		 


      
    //*[@id="leftcontainer"]/table/tbody/tr[1]/td[3]
      
	
	 String afterXpathPrice = "]/td[3]";
	 System.out.println("*****price list in table*****");
	 for(int i=2;i<=rowCount;i++) {
		 WebElement priceList = driver.findElement(By.xpath(beforeXpath + i+ afterXpathPrice));
		 System.out.println(priceList);
	 }
	 
	 
	//*[@id="leftcontainer"]/table/tbody/tr[1]/td[4]
	 String afterXpathCurrentPrice = "]/td[4]";
	 System.out.println("Current Price List On My Table");
	 for(int i=2;i<=rowCount;i++) {
		 WebElement currentPriceList = driver.findElement(By.xpath(beforeXpath + i+ afterXpathCurrentPrice));
		 System.out.println(currentPriceList);
	 }
	 
	 
	 String afterXpathChange = "]/td[5]";
	 System.out.println("Percentage List On My Table");
	 for(int i=2;i<=rowCount;i++) {
		 WebElement percentageList = driver.findElement(By.xpath(beforeXpath + i+ afterXpathChange));
		 System.out.println(percentageList);
	 }
	 
	 
	 
	  
  }
  @BeforeMethod
  public void startUp() throws IOException {
	  
	  init();
	  launch("chromebrowser");
	  navigateurl("guruurl");
  }

  @AfterMethod
  public void tearDown() {
	  driver.close();
  }

}
