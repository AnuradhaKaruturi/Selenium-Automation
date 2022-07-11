package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.loginPage;

public class LoginScenariosTC {
	

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
		
		new loginPage(driver).setUserName("standard_user");
		new loginPage(driver).setPassword("secret_sauce");
		new loginPage(driver).clickLogin();
		
	}
	
	@Test(enabled = true , groups = "invalidLogins")
	public void invalidCredentials() {
		
		new loginPage(driver).setUserName("standard_users");
		new loginPage(driver).setPassword("secret_saucelab");
		new loginPage(driver).clickLogin();
		String actualMsg = new loginPage(driver).getErrMsg();
		Assert.assertEquals(actualMsg, "Epic sadface: Username and password do not match any user in this service");	
	}
	
	@Test(enabled = true , groups = "invalidLogins")
	public void invalidUserName() {
		
		new loginPage(driver).setUserName("user");
		new loginPage(driver).setPassword("secret_sauce");
		new loginPage(driver).clickLogin();
		String actual = new loginPage(driver).getErrMsg();
		System.out.println(actual);
		String expected = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(enabled = true , groups = "invalidLogins")
	public void invalidPassword() {
		
		new loginPage(driver).setUserName("standard_user");
		new loginPage(driver).setPassword("secretsauce");
		new loginPage(driver).clickLogin();
		String actual = new loginPage(driver).getErrMsg();
		System.out.println(actual);
		String expected = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(enabled = true, groups = "invalidLogins")
	public void emptyUserName() {
		
		new loginPage(driver).setUserName("");
		new loginPage(driver).setPassword("secretsauce");
		new loginPage(driver).clickLogin();
		String actual = new loginPage(driver).getErrMsg();
		System.out.println(actual);
		String expected = "Epic sadface: Username is required";
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(enabled = true ,groups = "invalidLogins")
	public void emptyPassword() {
		
		new loginPage(driver).setUserName("standard_user");
		new loginPage(driver).setPassword("");
		new loginPage(driver).clickLogin();
		String actual = new loginPage(driver).getErrMsg();
		System.out.println(actual);
		String expected = "Epic sadface: Password is required";
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(enabled = true)
	public void emptyCredentials() {
		
		new loginPage(driver).setUserName("");
		new loginPage(driver).setPassword("");
		new loginPage(driver).clickLogin();
		String actual = new loginPage(driver).getErrMsg();
		System.out.println(actual);
		String expected = "Epic sadface: Username is required";
		Assert.assertEquals(actual, expected);
		
	}
	

	
	
	@AfterMethod
	public void closeBrowser()
	{
		//Close the Browser.
		 driver.close();
				
	}
	

}
