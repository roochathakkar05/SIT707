package sit707_tasks;

import static org.junit.Assert.*;

import java.time.Month;
import java.time.MonthDay;

import org.junit.Assert;
import org.junit.Test;

public class NewTestsTask3D {

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
	/*
	 * Test Cases For New Addition of Holiday - Task3.3D - BVT
	 */
	@Test
    public void testMaximumBoundary() {
        DateUtil dateUtil = new DateUtil(2, 1, 2024);
        Holiday holiday = new Holiday();
        holiday.addHoliday(1, 1); // Adding New Year holiday
        String daysUntilNextHoliday = dateUtil.daysUntilNextHoliday(holiday);
        Assert.assertEquals("365", daysUntilNextHoliday); // New Year is the next holiday
    }
    @Test
    public void testMinimumBoundary() {
        DateUtil dateUtil = new DateUtil(31, 12, 2024);
        Holiday holiday = new Holiday();
        holiday.addHoliday(1, 1);
        String daysUntilNextHoliday = dateUtil.daysUntilNextHoliday(holiday);
        Assert.assertEquals("1", daysUntilNextHoliday); // New Year is the next holiday
    }
    @Test
    public void testEdgeCase() {
        DateUtil dateUtil = new DateUtil(25, 12, 2024); // Christmas Eve
        Holiday holiday = new Holiday();
        holiday.addHoliday(12, 26); // Adding Christmas Eve holiday
        holiday.addHoliday(12, 25); // Adding Christmas holiday
        String daysUntilNextHoliday = dateUtil.daysUntilNextHoliday(holiday);
        assertEquals("Today is a Holiday", daysUntilNextHoliday); // Christmas is the  holiday
    }
    @Test
    public void testNoHolidaysExist() {
        DateUtil dateUtil = new DateUtil(1, 6, 2024); // June 1st, 2024
        Holiday holiday = new Holiday(); // No holidays added
        String daysUntilNextHoliday = dateUtil.daysUntilNextHoliday(holiday);
        assertEquals("No Holidays Added", daysUntilNextHoliday); // No holidays exist
    }
    @Test
    public void AddHolidayMaximumMonthandDay() {
    	  Holiday holiday = new Holiday(); 
    	  holiday.addHoliday(12, 31); 
    	  assertTrue(holiday.getHolidays().contains(MonthDay.of(12, 31)));
    }		
    @Test
    public void RemoveHolidayMaximumMonthandDay() {
    	  Holiday holiday = new Holiday(); 
    	  holiday.addHoliday(12, 31); 
    	  holiday.removeHoliday(12, 31);
    	  assertFalse(holiday.getHolidays().contains(MonthDay.of(12, 31)));
    }	
    @Test
    public void AddHolidayMinimumMonthandDay() {
    	  Holiday holiday = new Holiday(); 
    	  holiday.addHoliday(1, 1); 
    	  assertTrue(holiday.getHolidays().contains(MonthDay.of(1, 1)));
    }		
    @Test
    public void RemoveHolidayMinimumMonthandDay() {
    	  Holiday holiday = new Holiday(); 
    	  holiday.addHoliday(1, 1); 
    	  holiday.removeHoliday(1, 1);
    	  assertFalse(holiday.getHolidays().contains(MonthDay.of(1, 1)));
    }
    @Test
    public void AddHolidayRandomMonthandDay() {
    	  Holiday holiday = new Holiday(); 
    	  holiday.addHoliday(4, 25); 
    	  holiday.removeHoliday(1, 1);
    	  assertTrue(holiday.getHolidays().contains(MonthDay.of(4, 25)));
    }
    /*
	 * Test Cases For New Addition of Holiday - Task3.3D - ECT
	 */
    @Test
    public void ValidDateNextHolidayExists() {
        DateUtil dateUtil = new DateUtil(15, 10, 2024); 
        Holiday holiday = new Holiday(); // Adding Christmas Eve holiday
        holiday.addHoliday(12, 25); // Adding Christmas holiday
        String daysUntilNextHoliday = dateUtil.daysUntilNextHoliday(holiday);
        assertEquals("71", daysUntilNextHoliday); // Christmas is the  holiday
    }
    @Test
    public void ValidDateNextHolidayDoesNotExist() {
        DateUtil dateUtil = new DateUtil(1, 6, 2024); // June 1st, 2024
        Holiday holiday = new Holiday(); // No holidays added
        String daysUntilNextHoliday = dateUtil.daysUntilNextHoliday(holiday);
        assertEquals("No Holidays Added", daysUntilNextHoliday); // No holidays exist
    }
    @Test(expected = RuntimeException.class)
    public void TestIncorrectDates(){
    	DateUtil dateUtil = new DateUtil(32, 10, 2024); 
        Holiday holiday = new Holiday();
        holiday.addHoliday(12, 25); // Adding Christmas holiday
        String daysUntilNextHoliday = dateUtil.daysUntilNextHoliday(holiday);
    }
    @Test(expected = RuntimeException.class)
    public void TestIncorrectDatesForHoilday(){
    	DateUtil dateUtil = new DateUtil(31, 12, 1698); 
        Holiday holiday = new Holiday(); 
        holiday.addHoliday(31, 12); // Adding Christmas holiday
        String daysUntilNextHoliday = dateUtil.daysUntilNextHoliday(holiday);
    }
    @Test
    public void AddHoliday() {
    	  Holiday holiday = new Holiday(); 
    	  holiday.addHoliday(12, 25); 
    	  assertTrue(holiday.getHolidays().contains(MonthDay.of(12, 25)));
    }		
    @Test
    public void RemoveHoliday() {
    	  Holiday holiday = new Holiday(); 
    	  holiday.addHoliday(12, 25); 
    	  holiday.removeHoliday(12, 25);
    	  assertFalse(holiday.getHolidays().contains(MonthDay.of(12, 25)));
    }	
        
    
    
    
    
    

}
