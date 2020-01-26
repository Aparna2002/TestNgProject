package com.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCalenderActions {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");

         driver=new ChromeDriver();
         driver.get("https://www.tripadvisor.in/");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
         
         driver.findElement(By.xpath("//div[@class='unified-picker citrus departure']")).click();
 		
         Thread.sleep(3000);
        //checkin flight  
         String date="4-january2020";
        String splitter[]= date.split("-");
        String checkInDay= splitter[0];
        String checkInMonth= splitter[1];
        selectOption(checkInDay,checkInMonth);
         
        //checkout flight
        String date1="8-januart2020";
           String split1[]=date1.split("-");
           String checkoutDay = split1[0];
           String checkoutMonth=  split1[1];
           selectOption(checkoutDay, checkoutMonth);
	}

	public static void selectOption(String day, String month) {
        List<WebElement> calenderElements = driver.findElements(By.xpath("//div[contains(@class,'rsdc-months')]/span/span"));
        System.out.println(calenderElements.size());
        for(int i=1; i<calenderElements.size(); i++) {
        	System.out.println(calenderElements.get(i).getText());
        	if(calenderElements.get(i).getText().equals(month)) {
        		List<WebElement> days = driver.findElements(By.xpath("//span[contains(@class,'rsdc-month')]/span[+i+1+]/span"));
        	
        		for(WebElement d: days) {
        			d.getText();
        			
        		}
        	
        	}
        	
        	
        }
		

	}

}
