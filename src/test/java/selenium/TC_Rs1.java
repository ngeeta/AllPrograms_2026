package selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_Rs1 extends BaseClass {
PF_Rs1 rs1;
	@Test
	public void getDD() {
		rs1=new PF_Rs1(driver);
		rs1.enterInSuggBox("India");
		List<WebElement> sugg=rs1.getddOpt();
	}
}
