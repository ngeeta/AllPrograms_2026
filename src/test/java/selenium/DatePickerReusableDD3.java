package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePickerReusableDD3 {

	public void test() {
	WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	    WebElement datePicker = driver.findElement(By.id("start-date"));
	    new Actions(driver).moveToElement(datePicker);
	    
	    datePicker.click();

	  //Code not completed
	}
}
