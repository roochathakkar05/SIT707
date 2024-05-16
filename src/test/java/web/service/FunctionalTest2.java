package web.service;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FunctionalTest2 {

	private static void sleep(long sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static WebDriver driver;
	private WebElement number1;
	private WebElement number2;
	private WebElement results;
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
	@Test
	public void testq1ValidAnswer() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("5");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		String expectedUrl = "http://localhost:8080/q2";
        String actualUrl = driver.getCurrentUrl();;
        assertEquals(expectedUrl,actualUrl);
        
	}
	@Test
	public void testq1BlankNumber1() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("");
		number2.sendKeys("5");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq1BlankNumber2() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq1BlankAnswer() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("5");
		results.sendKeys("");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);        
	}
	@Test
	public void testq1BlankNumber12() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("");
		number2.sendKeys("");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq1BlankNumber2R() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("");
		results.sendKeys("");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq1BlankNumber1R() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq1BlankAll() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("");
		number2.sendKeys("");
		results.sendKeys("");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq1Incorrect() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("5");
		results.sendKeys("13");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals(statusVal, "Wrong answer, try again.");      
	}
	@Test
	public void testq1InvalidValues1() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("roocha");
		number2.sendKeys("5");
		results.sendKeys("13");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq1InvalidValues2() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("1");
		number2.sendKeys("roocha");
		results.sendKeys("13");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq1InvalidValuesR() {
		driver.navigate().to("http://localhost:8080/q1");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("7");
		number2.sendKeys("5");
		results.sendKeys("roocha");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	
	
	@Test
	public void testq2ValidAnswer() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("7");
		number2.sendKeys("5");
		results.sendKeys("2");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		String expectedUrl = "http://localhost:8080/q3";
        String actualUrl = driver.getCurrentUrl();;
        assertEquals(expectedUrl,actualUrl);
        
	}
	@Test
	public void testq2BlankNumber1() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("");
		number2.sendKeys("5");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq2BlankNumber2() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq2BlankAnswer() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("5");
		results.sendKeys("");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);        
	}
	@Test
	public void testq2BlankNumber12() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("");
		number2.sendKeys("");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq2BlankNumber2R() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("");
		results.sendKeys("");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq2BlankNumber1R() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq2BlankAll() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("");
		number2.sendKeys("");
		results.sendKeys("");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq2Incorrect() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("7");
		number2.sendKeys("5");
		results.sendKeys("13");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals(statusVal, "Wrong answer, try again.");      
	}
	@Test
	public void testq2InvalidValues1() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("roocha");
		number2.sendKeys("5");
		results.sendKeys("13");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq2InvalidValues2() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("1");
		number2.sendKeys("roocha");
		results.sendKeys("13");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq2InvalidValuesR() {
		driver.navigate().to("http://localhost:8080/q2");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("7");
		number2.sendKeys("5");
		results.sendKeys("roocha");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	
	
	@Test
	public void testq3ValidAnswer() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("7");
		number2.sendKeys("5");
		results.sendKeys("35");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		String expectedUrl = "http://localhost:8080/completed";
        String actualUrl = driver.getCurrentUrl();;
        assertEquals(expectedUrl,actualUrl);
        
	}
	@Test
	public void testq3BlankNumber1() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("");
		number2.sendKeys("5");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq3BlankNumber2() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq3BlankAnswer() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("5");
		results.sendKeys("");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);        
	}
	@Test
	public void testq3BlankNumber12() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("");
		number2.sendKeys("");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq3BlankNumber2R() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number1.clear();
		number2 = driver.findElement(By.id("number2"));
		number2.clear();
		results = driver.findElement(By.id("result"));
		results.clear();
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("");
		results.sendKeys("");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq3BlankNumber1R() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("5");
		number2.sendKeys("");
		results.sendKeys("10");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq3BlankAll() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("");
		number2.sendKeys("");
		results.sendKeys("");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);       
	}
	@Test
	public void testq3Incorrect() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("7");
		number2.sendKeys("5");
		results.sendKeys("13");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals(statusVal, "Wrong answer, try again.");      
	}
	@Test
	public void testq3InvalidValues1() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("roocha");
		number2.sendKeys("5");
		results.sendKeys("13");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq3InvalidValues2() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("1");
		number2.sendKeys("roocha");
		results.sendKeys("13");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	@Test
	public void testq3InvalidValuesR() {
		driver.navigate().to("http://localhost:8080/q3");
		sleep(5);
		number1 = driver.findElement(By.id("number1"));
		number2 = driver.findElement(By.id("number2"));
		results = driver.findElement(By.id("result"));
		button = driver.findElement(By.cssSelector("[type=submit]"));
		number1.sendKeys("7");
		number2.sendKeys("5");
		results.sendKeys("roocha");
		button.submit();
		sleep(5);
		WebElement status = driver.findElement(By.id("message"));
		String statusVal = status.getText();
		System.out.println("Status: " + statusVal);
		sleep(5);
		
		Assert.assertEquals("Please fill all the fields with valid values to proceed.", statusVal);      
	}
	
	@AfterClass
	public static void CleanUp() {
		driver.close();
	}



}
