package Listner.com;

import java.io.File;
import java.io.IOException;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import TestngProject.com.scripts.BaseTest;

public class MyListner extends BaseTest implements ITestListener  {

	public void onTestStart(ITestResult result) {
      
		Reporter.log("Test is started::"+result.getMethod().getMethodName());


	}

	public void onTestSuccess(ITestResult result) {

      if(result.isSuccess()) {
    	  try {
    	  TakesScreenshot srcFile =(TakesScreenshot) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	  FileHandler.copy((File) srcFile, new File(projectpath+"//success//screenshotFilename"));
      }
      catch(IOException e) {
    	  e.printStackTrace();
      }
      }
	}

	public void onTestFailure(ITestResult result) {

        if(!result.isSuccess()) {
        	try {
        		TakesScreenshot srcFile=(TakesScreenshot) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	
				FileHandler.copy((File) srcFile, new File(projectpath+"//failure//screenshotFilename"));
        	}
        	catch(IOException e) {
        		e.printStackTrace();
        	}
        }

	}

	public void onTestSkipped(ITestResult result) {
        
		Reporter.log("test is skipped::"+result.getMethod().getMethodName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
