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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImage {

	@Test
	public void brokenImage() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/broken_images");
		 driver.manage().window().maximize();
		 List<WebElement> brokenImages=driver.findElements(By.xpath("//div[@class='example']/img"));
		 System.out.println("Total images found: " + brokenImages.size());
		 
		 for(WebElement x:brokenImages) {
			 String imgUrl = x.getAttribute("src");
			 try {
				HttpURLConnection con= (HttpURLConnection) new URL(imgUrl).openConnection();
				 int responseCode=con.getResponseCode();

				if (responseCode >= 400) {
                    System.out.println("❌ Broken Image: " + imgUrl + " | Status: " + responseCode);
                } else {
                    System.out.println("✅ Valid Image: " + imgUrl + " | Status: " + responseCode);
                }

			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		 }driver.quit();
	}
	
	@Test
	public void brokenLink() throws MalformedURLException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> we=driver.findElements(By.tagName("a"));
		System.out.println("Total links "+we.size());
		
		for(WebElement link:we) {
			String url=link.getAttribute("href");
			if(url==null || !(url.startsWith("http://") || url.startsWith("https://"))){

				continue;
			}
			
			HttpURLConnection con=(HttpURLConnection) new URL(url).openConnection();
			 con.setConnectTimeout(5000);
             con.connect();
			int resCode=con.getResponseCode();
			if(resCode>=400) {
				System.out.println("Broken "+url +" | "+resCode);
			}
			else {
				System.out.println("Not Broken "+url +" | "+resCode);
			}

		}
		
		
		driver.quit();
	}
}
