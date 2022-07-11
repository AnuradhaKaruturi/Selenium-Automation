package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BasePage{
	
	public WebDriver driver;
	
	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(id = "postal-code")
	private WebElement postalCode;
	
	@FindBy(name = "continue")
	private WebElement continueBtn;
	
	@FindBy(name = "cancel")
	private WebElement cancelBtn;
	
	
	public AddressPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
	
	public CheckOutPage enterAddressDetails(String fname,String lname,String zipcode) {
		enterText(firstName, fname);
		enterText(lastName, lname);
		enterText(postalCode, zipcode);
		click(continueBtn);
		return new CheckOutPage(driver);
	}

}
