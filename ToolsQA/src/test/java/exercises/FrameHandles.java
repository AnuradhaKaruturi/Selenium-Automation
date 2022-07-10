package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandles {

	public static void main(String[] args) {
			String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;
			System.setProperty("webdriver.chrome.driver",chromeDriverLocation);

			//Chrome driver object creation
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
			
			driver.switchTo().frame("classFrame");
			driver.findElement(By.linkText("INDEX")).click();
			
			driver.switchTo().defaultContent(); 
			
			driver.switchTo().frame("packageFrame");
			driver.findElement(By.xpath("//a[text()=\"AbstractAnnotations\"]")).click();
			

	}

}
