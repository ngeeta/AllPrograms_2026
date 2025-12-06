package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

import freemarker.core.JavaScriptCFormat;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blog_2 {
	WebDriver driver;
		
	@Test
	public void checkSortedList() {
					 driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			WebElement animals=wait.until(ExpectedConditions.elementToBeClickable(By.id("animals")));

			new Actions(driver).moveToElement(animals).perform();
Select sel=new Select(wait.until(ExpectedConditions.elementToBeClickable(By.id("animals"))));
			
			List<WebElement> animalsList=sel.getOptions();
			List<String> animalsListAct=new ArrayList<String>();
			for(WebElement we:animalsList) {
				animalsListAct.add(we.getText());
							}
			List<String> sortedList=new ArrayList<String>(animalsListAct);
			Collections.sort(sortedList);
			Assert.assertEquals(animalsListAct, sortedList);
			System.out.println("animalsListAct :: "+animalsListAct);
			System.out.println("sortedList :: "+sortedList);
		
			
			driver.quit();
			
	}
	
	@Test
	public void datePicker() throws InterruptedException {
		 driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		// Navigate to year 1988
		while (true) {
		    WebElement yearElement = driver.findElement(By.className("ui-datepicker-year"));
		    int year = Integer.parseInt(yearElement.getText());
		    if (year > 1988) {
		        driver.findElement(By.xpath("//a[@data-handler='prev']")).click(); // go back
		    } else if (year < 1988) {
		        driver.findElement(By.xpath("//a[@data-handler='next']")).click(); // go forward
		    } else {
		        break;
		    }
		}

		// Navigate to November
		while (true) {
		    WebElement monthElement = driver.findElement(By.className("ui-datepicker-month"));
		    String month = monthElement.getText();
		    if (!month.equals("November")) {
		        driver.findElement(By.xpath("//a[@data-handler='prev']")).click();
		    } else {
		        break;
		    }
		}

		// Select day 25
		driver.findElement(By.xpath("//a[text()='25']")).click();
		
		Thread.sleep(2000);

	}
	
	
	
}
