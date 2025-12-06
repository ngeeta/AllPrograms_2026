package selenium;


import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frames {
	@Test
	public void getNoOfFrame() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));

		System.out.println("Length of Frame :: "+frames.size() );
		for(WebElement w:frames) {
			System.out.println(w.getAttribute("name")+ " :: Id "+w.getAttribute("id"));
		}
		
		driver.quit();
	}
}
