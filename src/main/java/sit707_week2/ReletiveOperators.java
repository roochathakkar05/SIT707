/**
 * 
 */
package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

/**
 * 
 */
public class ReletiveOperators {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page_reletive_locator(String url) throws IOException {
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
		WebElement fName =  driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.id("firstname-label")));
		System.out.println("Found element: " + fName);
		// Send first name
		fName.sendKeys("Roocha");
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement lName =  driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("firstname")));
		System.out.println("Found element: " + lName);
		// Send first name
		lName.sendKeys("Thakkar");
		WebElement phoneN =  driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("email")));
		System.out.println("Found element: " + phoneN);
		// Send first name
		phoneN.sendKeys("0450170362");
		WebElement email =  driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("phoneNumber")));
		System.out.println("Found element: " + email);
		// Send first name
		email.sendKeys("katirarj@gmail.com");
		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.className("MuiIconButton-edgeEnd")));
		System.out.println("Found element: " + password);
		// Send first name
		password.sendKeys("roocha123");
		WebElement cpassword =  driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.className("jss9")));
		System.out.println("Found element: " + cpassword);
		// Send first name
		cpassword.sendKeys("roocha123");
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		WebElement submit_button = driver.findElement(RelativeLocator.with(By.tagName("submit")).above(By.linkText("Login")));
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

}
