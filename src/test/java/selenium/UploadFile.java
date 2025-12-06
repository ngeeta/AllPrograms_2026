package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {

	
	@Test
	public void date() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String path="D:\\Edrive\\Study\\Geeta_Workspace\\com.PracticeAllProgram\\Configuration\\selenium.properties";
		driver.findElement(By.id("singleFileInput")).sendKeys(path);
		
	}

}
