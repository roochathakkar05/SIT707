package web.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitLoginServiceTest {

	@Test
	public void testAuthenticate_ValidCredentials() {
		LoginService loginService = new LoginService();
		assertTrue(LoginService.login("ahsan", "ahsan_pass", "2000-07-05"));
	}
	
	@Test
	public void testAuthenticate_InCorrectUsername() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "ahsan_pass", "2000-07-05"));
	}
	@Test
	public void testAuthenticate_InCorrectPassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "roocha", "2000-07-05"));
	}
	@Test
	public void testAuthenticate_InCorrectDOB() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "ahsan_pass", "2000-07-04"));
	}
	@Test
	public void testAuthenticate_InCorrectUsernamePassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "roocha", "2000-07-05"));
	}
	@Test
	public void testAuthenticate_InCorrectPasswordDOB() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "roocha", "2000-07-04"));
	}
	@Test
	public void testAuthenticate_InCorrectDOBUsername() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "ahsan_pass", "2000-07-04"));
	}
	@Test
	public void testAuthenticate_InCorrectCredentials() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "roocha", "2000-07-04"));
	}
	
	@Test
	public void testAuthenticate_BlankUsername() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("", "ahsan_pass", "2000-07-05"));
	}
	@Test
	public void testAuthenticate_BlankPassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "", "2000-07-05"));
	}
	@Test
	public void testAuthenticate_BlankDOB() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "ahsan_pass", ""));
	}
	
	@Test
	public void testAuthenticate_BlankUsernameInCorrectPassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("", "roocha", "2000-07-05"));
	}
	@Test
	public void testAuthenticate_BlankUsernameInCorrectDOB() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("", "ahsan_pass", "2000-07-04"));
	}
	@Test
	public void testAuthenticate_BlankUsernameInCorrectPasswordDOB() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("", "roocha", "2000-07-01"));
	}
	@Test
	public void testAuthenticate_BlankPasswordInCorrectUsername() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "", "2000-07-05"));
	}
	@Test
	public void testAuthenticate_BlankPasswordInCorrectDOB() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "", "2000-06-05"));
	}
	@Test
	public void testAuthenticate_BlankPasswordInCorrectUsernameDOB() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "", "2000-08-05"));
	}
	@Test
	public void testAuthenticate_BlankDOBInCorrectPassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "roocha", ""));
	}
	@Test
	public void testAuthenticate_BlankDOBInCorrectUsername() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "ahsan_pass", ""));
	}
	@Test
	public void testAuthenticate_BlankDOBInCorrectUsernamePassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "roocha", ""));
	}
	@Test
	public void testAuthenticate_BlankCrendtials() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("", "", ""));
	}
	@Test
	public void testAuthenticate_BlankUsernamePasswordCorrectDOB() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("", "", "2000-07-05"));
	}
	@Test
	public void testAuthenticate_BlankUsernamePasswordInCorrectDOB() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("", "", "2000-07-04"));
	}
	@Test
	public void testAuthenticate_BlankUsernameDOBCorrectPassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("", "ahsan_pass", ""));
	}
	@Test
	public void testAuthenticate_BlankUsernameDOBInCorrectPassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("", "roocha", ""));
	}
	@Test
	public void testAuthenticate_BlankPasswordDOBCorrectUsername() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "", ""));
	}
	@Test
	public void testAuthenticate_BlankPasswordDOBInCorrectUsername() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "", ""));
	}
	
	@Test
	public void testAuthenticate_InvalidDateValue() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "ahsan_pass", "12345"));
	}
	@Test
	public void testAuthenticate_InvalidDateValueIncorrectUsername() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "ahsan_pass", "12345"));
	}
	@Test
	public void testAuthenticate_InvalidDateValueIncorrectPassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("ahsan", "roocha", "12345"));
	}
	@Test
	public void testAuthenticate_InvalidDateValueIncorrectUsernamePassword() {
		LoginService loginService = new LoginService();
		assertFalse(LoginService.login("roocha", "roocha", "12345"));
	}
	

}
