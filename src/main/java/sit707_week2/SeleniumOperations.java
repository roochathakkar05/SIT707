package sit707_week2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumOperations {
	
	public static String reedirectedurl;

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void Bunnings_RegistrationPage(String url, String Username, String Password) {
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver(options);
		System.out.println("Fire up FireFox browser.");

		System.out.println("Driver info: " + driver);
		sleep(5);
		driver.get(url);
		
		sleep(5);
        WebElement usernameField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        
        usernameField.sendKeys(Username);
        passwordField.sendKeys(Password);
        sleep(5);
        
        WebElement loginButton = driver.findElement(By.id("okta-signin-submit"));
        loginButton.click();
        
        sleep(5);
        reedirectedurl = driver.getCurrentUrl();
        sleep(5);
        
		driver.close();	
	}
	
	
}
