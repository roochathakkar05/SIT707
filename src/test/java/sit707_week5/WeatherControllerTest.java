package sit707_week5;

import java.util.Date;
import java.text.SimpleDateFormat;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WeatherControllerTest {
	// Declared Static Variables
	private static WeatherController wController;
	private static double[] TempArray = new double[WeatherController.HOURS_PER_DAY];
	private static int nHours;

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

	@BeforeClass
	public static void SetUpBeforeExecutingTest() {
		// Initialize controller and create local copy of the array and number of hours
		wController = WeatherController.getInstance();
		nHours = wController.getTotalHours();
		for (int i = 0; i < nHours; i++) {
			TempArray[i] = wController.getTemperatureForHour(i + 1);
		}
	}

	@Test
	public void testTemperatureMin() {
		System.out.println("+++ testTemperatureMin +++");

		double minTemperature = 1000;
		for (int i = 0; i < nHours; i++) {
			// retrieving values from local array
			if (minTemperature > TempArray[i]) {
				minTemperature = TempArray[i];
			}
		}

		// Should be equal to the min value that is cached in the controller.
		Assert.assertTrue(wController.getTemperatureMinFromCache() == minTemperature);

	}

	@Test
	public void testTemperatureMax() {
		System.out.println("+++ testTemperatureMax +++");
		double maxTemperature = -1;
		for (int i = 0; i < nHours; i++) {
			// retrieving values from local array
			if (maxTemperature < TempArray[i]) {
				maxTemperature = TempArray[i];
			}
		}

		// Should be equal to the min value that is cached in the controller.
		Assert.assertTrue(wController.getTemperatureMaxFromCache() == maxTemperature);

	}

	@Test
	public void testTemperatureAverage() {
		System.out.println("+++ testTemperatureAverage +++");
		double sumTemp = 0;
		for (int i = 0; i < nHours; i++) {
			// retrieving values from local array
			sumTemp += TempArray[i];
		}
		double averageTemp = sumTemp / nHours;

		// Should be equal to the min value that is cached in the controller.
		Assert.assertTrue(wController.getTemperatureAverageFromCache() == averageTemp);

	}

	@AfterClass
	public static void CleanUpAfterTestExecution() {
		// Shutdown controller
		wController.close();

	}
	/*
	@Test
	public void testTemperaturePersist() {
	
		 * Remove below comments ONLY for 5.3C task.
		 
		System.out.println("+++ testTemperaturePersist +++");
		String now = new SimpleDateFormat("H:m:s").format(new Date());
		String persistTime = wController.persistTemperature(10, 19.5);
		//String now = new SimpleDateFormat("H:m:s").format(new Date());
		System.out.println("Persist time: " + persistTime + ", now: " + now);
//		
		Assert.assertTrue(persistTime.equals(now));

	}*/
}
