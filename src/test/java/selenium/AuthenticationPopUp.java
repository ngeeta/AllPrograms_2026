package selenium;


import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AuthenticationPopUp {
	@Test
	public void authPopUpUsingURL() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[contains(text(),'Basic Auth')]")).click();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");

		
		driver.quit();
	}
	
	@Test
	public void authPopUpUsingRobotClass() throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//*[contains(text(),'Basic Auth')]")).click();
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
	Robot robot = new Robot();
	//typeText(robot, "admin");

	robot.keyPress(KeyEvent.VK_A); // type username
	robot.keyRelease(KeyEvent.VK_U);
	robot.keyPress(KeyEvent.VK_TAB); // move to password field
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_P); // type password
	robot.keyRelease(KeyEvent.VK_P);
	robot.keyPress(KeyEvent.VK_ENTER); // submit
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	}
	private static void typeText(Robot robot, String text) throws InterruptedException {
	    for (char c : text.toCharArray()) {
	        // Convert to uppercase because VK_A..VK_Z are uppercase constants
	        char upperChar = Character.toUpperCase(c);
	        int keyCode = KeyEvent.getExtendedKeyCodeForChar(upperChar);

	        if (KeyEvent.VK_UNDEFINED == keyCode) {
	            throw new IllegalArgumentException("Cannot type character: " + c);
	        }

	        robot.keyPress(keyCode);
	        robot.keyRelease(keyCode);
	        Thread.sleep(200); // small delay
	    }
	}

}
