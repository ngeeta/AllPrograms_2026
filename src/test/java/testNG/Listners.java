package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements IRetryAnalyzer,ISuiteListener,ITestListener{

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}

}
