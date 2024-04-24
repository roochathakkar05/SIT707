package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
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
	public void testTrueNumberIsEven() {
		Assert.assertEquals(true,WeatherAndMathUtils.isEven(8));
	}
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertEquals(false,WeatherAndMathUtils.isEven(9));
	}
	
	
	@Test
	public void testTrueNumberIsPrime() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
	}
	@Test
	public void testTrueNumberIsPrimeWhereNumberIs1() {
		Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
	}
	@Test
	public void testFalseNumberIsPrime() {
		boolean test = WeatherAndMathUtils.isPrime(16);
		System.out.println(test);
		Assert.assertFalse(WeatherAndMathUtils.isPrime(16));
	}
	
	@Test
    public void testAllClear() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 2.0));
    }

    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    @Test
    public void testCancelWeatherAdviceOption2() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.1, 5.0));
    }
    @Test
    public void testCancelWeatherAdviceOption3() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(55.3, 7.0));
    }
    @Test
    public void testCancelWeatherAdviceOption4() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(55.3, 5.0));
    }
    
    @Test
    public void testWarnWeatherAdviceOption() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(49.0, 3.0));
    }
    @Test
    public void testWarnWeatherAdviceOption2() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(42.0, 5.0));
    }
    @Test
    public void testWarnWeatherAdviceOption3() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(49.0, 5.0));
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionWeatherAdviceOption() {
    	WeatherAndMathUtils.weatherAdvice(-1.0, -5.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionWeatherAdviceOption2() {
    	WeatherAndMathUtils.weatherAdvice(-1.0, 5.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionWeatherAdviceOption3() {
    	WeatherAndMathUtils.weatherAdvice(1.0, -5.0);
    }
    
}
