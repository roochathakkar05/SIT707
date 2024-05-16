package web.service;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionService {

	@Test
	public void testTrue() {
		Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
		Assert.assertEquals(MathQuestionService.q2Subtraction("2", "1"), 1, 0);
		Assert.assertEquals(MathQuestionService.q3Multiplication("2", "2"), 4, 0);
	}
	@Test
	public void testAddNumber1Empty() {
		Assert.assertNull(MathQuestionService.q1Addition("", "2"));
		Assert.assertNull(MathQuestionService.q2Subtraction("", "2"));
		Assert.assertNull(MathQuestionService.q3Multiplication("", "2"));
	}	
	@Test
	public void testAddNumber2Empty() {
		Assert.assertNull(MathQuestionService.q1Addition("2", ""));
		Assert.assertNull(MathQuestionService.q2Subtraction("2", ""));
		Assert.assertNull(MathQuestionService.q3Multiplication("2", ""));
	}
	@Test
	public void testAddNumber12Empty() {
		Assert.assertNull(MathQuestionService.q1Addition("", ""));
		Assert.assertNull(MathQuestionService.q2Subtraction("", ""));
		Assert.assertNull(MathQuestionService.q3Multiplication("", ""));
	}
	@Test
	public void testAddNumber1Blank() {
		Assert.assertNull(MathQuestionService.q1Addition(" ", "2"));
		Assert.assertNull(MathQuestionService.q2Subtraction(" ", "2"));
		Assert.assertNull(MathQuestionService.q3Multiplication(" ", "2"));
	}	
	@Test
	public void testAddNumber2Blank() {
		Assert.assertNull(MathQuestionService.q1Addition("2", " "));
		Assert.assertNull(MathQuestionService.q2Subtraction("2", " "));
		Assert.assertNull(MathQuestionService.q3Multiplication("2", " "));
		
	}
	@Test
	public void testAddNumber12Blank() {
		Assert.assertNull(MathQuestionService.q1Addition(" ", " "));
		Assert.assertNull(MathQuestionService.q2Subtraction(" ", " "));
		Assert.assertNull(MathQuestionService.q3Multiplication(" ", " "));
	}
	@Test
	public void testAddNumber1Null() {
		Assert.assertNull(MathQuestionService.q1Addition(null, "2"));
		Assert.assertNull(MathQuestionService.q2Subtraction(null, "2"));
		Assert.assertNull(MathQuestionService.q3Multiplication(null, "2"));
	}	
	@Test
	public void testAddNumber2Null() {
		Assert.assertNull(MathQuestionService.q1Addition("2", null));
		Assert.assertNull(MathQuestionService.q2Subtraction("2", null));
		Assert.assertNull(MathQuestionService.q3Multiplication("2", null));
	}
	@Test
	public void testAddNumber12Null() {
		Assert.assertNull(MathQuestionService.q1Addition(null,null));
		Assert.assertNull(MathQuestionService.q2Subtraction(null,null));
		Assert.assertNull(MathQuestionService.q3Multiplication(null,null));
	}
	@Test
    public void testNumberFormatException() {
		Assert.assertNull(MathQuestionService.q1Addition("a","b"));
		Assert.assertNull(MathQuestionService.q1Addition("a","2"));
		Assert.assertNull(MathQuestionService.q1Addition("2","b"));
		Assert.assertNull(MathQuestionService.q2Subtraction("a","b"));
		Assert.assertNull(MathQuestionService.q2Subtraction("a","3"));
		Assert.assertNull(MathQuestionService.q2Subtraction("5","b"));
		Assert.assertNull(MathQuestionService.q3Multiplication("a","b"));
		Assert.assertNull(MathQuestionService.q3Multiplication("a","7"));
		Assert.assertNull(MathQuestionService.q3Multiplication("9","b"));
	}

}
