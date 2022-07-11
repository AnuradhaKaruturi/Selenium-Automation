package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
	
	public WebDriver driver;
	
	@FindBy(id = "checkout")
	private WebElement checkout;
	
	
	
	public CartPage(WebDriver driver) {
		super(driver);
		//PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	public AddressPage clickCheckout() {
		click(checkout);
		return new AddressPage(driver);
	}

}
