package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ShadowDomExample {
	WebDriver driver = new ChromeDriver();
	 @Test
	    public void shadowDom1() {
	        driver.get("https://testautomationpractice.blogspot.com/");
	        WebElement we=driver.findElement(By.id("shadow_host"));//before show root open
	        SearchContext shadowRoot1 = we.getShadowRoot();
	        WebElement shadowHost11=shadowRoot1.findElement(By.id("shadow_content"));//before show root open     
System.out.println("elementInsideShadow 2 :: "+shadowHost11.getText());

WebElement nest=shadowRoot1.findElement(By.id("nested_shadow_host"));

SearchContext shadowRoot11 = nest.getShadowRoot();
WebElement v =shadowRoot11.findElement(By.tagName("a"));
String value=v.getAttribute("href");
 

System.out.println("value 2 :: "+value);



driver.quit();
 
	 }
	 
   // @Test
    public void shadowDom() {
        // Navigate to practice site
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/shadow-dom.html"); // Example page with Shadow DOM
        // Shadow host element
        WebElement shadowHost = driver.findElement(By.id("content"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();


     // 3. Locate elements within the Shadow Root using the shadowRoot object
        WebElement elementInsideShadow = shadowRoot.findElement(By.cssSelector("p"));

        // 4. Perform actions or assertions on the element
        String actualText = elementInsideShadow.getText();
        Assert.assertEquals(actualText, "Hello from the Shadow DOM!");
        System.out.println(actualText);
        driver.quit();
    }

    
}
