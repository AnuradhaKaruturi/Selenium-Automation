package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver",chromeDriverLocation);

		//Chrome driver object creation
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.ca/");
		
		WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
      
		Actions hover = new Actions(driver);
		
		hover.moveToElement(signIn).perform();
		
		driver.findElement(By.linkText("Your Lists")).click();

		


	}

}
