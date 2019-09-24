package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListenerclass implements ITestListener
{
   WebDriver driver;
	public void onTestStart(ITestResult result) {
		
		
	}

	public void onTestSuccess(ITestResult result) {
		
	
		
	}

	public void onTestFailure(ITestResult result) {
		ExtentReports extent; //ExtentsRepots is the class by using this class we set the path whrere our report needs to generate 
	    ExtentTest extentTest = null;
	    String screenshotpath = null;
		Calendar cal=new GregorianCalendar();
		int month=cal.get(Calendar.MONTH);
		int year=cal.get(Calendar.YEAR);
		int sec=cal.get(Calendar.SECOND);
		int min=cal.get(Calendar.MINUTE);
		int date=cal.get(Calendar.DATE);
		int day=cal.get(Calendar.HOUR_OF_DAY);
		
			if(result.getStatus()==ITestResult.FAILURE)
			{
				extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
				extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
				extent = new ExtentReports("C:\\Users\\RAVI-PC\\workspace\\automationtestingproject\\test-output\\extentreport\\reprt.html");
				try
				{
				TakesScreenshot shot=(TakesScreenshot)driver;
				File src = shot.getScreenshotAs(OutputType.FILE);
			     screenshotpath="./screenimage/"+year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_"+sec+".png";
				
					FileUtils.copyFile(src, new File(screenshotpath));

					System.out.println("screenshot taken");
				} 
				catch (IOException e) 
				{
					
					e.printStackTrace();
				}

				extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(screenshotpath));//to add screenshot in extent report
				extent.flush();
				extent.close();
			}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
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
