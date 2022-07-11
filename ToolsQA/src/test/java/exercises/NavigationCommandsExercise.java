package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Launch new Browser
Open DemoQA.com website
Click on Registration link using "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
Come back to Home page (Use 'Back' command)
Again go back to Registration page (This time use 'Forward' command)
Again come back to Home page (This time use 'To' command)
Refresh the Browser (Use 'Refresh' command)
Close the Browser
 */

public class NavigationCommandsExercise {

	public static void main(String[] args) throws InterruptedException {


		//chrome driver location in local system
		String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;

		//Launch a new Chrome browser.
		System.setProperty("webdriver.chrome.driver",chromeDriverLocation);

		//Chrome driver object creation
		WebDriver driver = new ChromeDriver();

		//maximize the browser window
		driver.manage().window().maximize();

		//Open Shop.DemoQA.com
		String url = "http://automationpractice.com/index.php";
		driver.navigate().to(url); //exactly the same thing as the driver.get(appUrl)
		
		//Click on Registration link using "driver.findElement(By.xpath(".//[@id='menu-item-374']/a")).click();"*
          driver.findElement(By.cssSelector("a[title='Women']")).click();
          driver.findElement(By.cssSelector("a[title='About us']")).click();
          
        //same operation as clicking on the Back Button of any browser. 
  		 driver.navigate().back(); //Takes you back by one page on the browser's history
     
		//same operation as clicking on the Forward Button of any browser
        driver.navigate().forward(); //Takes you forward by one page on the browser's history.


		//Refresh the current page. 
		driver.navigate().refresh();  //same as f5
		
		//Close the Browser
		driver.quit();



	}

}
