package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends BasePage{
	
	public WebDriver driver;
	
	@FindBy(id = "back-to-products")
	private WebElement backtoproductsBtn;
	
	@FindBy(xpath = "//h2[contains(text(),\'THANK YOU\')]")
	private WebElement lastthankYouMsg;
	
	
	public CompletePage(WebDriver driver) {
		super(driver);
		this.driver = driver;	
	}
	
	public String ValidateThankyouMsg() {
		return getText(lastthankYouMsg);
		
	}
}
