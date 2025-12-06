package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePickerReusableDD {

	WebDriver driver;
	public static void selectDate(WebDriver driver, String day, String month, String year) throws InterruptedException {
		
	    WebElement datePicker = driver.findElement(By.id("txtDate"));
	    new Actions(driver).moveToElement(datePicker);
	    
	    datePicker.click();

	    
	    	Select selYr=new Select(driver.findElement(By.className("ui-datepicker-year")));
	    	selYr.selectByValue(year);
	    	Select selMon=new Select(driver.findElement(By.className("ui-datepicker-month")));
	    	selMon.selectByVisibleText(month);
	    	
	    	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/*[text()='"+day+"']")).click();
	       Thread.sleep(5000);
	    
	}
	@Test
	public void date() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Call the utility method
		selectDate(driver, "25", "Nov", "2024");
	}
}
