package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import selenium.BaseClass;

public class ISuiteListeners extends BaseClass  implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		browser=conf.get("browser");
		if(browser.equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
		}
		/*else if (condition) {
			
		}else if (condition) {
			
		}*/
		else {
			System.out.println("Browser Not Found");
		}
		
		driver.manage().window().maximize();
		driver.get(conf.get("RahulShetty"));
		
	}
	@Override
	public void onFinish(ISuite suite) {
		driver.quit();
	}
	//----------------------------------------------------//
	
}
