package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.loginPage;

public class FileUploadTc {
	
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
				String Url = "https://demoqa.com/upload-download";
				driver.get(Url);
		
	}
	
	@Test
	public void fileUpload() {
		new loginPage(driver).uploadFile();
		
	}

	@AfterMethod
	public void closeBrowser()
	{
		//Close the Browser.
		 driver.close();
				
	}
	

}
