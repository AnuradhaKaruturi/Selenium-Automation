package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BasePage{
	
	public WebDriver driver;
	
	@FindBy(id = "finish")
	private WebElement finish;
	
	@FindBy(id = "cancel")
	private WebElement cancelBtn;
	
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	public CompletePage clickFinish() {
		click(finish);
		return new CompletePage(driver);
	}
	

}
