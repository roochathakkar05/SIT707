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
		System.setProperty("webdriver.chrome.driver",
				"C:/Program Files/chromedriver-win64/chromedriver.exe" );
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);	
		sleep(2);
		driver.get(url);
		WebElement fName =  driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.id("firstname-label")));
		System.out.println("Found element: " + fName);
		fName.sendKeys("Roocha");
		WebElement lName =  driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("firstname")));
		System.out.println("Found element: " + lName);
		lName.sendKeys("Thakkar");
		WebElement phoneN =  driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("email")));
		System.out.println("Found element: " + phoneN);
		phoneN.sendKeys("0450170362");
		WebElement email =  driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("phoneNumber")));
		System.out.println("Found element: " + email);
		email.sendKeys("katirarj@gmail.com");
		WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("email")).toLeftOf(By.className("MuiIconButton-edgeEnd")));
		System.out.println("Found element: " + password);
		password.sendKeys("roocha123");
		WebElement cpassword =  driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.className("jss9")));
		System.out.println("Found element: " + cpassword);
		cpassword.sendKeys("roocha123");
		WebElement submit_button = driver.findElement(RelativeLocator.with(By.tagName("button")).above(By.linkText("Login")));
		submit_button.click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));
		sleep(2);
		driver.close();	
	}

}
