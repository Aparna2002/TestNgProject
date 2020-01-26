package TestngProject.com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test_004 {
	
  

@Test(priority=1)
  public void f() {
	  System.out.println("f Test method executed");
  }
@Test(priority=0)
public void g() {
	  System.out.println("g Test method executed");
	  throw new SkipException("skip this method ");
}
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod  executed");
  }

  @AfterMethod(enabled=false)
  public void afterMethod() {
	  System.out.println("After method executed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AfterSuite executed");
  }

}
