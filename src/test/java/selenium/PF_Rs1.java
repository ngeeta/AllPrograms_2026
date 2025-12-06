package selenium;

import java.nio.channels.SelectableChannel;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PF_Rs1 extends BaseClass {

	public PF_Rs1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@value='radio2']")
	WebElement radio2;
	public void clickRadio() {
		radio2.click();
	}
	
	@FindBy(id="autocomplete") WebElement suggBox;
	@FindBy(xpath="//*[@id='ui-id-1']/li") List<WebElement> dd;
	public void enterInSuggBox(String country) {
		suggBox.clear();
		suggBox.sendKeys("India");
	}

	public List<WebElement> getddOpt(){
		
		return dd;
		
	}
	
}
