package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AddressPage;
import Pages.CartPage;
import Pages.CheckOutPage;
import Pages.CompletePage;
import Pages.ProductDetailsPage;
import Pages.ProductsPage;
import Pages.loginPage;

public class SelectBackPackTC {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser()
	{
		
		//chrome driver location in local system
				//String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;
				
				//Launch a new Chrome browser.
				System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
				
				//Chrome driver object creation
				 driver = new ChromeDriver();
				
				//maximize the browser window
				driver.manage().window().maximize();
				
				//Open Shop.DemoQA.com
				String Url = "https://www.saucedemo.com/";
				driver.get(Url);
		
	}
	
	@Test(enabled = true)
	public void validCredentials() {
		loginPage newObj = new loginPage(driver);
		
		newObj.setUserName("standard_user");
		new loginPage(driver).setPassword("secret_sauce");
		new loginPage(driver).clickLogin();
		
	}
	
	@Test(dependsOnMethods = {"validCredentials"} , priority = 1 , enabled = true)
	public void chooseBackPack() {
		
		validCredentials();
		new ProductsPage(driver).selectBackPack();
		new ProductsPage(driver).clickShoppingCart();
		new CartPage(driver).clickCheckout();
		new AddressPage(driver).enterAddressDetails("Anu", "Jain", "T6r 0m3");
		new CheckOutPage(driver).clickFinish();
		
	}
	
	@Test
	public void chooseaProduct() {
		
		validCredentials();
		new ProductsPage(driver).selectBackPack();
		new ProductDetailsPage(driver).clickAddToCart();
		new ProductsPage(driver).clickShoppingCart();
		new CartPage(driver).clickCheckout();
		new AddressPage(driver).enterAddressDetails("Anu", "Jain", "T6r 0m3");
		new CheckOutPage(driver).clickFinish();
		
	}
	
	@Test
	public void validateThankYouMsg() {
	chooseaProduct();
	String actualMsg = new CompletePage(driver).ValidateThankyouMsg();
	Assert.assertEquals(actualMsg, "THANK YOU FOR YOUR ORDER");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//Close the Browser.
		 driver.close();
				
	}
	

}
