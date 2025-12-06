package selenium;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	@Test
	public void usingKeyBoardAction() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Actions act = new Actions(driver);
		// Locate the textbox (example: the "name" input field)
		WebElement permanentAddressBox = driver.findElement(By.id("permanentAddress"));
		WebElement currentAddressBox = driver.findElement(By.id("currentAddress"));
new Actions(driver).moveToElement(currentAddressBox);
		// Scroll until the textbox is in view
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", currentAddressBox);
		currentAddressBox.sendKeys("Hello Selenium!");

		act.keyDown(Keys.CONTROL).sendKeys("a");
		act.keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c");
		act.keyUp(Keys.CONTROL).perform();

		act.keyDown(Keys.TAB).perform();
		js.executeScript("arguments[0].scrollIntoView(true);", permanentAddressBox);

		act.keyDown(Keys.CONTROL).sendKeys("v");
		act.keyUp(Keys.CONTROL).perform();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("currentAddress")));

		Thread.sleep(5000);

		driver.quit();
	}
}