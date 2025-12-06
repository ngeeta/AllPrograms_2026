package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import restAssured.RABaseClass;

public class ReportsListeners extends RABaseClass implements ITestListener,IRetryAnalyzer{

	
	//----------------------------------------------------//
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("----onStart-----");
		extentSparkReporter =new ExtentSparkReporter(reportPath);
		extentReports=new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		extentSparkReporter.config().setDocumentTitle("Title:: Rest Assured");
		extentSparkReporter.config().setTheme(Theme.STANDARD);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		extentTest=extentReports.createTest(result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, MarkupHelper.createLabel("Test is passed :: "+result.getName(), ExtentColor.GREEN));
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on failure");
		extentTest.log(Status.FAIL, MarkupHelper.createLabel("Test is Failed & screentShot is attached :: "+result.getName(), ExtentColor.RED));

		WebDriver driver=new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(screenShotPath));
		} catch (Exception e) {
			System.out.println("Screen Shot not found");
		}
		extentTest.addScreenCaptureFromPath(screenShotPath);
	}
	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

	//----------------------------------------------------//
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}

}
