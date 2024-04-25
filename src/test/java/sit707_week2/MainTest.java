package sit707_week2;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ValidLoginAttempt() {
		SeleniumOperations.Bunnings_RegistrationPage("https://www.bunnings.com.au/login","id37526353@gmail.com","Bamboo@123");
        String redirectedUrl = SeleniumOperations.reedirectedurl;
        Assert.assertTrue("Redirect after login Worked", !redirectedUrl.equals("https://www.bunnings.com.au/login"));	
	}
	@Test
	public void InValidLoginAttemptIncorrectPassword() {
		SeleniumOperations.Bunnings_RegistrationPage("https://www.bunnings.com.au/login","id37526353@gmail.com","Bazaoo@123");
        String redirectedUrl = SeleniumOperations.reedirectedurl;
        Assert.assertTrue("Login page URL mismatch", redirectedUrl.startsWith("https://www.bunnings.com.au/login"));
		
	}
	@Test
	public void InValidLoginAttemptIncorrectUsername() {
		SeleniumOperations.Bunnings_RegistrationPage("https://www.bunnings.com.au/login","id37526783@gmail.com","Bamboo@123");
        String redirectedUrl = SeleniumOperations.reedirectedurl;
        Assert.assertTrue("Login page URL mismatch", redirectedUrl.startsWith("https://www.bunnings.com.au/login"));
		
	}
	@Test
	public void InValidLoginAttempt() {
		SeleniumOperations.Bunnings_RegistrationPage("https://www.bunnings.com.au/login","id37526783@gmail.com","Bazaoo@123");
        String redirectedUrl = SeleniumOperations.reedirectedurl;
        Assert.assertTrue("Login page URL mismatch", redirectedUrl.startsWith("https://www.bunnings.com.au/login"));
		
	}
	@Test
	public void InValidLoginAttemptBlanks() {
		SeleniumOperations.Bunnings_RegistrationPage("https://www.bunnings.com.au/login","","");
        String redirectedUrl = SeleniumOperations.reedirectedurl;
        Assert.assertTrue("Login page URL mismatch", redirectedUrl.startsWith("https://www.bunnings.com.au/login"));
		
	}
	@Test
	public void InValidLoginAttemptBlankUsernameWrongPass() {
		SeleniumOperations.Bunnings_RegistrationPage("https://www.bunnings.com.au/login","","Bazaoo@123");
        String redirectedUrl = SeleniumOperations.reedirectedurl;
        Assert.assertTrue("Login page URL mismatch", redirectedUrl.startsWith("https://www.bunnings.com.au/login"));
		
	}
	@Test
	public void InValidLoginAttemptBlankPasswordCorrectUsername() {
		SeleniumOperations.Bunnings_RegistrationPage("https://www.bunnings.com.au/login","id37526353@gmail.com","");
        String redirectedUrl = SeleniumOperations.reedirectedurl;
        Assert.assertTrue("Login page URL mismatch", redirectedUrl.startsWith("https://www.bunnings.com.au/login"));
		
	}
	@Test
	public void InValidLoginAttemptBlankUsernameCorrectPass() {
		SeleniumOperations.Bunnings_RegistrationPage("https://www.bunnings.com.au/login","","Bamboo@123");
        String redirectedUrl = SeleniumOperations.reedirectedurl;
        Assert.assertTrue("Login page URL mismatch", redirectedUrl.startsWith("https://www.bunnings.com.au/login"));
		
	}
	@Test
	public void InValidLoginAttemptBlankPasswordWrongUsername() {
		SeleniumOperations.Bunnings_RegistrationPage("https://www.bunnings.com.au/login","id37526783@gmail.com","");
        String redirectedUrl = SeleniumOperations.reedirectedurl;
        Assert.assertTrue("Login page URL mismatch", redirectedUrl.startsWith("https://www.bunnings.com.au/login"));
		
	}
}
