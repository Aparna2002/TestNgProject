package TestngProject.com.scripts;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BwoserLaunch {
	public static String projectpath=System.getProperty("user.dir");
	
public static void main(String[] args) {
       
       WebDriver driver;
		
		  System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\chromedriver.exe");

           driver=new ChromeDriver();
           driver.get("https:\\www.walmart.com");
		  
		  
		  System.setProperty("webdriver.gecko.driver",projectpath+"\\drivers\\geckodriver.exe");
		  
		   driver=new FirefoxDriver(); 
		   driver.get("https:\\bestbuy.com");
		 
	}
	

}
