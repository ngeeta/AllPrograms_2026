package selenium;

import org.testng.annotations.Test;

import freemarker.core.JavaScriptCFormat;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blog_1 {
	WebDriver driver;
	//@Test
	public void implicitWait() {
		
			//WebDriver driver=new ChromeDriver();
		//	driver.get("http://www.deadlinkcity.com/error-page.asp?e=410");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test
	public void explicitWait() {
		
			 driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			WebElement name=wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
			jse.executeScript("arguments[0].scrollIntoView(true);",name );

			name.sendKeys("Geet Borkar HCL");
			
			WebElement email=wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
			jse.executeScript("arguments[0].scrollIntoView(true);",email );

			email.sendKeys("nandanwargeet@hcl.com");

			WebElement phone=wait.until(ExpectedConditions.elementToBeClickable(By.id("phone")));
			jse.executeScript("arguments[0].scrollIntoView(true);",phone );

			phone.sendKeys("8776656567");
			
			WebElement add=wait.until(ExpectedConditions.elementToBeClickable(By.id("textarea")));
			jse.executeScript("arguments[0].scrollIntoView(true);",add );

			add.sendKeys("nagpur");
			
			WebElement female=wait.until(ExpectedConditions.elementToBeClickable(By.id("female")));
			jse.executeScript("arguments[0].scrollIntoView(true);",female );

			female.click();
			
			WebElement thursday=wait.until(ExpectedConditions.elementToBeClickable(By.id("thursday")));
			jse.executeScript("arguments[0].scrollIntoView(true);",thursday );

			thursday.click();
			
			WebElement country=wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
			jse.executeScript("arguments[0].scrollIntoView(true);",country );

			Select co=new Select(country);
			co.selectByVisibleText("India");
			
			WebElement colors=wait.until(ExpectedConditions.elementToBeClickable(By.id("colors")));
			jse.executeScript("arguments[0].scrollIntoView(true);",colors );

			Select color=new Select(colors);
			color.selectByValue("blue");
			color.selectByIndex(0);
			
			List<WebElement> selOpt=color.getAllSelectedOptions();
			for(WebElement we:selOpt) {
				System.out.println(we.getText());
			}

			
			
			
			
			implicitWait();
			driver.quit();
			
	}
}
