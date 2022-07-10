package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
	String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;
	System.setProperty("webdriver.chrome.driver",chromeDriverLocation);

	//Chrome driver object creation
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.scientecheasy.com/2020/01/move-element-in-selenium.html/");
	//driver.findElement(By.xpath("(//li[@id='menu-item-990']//child::a[text()='Interview'])[1]")).click();
	driver.findElement(By.xpath("(//a[text()='Interview']//parent::li[@id='menu-item-990']")).click();

	}

}
