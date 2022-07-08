package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage {
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addToCartBackPack;
	
	@FindBy(xpath = "//button[text()=\'Add to cart\']")
	private WebElement addToCart;
	
	public WebDriver driver;
	
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

	public void clickAddToCart() {
		click(addToCart);		
	}

}
