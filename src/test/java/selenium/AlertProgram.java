package selenium;


import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertProgram {
	@Test
	public void getSingleWindow() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Geeta");
		driver.findElement(By.id("alertbtn")).click();
		Alert a=driver.switchTo().alert();
		String expected="Hello geeta, share this practice page and share your knowledge";

		String actual=a.getText();
		
		System.out.println(expected);
		System.out.println(actual);


		
		driver.quit();
	}
}
