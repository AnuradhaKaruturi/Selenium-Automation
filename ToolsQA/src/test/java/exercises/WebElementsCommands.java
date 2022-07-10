package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) {
		
		//chrome driver location in local system
				String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;
				
				//Launch a new Chrome browser.
				System.setProperty("webdriver.chrome.driver",chromeDriverLocation);
				
				//Chrome driver object creation
				WebDriver driver = new ChromeDriver();
				
				//maximize the browser window
				driver.manage().window().maximize();
				
				//Open Shop.DemoQA.com
				//String Url = "https://demo.competethemes.com/";
				String Url = "https://www.saucedemo.com/";
				driver.get(Url);
                WebElement userelement = driver.findElement(By.id("user-name"));
				
				boolean elementDisplayStatus = userelement.isDisplayed();  //return true if the element is present on the page and throw a NoSuchElementFound exception 
				
				System.out.println("UserName Textbox Element is currently being displayed or not : "+elementDisplayStatus);
				
				userelement.clear();
				
				boolean elementEnableStatus = userelement.isEnabled(); //determines if the element currently is Enabled or not?
				
				if(elementEnableStatus) {
					
					userelement.sendKeys("standard_user");
				}
				
				 WebElement passwordelement = driver.findElement(By.id("password"));
				 passwordelement.sendKeys("secret_sauce");
				 driver.findElement(By.id("login-button")).click();
				 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
				 driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
				 driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
				 driver.findElement(By.id("shopping_cart_container")).click();
				 /*
				WebElement rememberMe = driver.findElement(By.id("rememberme"));
				boolean rememberMeStatus = rememberMe.isSelected();
				if(!rememberMeStatus) {
					rememberMe.click();
				}
			*/
				
			    //driver.close();
				
				

	}

}
