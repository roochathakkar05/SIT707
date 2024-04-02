package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "222037199";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Roocha Thakkar";
		Assert.assertNotNull("Student name is null", studentName);
	}
	//--X
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		System.out.println("Case 1:"+ status);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	//--X
	//-WX
	@Test
    public void Case2()
    {
		LoginStatus status = LoginForm.login(null, "wrong_pass");
		System.out.println("Case 2:"+ status);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	//-WX
	//-CX
	@Test
    public void Case3()
    {
		LoginStatus status = LoginForm.login(null, "ahsan_pass");
		System.out.println("Case 3:"+ status);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	//-CX
	//W-X
	@Test
    public void Case4()
    {
		LoginStatus status = LoginForm.login("wrong_user", null);
		System.out.println("Case 4:"+ status);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	//W-X
	//WWX
	@Test
    public void Case5()
    {
		LoginStatus status = LoginForm.login("wrong_user", "wrong_pass");
		System.out.println("Case 5:"+ status);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	//WWX
	//WCX
	@Test
    public void Case6()
    {
		LoginStatus status = LoginForm.login("wrong_user", "ahsan_pass");
		System.out.println("Case 6:"+ status);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	//WCX
	//C-X
	@Test
    public void Case7()
    {
		LoginStatus status = LoginForm.login("ahsan", null);
		System.out.println("Case 7:"+ status);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	//C-X
	//CWX
	@Test
    public void Case8()
    {
		LoginStatus status = LoginForm.login("ahsan", "wrong_pass");
		System.out.println("Case 8:"+ status);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	//CWX
	//CC-
	@Test
    public void Case9()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		System.out.println("Case 9:"+ status + " Validation Status: " + LoginForm.validateCode(null));
		if (status.isLoginSuccess()==true) 
		{
			Assert.assertTrue(LoginForm.validateCode(null) == false );
		}
		
		
    }
	//CC-
	//CCW
	@Test
    public void Case10()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		System.out.println("Case 10:"+ status  + " Validation Status: " + LoginForm.validateCode("abcd"));
		if (status.isLoginSuccess()==true) 
		{
			Assert.assertTrue(LoginForm.validateCode("abcd") == false );
		}
    }
	//CCW
	//CCC
	@Test
    public void Case11()
    {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		System.out.println("Case 11:"+ status  + " Validation Status: " + LoginForm.validateCode(status.getErrorMsg()));
		if (status.isLoginSuccess()==true) 
		{
			Assert.assertTrue(LoginForm.validateCode(status.getErrorMsg()) == true );
		}
		
    }
	//CCC
	
	
	/*
	 * Write more test functions below.
	 */
}
