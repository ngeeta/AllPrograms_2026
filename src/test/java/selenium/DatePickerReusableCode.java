package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DatePickerReusableCode {

	WebDriver driver;
	public static void selectDate(WebDriver driver, String day, String month, String year) throws InterruptedException {
		
	    WebElement datePicker = driver.findElement(By.id("datepicker"));
	    new Actions(driver).moveToElement(datePicker);
	    datePicker.click();

	    // Loop until the correct year is displayed
	    while (true) {
	        String displayedYear = driver.findElement(By.className("ui-datepicker-year")).getText();
	        if (!displayedYear.equals(year)) {
	            driver.findElement(By.xpath("//a[@data-handler='prev']")).click(); // navigate back
	        } else {
	            break;
	        }
	    }

	    // Loop until the correct month is displayed
	    while (true) {
	        String displayedMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
	        if (!displayedMonth.equals(month)) {
	            driver.findElement(By.xpath("//a[@data-handler='prev']")).click(); // navigate back
	        } else {
	            break;
	        }
	    }

	    // Select the day
	    driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
	}
	@Test
	public void date() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Call the utility method
		selectDate(driver, "25", "November", "2024");
	}
}
