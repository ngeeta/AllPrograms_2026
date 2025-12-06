package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DDOptions {

	@Test
	public void getDDOption() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement we=driver.findElement(By.id("dropdown-class-example"));
		Select sel=new Select(we);
		
		List<WebElement> actual=sel.getOptions();
		List<String> exp=new ArrayList<String>(Arrays.asList("Select","Option1","Option2","Option3"));
		List<String> actualList = new ArrayList<String>();
		for(WebElement s:actual) {
			actualList.add(s.getText());
		}
		
		System.out.println("Actual "+actualList);
		System.out.println("Expected "+exp);

		driver.quit();
	}
}
