package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		
		String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;

		//Launch a new Chrome browser.
		System.setProperty("webdriver.chrome.driver",chromeDriverLocation);

		//Chrome driver object creation
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

			
		driver.findElement(By.linkText("Checkboxes")).click();
		boolean checkboxSelected = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
		if(checkboxSelected == false) {
			driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
		}

	}

}
