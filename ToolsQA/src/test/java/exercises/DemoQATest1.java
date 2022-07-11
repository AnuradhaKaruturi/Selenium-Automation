package exercises;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQATest1 {

	public static void main(String[] args) {
		String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;
		System.setProperty("webdriver.chrome.driver",chromeDriverLocation);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		
		//Test case to check login and page title
		driver.get("https://demoqa.com/");
		driver.navigate().to("https://demoqa.com/forms");
		driver.findElement(By.xpath("//div[@class=\'element-list collapse show\']")).click();
		driver.findElement(By.id("firstName")).sendKeys("lucky");
		String url = driver.getCurrentUrl();
		System.out.println("Current page URl " + url );
		String PageSource = driver.getPageSource();
		System.out.println("PageSource : "+ PageSource);
		//driver.close() // closes current window opened by webDriver
		//driver.quit(); //Closes all windows opened by the WebDriver

	}

}
