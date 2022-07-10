package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Launch a new Chrome browser.
Open Shop.DemoQA.com
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Print Page Length on Eclipse Console.
Close the Browser.
 */

public class BrowserCommandsExercise {

	public static void main(String[] args) {
		
		//chrome driver location in local system
		String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;
		
		//Launch a new Chrome browser.
		System.setProperty("webdriver.chrome.driver",chromeDriverLocation);
		
		//Chrome driver object creation
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//Open Shop.DemoQA.com
		String Url = "http://automationpractice.com/index.php";
		driver.get(Url);
		
		//Get Page Title name and Title length
		String title = driver.getTitle();
		int titleLength = title.length();
		
		//Print Page Title and Title length on the Eclipse Console.
		System.out.println("Title of the page is : " + title); 
		System.out.println("Length of the title is : "+ titleLength); 
		
		//Get Page URL and verify if it is a correct page opened
		
		String currentPageUrl = driver.getCurrentUrl();
		if(currentPageUrl.equals(Url)) {
			System.out.println("Correct page is Opened");
		}
		else {
			System.out.println("Correct page is not Opened");
		}
		
		
		//Get Page Source (HTML Source code) and Page Source length
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		
		// Print Page length
		System.out.println("Total length of the Page Source is : " + pageSourceLength); 
	
		//Close the Browser.
		//driver.close();
		

	}

}
