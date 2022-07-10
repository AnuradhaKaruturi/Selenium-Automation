package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTittle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		//Test case to check login and page title
		driver.get("https://www.phptravels.net/login");
		driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
		String expectedtittle = "Dashboard - PHPTRAVELS";
		String actualtittle = driver.getTitle(); //return title of the page
		if(expectedtittle.equals(actualtittle)) {
			System.out.println("Testcase Passed");
		}
		else {
			System.out.println("Testcase Failed");
		}
		//close the browser
		//driver.quit();
	
}
}

