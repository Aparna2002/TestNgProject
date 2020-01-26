package TestngProject.com.scripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;


public class Test1 extends BaseTest{
	
    private static final Logger log=Logger.getLogger(Test1.class.getName());
    
	public static void main(String[] args) throws IOException 
	{
		test=report.startTest("Test1");
		
		init();
		log.info("Initializing the properties.......");
		test.log(LogStatus.PASS, "Initilizing properties files......" );
		
		launch("chromebrowser");
		
		log.info("launch the browser"+prop.getProperty("chromebrowser"));
		test.log(LogStatus.PASS, "launch chrome browser......"+prop.getProperty("chromebrowser"));
		
		navigateurl("toursurl");
		log.info("navigate url...."+prop.getProperty("toursurl"));
		test.log(LogStatus.PASS, "launch chrome browser......"+prop.getProperty("toursurl"));
		
		/*
		 * WebElement
		 * element=driver.findElement(By.xpath("//*[@id='header-account-menu']"));
		 * element.click();
		 * driver.findElement(By.xpath("//a[@id='account-register']")).click();
		 */

		driver.findElement(By.xpath("//span[@class='sp-name']")).click();
		log.info("choosing the selected option");
		test.log(LogStatus.PASS, "choose options on web browser");
		
		driver.findElement(By.xpath("//a[contains(text(),'List your property')]")).click();
        log.info("perform click operation");
        test.log(LogStatus.PASS, "perform click operations..");
	

	}
	
}
