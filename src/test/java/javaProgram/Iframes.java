package javaProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframes {

	
	
	public class TableProgram {

		@Test
		public void dynamic() {
			WebDriver driver = new ChromeDriver();
	        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");
	        driver.manage().window().maximize();
	     List<WebElement> we= driver.findElements(By.tagName("iframe"));
	       System.out.println(we.size()); 
//First switch to the outer iframe (iframeResult)
	     driver.switchTo().frame("iframeResult");
   System.out.println(driver.findElement(By.xpath("/html/body/h2")).getText());
	    // driver.switchTo().frame(0);
	     String src=driver.findElement(By.tagName("iframe")).getAttribute("src");
	     System.out.println(src);

	     driver.quit();
		}
		}
}
