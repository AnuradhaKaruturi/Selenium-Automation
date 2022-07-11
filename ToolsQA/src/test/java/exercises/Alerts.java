package exercises;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {

		//chrome driver location in local system
	String chromeDriverLocation = "D:\\SOFTWARES\\ChromeDriver\\chromedriver.exe" ;

	//Launch a new Chrome browser.
	System.setProperty("webdriver.chrome.driver",chromeDriverLocation);

	//Chrome driver object creation
	WebDriver driver = new ChromeDriver();

	//maximize the browser window
	driver.manage().window().maximize();

	String url = "https://selenium08.blogspot.com/2019/07/alert-test.html";
	driver.get(url);

	
	
/*  Simple Alert
		// Click on simple alert button to show alert box. 
		 WebElement simple = driver.findElement(By.xpath("//input[@id='simple']")); 
		 simple.click(); 

		// first any action to perform on alters first we need to Switching to Alert from webpage. 
	     Alert alert = driver.switchTo().alert(); 
	     // Get or read the text displayed on Alert popup and save it in a string using variable "getText" in order to print it later. 
          String getText = driver.switchTo().alert().getText(); 
          System.out.println(getText); 

         // Check that the correct message is displayed to the user Alert box. 
            if(getText.equalsIgnoreCase("Hello! I am a simple alert box!")) 
             { 
    	// Display a message that indicates whether verification was successful. 
      System.out.println("It worked, the expected simple alert was shown"); 
       } 
     else 
     { 
         System.out.println("Something went wrong, expected simple alert was not shown"); 
       } 
// Click OK button, by calling accept() method. 
      alert.accept(); 
	     alert.accept();
	     //alert.dismiss();
		 */

	
	
/*	
	//Confirmation Alert
	// Click on Confiramation Alert button to show alert box. 
	WebElement confirm = driver.findElement(By.xpath("//button[@id='confirm']")); 
	confirm.click(); 

	// Switching to alert from web page. 
	Alert alert = driver.switchTo().alert();
	/*
	String getText = driver.switchTo().alert().getText(); 
	System.out.println(getText); 

	if(getText.equalsIgnoreCase("This is a confirm alert. Do you want to accept or cancel?")) 
	{ 
		alert.accept(); 
		System.out.println("You accepted alert"); 
	} 
	else 
	{ 
		alert.dismiss(); 
		System.out.println("You dismissed alert"); 
		} 
		*/
	
	// Click on Prompt Alert button to show alert box. 
		WebElement promptinput = driver.findElement(By.xpath("//button[@id='prompt']")); 
		promptinput.click(); 

		// Switching to alert from web page. 
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Welcome Techie.");
		alert.accept();
	
	

      driver.quit();

	}

}
 