package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver",
				"C:/Program Files/chromedriver-win64/chromedriver.exe" );
				
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement fName = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + fName);
		// Send first name
		fName.sendKeys("Roocha");
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement lName = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lName);
		// Send first name
		lName.sendKeys("Thakkar");
		WebElement phoneN = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + phoneN);
		// Send first name
		phoneN.sendKeys("0450170362");
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		// Send first name
		email.sendKeys("katirarj@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + password);
		// Send first name
		password.sendKeys("roocha123");
		WebElement cpassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + cpassword);
		// Send first name
		cpassword.sendKeys("roocha123");
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		WebElement submit_button = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
		submit_button.click();
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	public static void skechers_registration_page(String url) throws IOException{
		System.setProperty("webdriver.chrome.driver",
				"C:/Program Files/chromedriver-win64/chromedriver.exe" );
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);
		sleep(2);
		driver.get(url);
		sleep(10);
		WebElement fName = driver.findElement(By.name("customer.firstname"));
		System.out.println("Found element: " + fName);
		fName.sendKeys("Roocha");
		WebElement lName = driver.findElement(By.name("customer.lastname"));
		System.out.println("Found element: " + lName);
		// Send first name
		lName.sendKeys("Thakkar");
		WebElement email = driver.findElement(By.name("customer.email"));
		System.out.println("Found element: " + email);
		// Send first name
		email.sendKeys("katirarj@gmail.com");
		WebElement phoneN = driver.findElement(By.name("customer.phone_number"));
		System.out.println("Found element: " + phoneN);
		// Send first name
		phoneN.sendKeys("0450170362");
		WebElement password = driver.findElement(By.name("password"));
		System.out.println("Found element: " + password);
		// Send first name
		password.sendKeys("roocha123");
		
		WebElement submit_button = driver.findElement(By.className("button-root"));
		submit_button.click();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image2.png"));
        
     	sleep(2);
 
     	driver.close();

		
	}
	
	
}
