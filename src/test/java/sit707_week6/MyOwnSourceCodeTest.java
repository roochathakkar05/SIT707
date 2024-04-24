package sit707_week6;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyOwnSourceCodeTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "s22037199";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Roocha Thakkar";
		Assert.assertNotNull("Student name is null", studentName);
	}
	@Test
	public void testAddUpTo() {
		Assert.assertEquals(55,MyOwnSourceCode.AddUpTo(10));
	}
	@Test
	public void testNumberOfOddNumUpTo() {
		Assert.assertEquals(8,MyOwnSourceCode.NumberOfOddNumUpTo(15));
	}

}
