package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseAction {

	public static void main(String[] args) {
	String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;
	System.setProperty("webdriver.chrome.driver",chromeDriverLocation);

	//Chrome driver object creation
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	/*//Drag And Drop
	driver.get("https://demoqa.com/droppable");

	Actions action = new Actions(driver);
	
	WebElement start = driver.findElement(By.id("draggable"));
	WebElement end = driver.findElement(By.id("droppable"));
	
	// action.dragAndDrop(start, end).perform();     //performs drag and drop
	
	action.contextClick().perform();  //context click(right click) at current mouse position
	action.doubleClick().perform();   //perform double click
	*/
	
	//Move to Element
	driver.get("https://www.scientecheasy.com/2020/01/move-element-in-selenium.html/");
	Actions moveaction = new Actions(driver);
	WebElement menu = driver.findElement(By.xpath("//li//a[text()='Interview']"));
	WebElement submenu = driver.findElement(By.xpath("//a[text()='Java']"));
	WebElement supersubmenu = driver.findElement(By.xpath("//a[text()='Core Java']"));
	moveaction.moveToElement(menu).moveToElement(submenu).moveToElement(supersubmenu).click().perform();
	
	driver.quit();

	}

}
