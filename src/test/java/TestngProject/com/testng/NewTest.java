package TestngProject.com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("actual function there in the test annotation");
  }
  
  @Test(priority=2)
  public void g() {
	  System.out.println("actual function there in the test annotation");
	  throw new SkipException("skip the g function");
  }
  
  @Test(priority = 1, enabled= false)
  public void s() {
	  System.out.println("actual function there in the test annotation");
	  throw new SkipException("skip the method......");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("prerequisits will be there");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("closing the fuctionality");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("preequisites");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("closing function");
  }

}
