package restAssured;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

public class RABaseClass {
	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentTest extentTest;
	public static ExtentReports extentReports;

	public String reportPath=System.getProperty("user.dir")+"/reports/RestAssured/ra.html";
	public String screenShotPath=System.getProperty("user.dir")+"/reports/screenShot/screenShot.png";
	static RequestSpecification req;
	static Response res;
	
	ConfigReader conf=new ConfigReader();
}
