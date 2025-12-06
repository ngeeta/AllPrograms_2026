package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public class WindowSize {
	@Test
	public void manageSize() {
		Dimension dimension = new Dimension(768, 768); // width, height

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().setSize(dimension);

		driver.quit();
	}
}

