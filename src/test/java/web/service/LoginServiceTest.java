package web.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import web.handler.LoginServlet;

public class LoginServiceTest {

	private static void sleep(long sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static WebDriver driver;
	private WebElement username;
	private WebElement password;
	private WebElement dob;
	private WebElement button;
	@BeforeClass
	public static void SetupTestingWindow() {
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver(options);
		System.out.println("Fire up FireFox browser.");
		System.out.println("Driver info: " + driver);
		sleep(5);
	}
	@Before
	public void SetupTestingPage() {
		driver.navigate().to(
				"file:///C:/Users/Roocha%20Thakkar/Desktop/DEAKIN/T1%202024/SIT%20707/8.1P-resources/pages/login.html");
		sleep(3);
		username = driver.findElement(By.id("username"));
		username.clear();
		password = driver.findElement(By.id("passwd"));
		password.clear();
		dob = driver.findElement(By.id("dob"));
		dob.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
	}
	
	@Test
	public void testLoginSuccessValidCedentials() {
		username.sendKeys("ahsan");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("2000-07-05");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Success");
	}
	
	@Test
	public void testLoginFailInCorrectUsername() {
		username.sendKeys("roocha");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("2000-07-05");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailInCorrectPassword() {
		username.sendKeys("ahsan");
		password.sendKeys("roocha");
		dob.sendKeys("2000-07-05");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailInCorrectDOB() {
		username.sendKeys("ahsan");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("2000-07-04");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailInCorrectUsernamePassword() {
		username.sendKeys("roocha");
		password.sendKeys("roocha");
		dob.sendKeys("2000-07-05");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailInCorrectPasswordDOB() {
		username.sendKeys("ahsan");
		password.sendKeys("roocha");
		dob.sendKeys("2000-07-04");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailInCorrectUsernameDOB() {
		username.sendKeys("roocha");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("2000-07-04");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailInCorrectCredentials() {
		username.sendKeys("roocha");
		password.sendKeys("roocha");
		dob.sendKeys("2000-07-04");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	
	
	@Test
	public void testLoginFailBlankUsername() {
		username.sendKeys("");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("2000-07-05");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankPassword() {
		username.sendKeys("ahsan");
		password.sendKeys("");
		dob.sendKeys("2000-07-05");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankDOB() {
		username.sendKeys("ahsan");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	
	@Test
	public void testLoginFailBlankUsernameIncorrectPassword() {
		username.sendKeys("");
		password.sendKeys("roocha");
		dob.sendKeys("2000-07-05");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankUsernameIncorrectDOB() {
		username.sendKeys("");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("2000-07-04");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankUsernameIncorrectPasswordDOB() {
		username.sendKeys("");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("2000-07-04");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	
	@Test
	public void testLoginFailBlankPasswordIncorrectUsername() {
		username.sendKeys("roocha");
		password.sendKeys("");
		dob.sendKeys("2000-07-05");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankPasswordIncorrectDOB() {
		username.sendKeys("ahsan");
		password.sendKeys("");
		dob.sendKeys("2000-07-04");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankPasswordIncorrectUsernameDOB() {
		username.sendKeys("roocha");
		password.sendKeys("");
		dob.sendKeys("2000-07-04");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	
	@Test
	public void testLoginFailBlankDOBIncorrectUsername() {
		username.sendKeys("roocha");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankDOBIncorrectPassword() {
		username.sendKeys("ahsan");
		password.sendKeys("roocha");
		dob.sendKeys("");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankDOBIncorrectUsernamePassword() {
		username.sendKeys("roocha");
		password.sendKeys("roocha");
		dob.sendKeys("");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	
	@Test
	public void testLoginFailBlankCredentials() {
		username.sendKeys("");
		password.sendKeys("");
		dob.sendKeys("");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankUsernamePasswordCorrectDOB() {
		username.sendKeys("");
		password.sendKeys("");
		dob.sendKeys("2000-07-05");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankUsernamePasswordInCorrectDOB() {
		username.sendKeys("");
		password.sendKeys("");
		dob.sendKeys("2000-07-04");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankPasswordDOBCorrectUsername() {
		username.sendKeys("ahsan");
		password.sendKeys("");
		dob.sendKeys("");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankPasswordDOBInCorrectUsername() {
		username.sendKeys("roocha");
		password.sendKeys("");
		dob.sendKeys("");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankUsernameDOBCorrectPassword() {
		username.sendKeys("");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}
	@Test
	public void testLoginFailBlankUsernameDOBInCorrectPassword() {
		username.sendKeys("");
		password.sendKeys("ahsan_pass");
		dob.sendKeys("");
		button.submit();
		sleep(3);
		WebElement status = driver.findElement(By.id("login-status"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);

		Assert.assertEquals(statusVal, "Login status: Fail");

	}

	
	@AfterClass
	public static void CleanUp() {
		driver.close();
	}




}
