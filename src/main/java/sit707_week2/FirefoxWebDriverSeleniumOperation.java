package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxWebDriverSeleniumOperation {

		public static void sleep(int sec) {
			try {
				Thread.sleep(sec*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void officeworks_registration_page(String url) throws IOException {
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			WebDriver driver = new FirefoxDriver(options);

			System.out.println("Fire up FireFox browser.");

			System.out.println("Driver info: " + driver);
			sleep(2);
			driver.get(url);
			
			WebElement fName = driver.findElement(By.id("firstname"));
			System.out.println("Found element: " + fName);
			fName.sendKeys("Roocha");
			
			WebElement lName = driver.findElement(By.id("lastname"));
			System.out.println("Found element: " + lName);
			lName.sendKeys("Thakkar");
			
			WebElement phoneN = driver.findElement(By.id("phoneNumber"));
			System.out.println("Found element: " + phoneN);
			phoneN.sendKeys("0450170362");
			
			WebElement email = driver.findElement(By.id("email"));
			System.out.println("Found element: " + email);
			email.sendKeys("katirarj@gmail.com");
			
			WebElement password = driver.findElement(By.id("password"));
			System.out.println("Found element: " + password);
			password.sendKeys("roocha123");
			
			WebElement cpassword = driver.findElement(By.id("confirmPassword"));
			System.out.println("Found element: " + cpassword);
			cpassword.sendKeys("roocha123");
			WebElement submit_button = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
			submit_button.click();
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("./imagef.png"));
			sleep(2);
			driver.close();	
		}
		public static void skechers_registration_page(String url) throws IOException{
			FirefoxOptions options = new FirefoxOptions();
			options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			WebDriver driver = new FirefoxDriver(options);

			System.out.println("Fire up FireFox browser.");
			System.out.println("Driver info: " + driver);
			sleep(2);
			driver.get(url);
			sleep(5);
			WebElement fName = driver.findElement(By.name("customer.firstname"));
			System.out.println("Found element: " + fName);
			fName.sendKeys("Roocha");
			
			WebElement lName = driver.findElement(By.name("customer.lastname"));
			System.out.println("Found element: " + lName);
			lName.sendKeys("Thakkar");
			
			WebElement email = driver.findElement(By.name("customer.email"));
			System.out.println("Found element: " + email);
			email.sendKeys("katirarj@gmail.com");
			
			WebElement phoneN = driver.findElement(By.name("customer.phone_number"));
			System.out.println("Found element: " + phoneN);
			phoneN.sendKeys("0450170362");
			
			WebElement password = driver.findElement(By.name("password"));
			System.out.println("Found element: " + password);
			password.sendKeys("roocha123");
			
			WebElement submit_button = driver.findElement(By.className("button-root"));
			submit_button.click();
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("./image2f.png"));
	        
	     	sleep(2);
	 
	     	driver.close();

			
		}

	}



