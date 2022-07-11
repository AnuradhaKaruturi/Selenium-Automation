package exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {
		//chrome driver location in local system
				String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;

				//Launch a new Chrome browser.
				System.setProperty("webdriver.chrome.driver",chromeDriverLocation);

				//Chrome driver object creation
				WebDriver driver = new ChromeDriver();

				//Open DemoQA.com
				String url = "https://demoqa.com/select-menu";
				driver.navigate().to(url); //exactly the same thing as the driver.get(appUrl)
				
				//Select Menu
				Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
				select.selectByValue("9");
				select.selectByIndex(5);
				select.selectByVisibleText("Purple");
				
				
				//Standard multi select
				Select multiselect = new Select(driver.findElement(By.id("cars")));
				
				multiselect.selectByValue("opel");
				multiselect.selectByIndex(1);
				multiselect.selectByVisibleText("Audi");
				multiselect.deselectAll();
				driver.quit();

	}

}
