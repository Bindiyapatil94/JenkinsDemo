package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.service.ExtentTestManager;

public class ExtentITestListenerAdapter implements ITestListener {

	public void onTestStart(ITestResult result) {
        ExtentTestManager.createMethod(result);
	}

	public void onTestSuccess(ITestResult result) {
        ExtentTestManager.log(result);

	}

	public void onTestFailure(ITestResult result) {
		ExtentTestManager.log(result);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
        ExtentService.getInstance().setAnalysisStrategy(AnalysisStrategy.TEST);
		
	}

	public void onFinish(ITestContext context) {
		ExtentService.getInstance().flush();
		
	}
	 

}
