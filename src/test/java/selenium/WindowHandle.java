package selenium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandle {
	//@Test
	public void getCurrentWindow() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Parent window :"+driver.getTitle());
		String parentWindow=driver.getWindowHandle();
		//driver.findElement(By.id("opentab")).click();
		driver.findElement(By.id("openwindow")).click();


		Set<String> allWindowHandles=driver.getWindowHandles();
		for(String a:allWindowHandles) {
			 driver.switchTo().window(a);
			//if(a.equalsIgnoreCase(parentWindow))
			System.out.println("Open Window :: "+driver.getTitle());

		}
		 driver.switchTo().window(parentWindow);
		 driver.findElement(By.id("opentab")).click();
		 String tabWindow=driver.getWindowHandle();
		 driver.switchTo().window(tabWindow);
		 System.out.println("opentab :"+driver.getTitle());
	driver.quit();
	}
	
	@Test
	public void MultipleWindow() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Step 2: Open 3 more tabs (total 4)
	        js.executeScript("window.open('https://www.google.com','_blank');");
	        js.executeScript("window.open('https://www.bing.com','_blank');");
	        js.executeScript("window.open('https://www.yahoo.com','_blank');");

	        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        
	        driver.switchTo().window(tabs.get(3));
	        System.out.println("Current Tab Title: " + driver.getTitle());

	        for(String s:tabs) {
	        	 driver.switchTo().window(s);
	        	 if(driver.getTitle().equals("Google")) {
	     		System.out.println("Window Title :"+driver.getTitle());
	        	 }
	        }

		driver.quit();
	}
}
