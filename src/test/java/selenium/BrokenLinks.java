package selenium;

import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
   // @Test
    public void getallbrokenLink() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        
        List<WebElement> urls = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + urls.size());
        
        for (WebElement s : urls) {
            String url = s.getAttribute("href");
            System.out.println(url);
            
            // Skip null or non-http(s) links
            if (url == null || !(url.startsWith("http://") || url.startsWith("https://"))) {
                continue;
            }
            
            try {
                // Open URL connection
                HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
                con.setConnectTimeout(5000);
                con.connect();
                
                int code = con.getResponseCode();
                if (code >= 400) {
                    System.out.println(url + " --> Broken (Response Code: " + code + ")");
                } else {
                    System.out.println(url + " --> Valid (Response Code: " + code + ")");
                }
            } catch (Exception e) {
                System.out.println(url + " --> Exception: " + e.getMessage());
            }
        }
        
        driver.quit();
    }
    
  
        @Test
        public void OneBrokenLink() throws IOException {
        	
        	WebDriver driver=new ChromeDriver();
    		//driver.get("http://www.deadlinkcity.com/error-page.asp?e=410");
    		HttpURLConnection conn=(HttpURLConnection) new URL("http://www.deadlinkcity.com/error-page.asp?e=410").openConnection();
    		System.out.println("Conncetion :: "+conn.getResponseCode());
    		driver.quit();
        }
        
}