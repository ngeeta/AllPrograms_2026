package selenium;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableProgram {

	@Test
	public void dynamic() {
		WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List<WebElement> text=driver.findElements(By.xpath("//*[@class='display-values']/p"));
        System.out.println(text.get(0).getText());

        List<String> textVa=new ArrayList<String>();
        
        for(WebElement p:text) {
        	 String label = p.getText();
        	// String per=p.findElement(By.tagName("strong")).getText();
        		textVa.add(label);
        	}
        String ChromecpuLoad=driver.findElement(By.xpath("//*[@id='taskTable']/tbody/tr/td[text()='Chrome']/following-sibling::td[contains(text(),'%')]")).getText();
       String cpufinalTxt="CPU load of Chrome process: "+ChromecpuLoad;
        System.out.println("cpufinalTxt "+cpufinalTxt);
        for(String p:textVa) {
        if(p.equals(cpufinalTxt)) {
        	System.out.println("Match found");
        	break;
        }
        else {
        	System.out.println("No match found");
        }
        	}
       driver.quit();
	}
	//@Test
	public void dynamicTableEasy() {
		WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/dynamic-table");
        driver.manage().window().maximize();

        // Get CPU load value for Chrome from the table
        String chromeCpu = driver.findElement(By.xpath("//*[text()='Chrome']/following-sibling::td[contains(text(),'%')]")).getText();
       // String chromeCpu = driver.findElement(By.xpath("//div[@role='row' and .//span[text()='Chrome']]//span[contains(text(),'%')]")).getText();
        System.out.println("CPU from table: " + chromeCpu);

        // Get CPU load value from the yellow label
        String labelText = driver.findElement(By.id("chrome-cpu")).getText();
        // Example label: "Chrome CPU: 12%" :: divides into 2 parts [0]=Chrome CPU and 1= 12%
        String labelCpu = labelText.split(":")[1].trim();

        System.out.println("CPU from table: " + chromeCpu);
        System.out.println("CPU from label: " + labelCpu);

        // Compare both values
        if (chromeCpu.equals(labelCpu)) {
            System.out.println("✅ CPU values match!");
        } else {
            System.out.println("❌ CPU values do not match!");
        }

        driver.quit();

	}
	
	
	//@Test
	public void staticTableForBook() {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://testautomationpractice.blogspot.com/");
	        driver.manage().window().maximize();
	        List<WebElement> rows=driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr"));
	        for(int i=2;i<rows.size();i++) {
	        	String bookName=driver.findElement(By.xpath("//*[@name='BookTable']/tbody/tr["+i+"]/td[1]")).getText();
	        	if(bookName.contains("Learn")) {
	        		String price=driver.findElement(By.xpath("//*[@name='BookTable']/tbody/tr["+i+"]/td[4]")).getText();
	        		System.out.println("Book :"+bookName +"|"+price);
	        	}
	        	
	        }
	        driver.quit();
	    }

}
