package Testng.co;

import org.testng.annotations.Test;

import TestngProject.com.scripts.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class WebTable003 extends BaseTest {
  @Test
  public void functions() throws ParseException {
	  
	  String max;
	  double m;
	 double r = 0;
	 // WebElement myTable = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/td"));
	    List<WebElement> col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
	  System.out.println("no of columes in my table::"+col.size());
	      List<WebElement> rows = driver.findElements(By.xpath (".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Total No of rows are : " + rows.size());
        for(int i=0; i<rows.size();i++) {
        	if(rows.get(i).getText().equals("Kwality")) {
        		System.out.println(col.get(2).getText());
        		
        		NumberFormat rupee = NumberFormat.getInstance();
        		Number num = rupee.parse("max");
        		max=num.toString();
        		m=Double.parseDouble(max);
        		if(m>r) {
        			m=r;
        			
        		}
        		
        		
        	}
        	 System.out.println("Maximum current price is : "+ r);
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
