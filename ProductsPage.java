package Pages;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage extends BasePage{
	
	public WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}

	@FindBy(xpath = "//button[text()='Add to cart']")
	private List<WebElement> addToCart;
	
	
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	private WebElement backPack;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
	private WebElement shoppingCart;
	
	
	
	public ProductDetailsPage selectBackPack(){
		waitForElementVisibility(backPack);
		click(backPack);
		return new ProductDetailsPage(driver);
	}
	
	public CartPage clickShoppingCart() {
		click(shoppingCart);
		return new CartPage(driver);
		
	}
}
