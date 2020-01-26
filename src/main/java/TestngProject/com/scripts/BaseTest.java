package TestngProject.com.scripts;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class BaseTest {
	
	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	public static Properties prop;
	
	public static ExtentReports report= ExtentManager.getInstance();
	public static ExtentTest test;
	public static String screenshotFilename=null;
	
	/*
	 * public static ExtentReports report= ExtentManager.getInstance(); public
	 * static ExtentTest test;
	 */
	
	static 
	{
		Date dt=new Date();
		screenshotFilename=dt.toString().replace(':', '_')+".png";
	}
	
	public static void init() throws IOException 
	{
    	   FileInputStream fis=new FileInputStream(projectpath+"\\data.properties");
    	   prop=new Properties();
    	   prop.load(fis);
    	   
	 PropertyConfigurator.configure(projectpath+"\\log4j.properties");


	}
	public static void launch(String browser) 
	{
		if(prop.getProperty(browser).equals("chrome"))
		{

			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\GOPALAKRISHNA\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		  
				  driver=new ChromeDriver();
		}
		else if(prop.getProperty(browser).equals("gecko"))
		{
			System.getProperty("wedriver.chrome.driver",
                        "C:\\Users\\GOPALAKRISHNA\\Desktop\\Selenium Jars\\geckodriver-v0.26.0-win64\\geckodriver.exe" );
			driver=new FirefoxDriver();
			System.out.println("chromebrowser");
		}
	}
                 
	public static void navigateurl(String url) 
	{

      // driver.get(prop.getProperty(url));
       driver.navigate().to(prop.getProperty(url));
	}
	public static void waitforElement(WebElement locator,int seconds) 
	{
		WebDriverWait wait=new WebDriverWait(driver, seconds);
		
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}


}
