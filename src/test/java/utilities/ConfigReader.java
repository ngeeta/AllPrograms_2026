package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigReader {
	private static Properties prop = new Properties();

	static {

		try {
			 FileInputStream fs=new FileInputStream("Configuration/endpoint.properties");
			//FileInputStream fs = new FileInputStream("Configuration/selenium.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// @Test
	public String get(String Key) {

		// System.out.println(prop.getProperty("baseURL"));
		return prop.getProperty(Key);
	}

	// @Test
	public void get() {
		System.out.println(
				"This Test method I have written to test whether baseURL is picking properly or not, also @Test wont work if method has parameter");
		System.out.println(prop.getProperty("baseURL"));
		// return prop.getProperty(Key);
	}
}
