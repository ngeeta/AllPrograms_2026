package selenium;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilities.ConfigReader;

public class BaseClass {
public ConfigReader conf=new ConfigReader();
public WebDriver driver;
public String browser;
public static ExtentSparkReporter extentSparkReporter;
public static ExtentTest extentTest;
public static ExtentReports extentReports;

public String reportPath=System.getProperty("user.dir")+"/reports/RestAssured/selenium.html";
public String screenShotPath=System.getProperty("user.dir")+"/reports/screenShot/screenShot.png";

}
