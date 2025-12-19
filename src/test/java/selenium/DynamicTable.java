package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	@Test
	public void dynamicCPU() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 String chromeCpuLoad=driver.findElement(By.xpath("//*[@class='chrome-cpu']")).getText();
		 System.out.println(chromeCpuLoad);
		 //List<WebElement> dynamicTable=driver.findElements(By.xpath("//tbody[@id='rows']/tr"));
		// new Actions(driver).moveToElement(dynamicTable);
		// for(WebElement we:dynamicTable) {
			 String web=driver.findElement(By.xpath("//*[@id='taskTable']/tbody/tr/td[contains(text(),'Chrome')]/following-sibling::td[contains(text(),'%')]")).getText();
			 
			 System.out.println("chromeCpuLoad : "+chromeCpuLoad +" | "+web);
Assert.assertEquals(chromeCpuLoad, web);
driver.quit();
		 }
		 
	
}
