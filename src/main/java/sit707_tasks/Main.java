package sit707_tasks;

import java.util.Random;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args )
    {   
        Holiday holidays = new Holiday();
    	/*
    	 * January max boundary area: max-1, max+1
    	 */
    	System.out.println("January max: increment should go to February.");
    	DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January max: decrement should be 30 January.");
    	date = new DateUtil(31, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);
        
        /*
         * January nominal (somewhere between min and max)
         */
        System.out.println("January random day between (1, 31): increment should be 1 day next.");
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        /*
         * January min boundary area: min+1, min-1
         */
        System.out.println("January min: increment should be 2nd January.");
    	date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.increment();
        System.out.println(date);
        
        System.out.println("January min: decrement should be 31 December previous year.");
        date = new DateUtil(1, 1, 2024);
        System.out.println(date);
        date.decrement();
        System.out.println(date);  
        
        /*
         * Adding local Holidays
         */
        System.out.println("Adding New year and Boxing day, Christmas Holiday");

        holidays.addHoliday(12, 26);
        System.out.println(holidays.getHolidays());
        /*
         * Check a Holiday
         */
        System.out.println("Check if the holiday exists");
        date = new DateUtil(1, 1, 2024);
        boolean answer = holidays.isHoliday(date.getMonth(), date.getDay());
        System.out.println(answer);
        date = new DateUtil(7, 6, 2024);
        boolean answer1 = holidays.isHoliday(date.getMonth(), date.getDay());
        System.out.println(answer1);
        
        /*
         * Remove a Holiday
         */
        System.out.println("Remove Boxing Day");
        holidays.removeHoliday(12, 26);
        System.out.println(holidays.getHolidays());
        
        /*
         * Check How many days to the next holiday from x date
         */
        System.out.println("Check how many days to next holiday");
        date = new DateUtil(1, 1, 2024);
        String daystonextholiday = date.daysUntilNextHoliday(holidays);
        System.out.println(daystonextholiday);
    }
}
