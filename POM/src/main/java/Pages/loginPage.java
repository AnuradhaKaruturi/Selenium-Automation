package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends BasePage {
	
	public WebDriver driver;
	
	public loginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
 
	@FindBy(id = "user-name")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login-button")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	private WebElement errBtn;
	
	@FindBy(xpath = "//input[@id=\"uploadFile\"]") //https://demoqa.com/upload-download
	private WebElement upload;
	
	
	/*
	public loginPage setUserName(String username) {
		new BasePage(driver).waitForElement(userName);
		userName.sendKeys(username);
		return this;
	}
	*/
	public loginPage setUserName(String username) {
		enterText(userName, username);
		return this;
	}
	
	public loginPage setPassword(String pswd) {
		new BasePage(driver).waitForElementVisibility(password);
		password.sendKeys(pswd);
		return this;
	}
	
	public ProductsPage clickLogin() {
		new BasePage(driver).waitForElementVisibility(loginBtn);
		loginBtn.click();
		return new ProductsPage(driver);
	}
	
	public String getErrMsg() {
		return getText(errBtn);
	}
	
	public void uploadFile() {
		enterText(upload,"C:\\Users\\anura\\Downloads"); //passed
		//enterText(upload,"\"C:\\Users\\anura\\Downloads\\most-complete-webdriver-java-cheatsheet.pdf\""); //failed
		
	}
	

}
