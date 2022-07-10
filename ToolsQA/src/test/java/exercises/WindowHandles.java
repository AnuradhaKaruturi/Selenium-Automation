package exercises;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		//chrome driver location in local system
	String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;

	//Launch a new Chrome browser.
	System.setProperty("webdriver.chrome.driver",chromeDriverLocation);

	//Chrome driver object creation
	WebDriver driver = new ChromeDriver();

	//maximize the browser window
	driver.manage().window().maximize();

	String url = "https://demoqa.com/browser-windows";
	driver.get(url);
	
	WebElement tab = driver.findElement(By.id("tabButton"));
	tab.click();
	
	Set<String> windows = driver.getWindowHandles();
	String nextTab = (String) windows.toArray()[1];
	//driver.switchTo().window(nextTab);
	driver.switchTo().defaultContent();


	}

}
