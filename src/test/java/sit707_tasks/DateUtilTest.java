package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
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
	/*January*/
	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
		
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january1ShouldIncrementToJanuary2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2, date.getDay());
		
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("January1ShouldDecrementToDecember31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(31, date.getDay());
	}
	/*January*/
	/*February*/
	@Test
	public void testMaxFebruary28ShouldIncrementToMarch1() {
		// February max boundary area: max+1
		DateUtil date = new DateUtil(28, 2, 2023);
        System.out.println("February28ShouldIncrementToMarch1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	/***Leap Year***/
	public void testMaxFebruary28ShouldIncrementToFebruary29() {
		// February max boundary area: max+1
		DateUtil date = new DateUtil(28, 2, 2024);
        System.out.println("February28ShouldIncrementToFebruary29 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(29, date.getDay());
	}
	/***Leap Year***/
	@Test
	public void testMaxFebruary28ShouldDecrementToFebruary27() {
		// February max boundary area: max-1
		DateUtil date = new DateUtil(28, 2, 2024);
        System.out.println("February28ShouldDecrementToFebruary27 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(27, date.getDay());
        Assert.assertEquals(2, date.getMonth());
	}
	/***Leap Year***/
	@Test
	public void testMaxFebruary29ShouldDecrementToFebruary28() {
		// February max boundary area: max-1
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("February29ShouldDecrementToFebruary28 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
	}
	/***Leap Year***/
	@Test
	public void testNominalFebruary() {
		int rand_day_1_to_28 = 1 + new Random().nextInt(28);
        DateUtil date = new DateUtil(rand_day_1_to_28, 2, 2024);
        System.out.println("testFebruaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	/***Leap Year***/
	@Test
	public void testNominalFebruaryLeap() {
		int rand_day_1_to_29 = 1 + new Random().nextInt(29);
        DateUtil date = new DateUtil(rand_day_1_to_29, 2, 2024);
        System.out.println("testFebruaryNominalLeap > " + date);
        date.increment();
        System.out.println(date);
	}
	/***Leap Year***/	
	@Test
	public void testMinFebruary1ShouldIncrementToFebruary2() {
		// Code here
		DateUtil date = new DateUtil(1, 2, 2024);
        System.out.println("February1ShouldIncrementToFebruary2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2, date.getDay());
		
	}
	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31() {
		// Code here
		DateUtil date = new DateUtil(1, 2, 2024);
        System.out.println("February1ShouldDecrementToJanuary31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(31, date.getDay());
	}
	/*February*/
	/*March*/
	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
	    // March max boundary area: max+1
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("march31ShouldIncrementToApril1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
	    // March max boundary area: max-1
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("march31ShouldDecrementToMarch30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	}

	@Test
	public void testNominalMarch() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
	    System.out.println("testMarchNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinMarch1ShouldIncrementToMarch2() {
	    DateUtil date = new DateUtil(1, 3, 2024);
	    System.out.println("march1ShouldIncrementToMarch2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinMarch1ShouldDecrementToFebruary28() {
	    DateUtil date = new DateUtil(1, 3, 2023);
	    System.out.println("march1ShouldDecrementToFebruary28 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(28, date.getDay());
	}
	/***Leap Year***/	
	@Test
	public void testMinMarch1ShouldDecrementToFebruary29() {
	    DateUtil date = new DateUtil(1, 3, 2024);
	    System.out.println("march1ShouldDecrementToFebruary29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(29, date.getDay());
	}
	/***Leap Year***/	
	/*March*/
	/*April*/
	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
	    // April max boundary area: max+1
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("april30ShouldIncrementToMay1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxApril30ShouldDecrementToApril29() {
	    // April max boundary area: max-1
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("april30ShouldDecrementToApril29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	}

	@Test
	public void testNominalApril() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
	    System.out.println("testAprilNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinApril1ShouldIncrementToApril2() {
	    DateUtil date = new DateUtil(1, 4, 2024);
	    System.out.println("april1ShouldIncrementToApril2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinApril1ShouldDecrementToMarch31() {
	    DateUtil date = new DateUtil(1, 4, 2024);
	    System.out.println("april1ShouldDecrementToMarch31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}
	/*April*/
	/*May*/
	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
	    // May max boundary area: max+1
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("may31ShouldIncrementToJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxMay31ShouldDecrementToMay30() {
	    // May max boundary area: max-1
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("may31ShouldDecrementToMay30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	}

	@Test
	public void testNominalMay() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
	    System.out.println("testMayNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinMay1ShouldIncrementToMay2() {
	    DateUtil date = new DateUtil(1, 5, 2024);
	    System.out.println("may1ShouldIncrementToMay2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinMay1ShouldDecrementToApril30() {
	    DateUtil date = new DateUtil(1, 5, 2024);
	    System.out.println("may1ShouldDecrementToApril30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	}
	/*May*/
	/*June*/
	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
	    // June max boundary area: max+1
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("june30ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJune30ShouldDecrementToJune29() {
	    // June max boundary area: max-1
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("june30ShouldDecrementToJune29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	}

	@Test
	public void testNominalJune() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
	    System.out.println("testJuneNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinJune1ShouldIncrementToJune2() {
	    DateUtil date = new DateUtil(1, 6, 2024);
	    System.out.println("june1ShouldIncrementToJune2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinJune1ShouldDecrementToMay31() {
	    DateUtil date = new DateUtil(1, 6, 2024);
	    System.out.println("june1ShouldDecrementToMay31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}
	/*June*/
	/*July*/
	@Test
	public void testMaxJuly31ShouldIncrementToAugust1() {
	    // July max boundary area: max+1
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("july31ShouldIncrementToAugust1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxJuly31ShouldDecrementToJuly30() {
	    // July max boundary area: max-1
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("july31ShouldDecrementToJuly30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	}

	@Test
	public void testNominalJuly() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
	    System.out.println("testJulyNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinJuly1ShouldIncrementToJuly2() {
	    DateUtil date = new DateUtil(1, 7, 2024);
	    System.out.println("july1ShouldIncrementToJuly2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinJuly1ShouldDecrementToJune30() {
	    DateUtil date = new DateUtil(1, 7, 2024);
	    System.out.println("july1ShouldDecrementToJune30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	}
	/*July*/
	/*August*/
	@Test
	public void testMaxAugust31ShouldIncrementToSeptember1() {
	    // August max boundary area: max+1
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("august31ShouldIncrementToSeptember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxAugust31ShouldDecrementToAugust30() {
	    // August max boundary area: max-1
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("august31ShouldDecrementToAugust30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	}

	@Test
	public void testNominalAugust() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
	    System.out.println("testAugustNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinAugust1ShouldIncrementToAugust2() {
	    DateUtil date = new DateUtil(1, 8, 2024);
	    System.out.println("august1ShouldIncrementToAugust2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinAugust1ShouldDecrementToJuly31() {
	    DateUtil date = new DateUtil(1, 8, 2024);
	    System.out.println("august1ShouldDecrementToJuly31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}
	/*August*/
	/*September*/
	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
	    // September max boundary area: max+1
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("september30ShouldIncrementToOctober1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxSeptember30ShouldDecrementToSeptember29() {
	    // September max boundary area: max-1
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("september30ShouldDecrementToSeptember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	}

	@Test
	public void testNominalSeptember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 9, 2024);
	    System.out.println("testSeptemberNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinSeptember1ShouldIncrementToSeptember2() {
	    DateUtil date = new DateUtil(1, 9, 2024);
	    System.out.println("september1ShouldIncrementToSeptember2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinSeptember1ShouldDecrementToAugust31() {
	    DateUtil date = new DateUtil(1, 9, 2024);
	    System.out.println("september1ShouldDecrementToAugust31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}
	/*September*/
	/*October*/
	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
	    // October max boundary area: max+1
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("october31ShouldIncrementToNovember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxOctober31ShouldDecrementToOctober30() {
	    // October max boundary area: max-1
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("october31ShouldDecrementToOctober30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	}

	@Test
	public void testNominalOctober() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
	    System.out.println("testOctoberNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinOctober1ShouldIncrementToOctober2() {
	    DateUtil date = new DateUtil(1, 10, 2024);
	    System.out.println("october1ShouldIncrementToOctober2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinOctober1ShouldDecrementToSeptember30() {
	    DateUtil date = new DateUtil(1, 10, 2024);
	    System.out.println("october1ShouldDecrementToSeptember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	}
	/*October*/
	/*November*/
	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
	    // November max boundary area: max+1
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("november30ShouldIncrementToDecember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxNovember30ShouldDecrementToNovember29() {
	    // November max boundary area: max-1
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("november30ShouldDecrementToNovember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	}

	@Test
	public void testNominalNovember() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
	    System.out.println("testNovemberNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinNovember1ShouldIncrementToNovember2() {
	    DateUtil date = new DateUtil(1, 11, 2024);
	    System.out.println("november1ShouldIncrementToNovember2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinNovember1ShouldDecrementToOctober31() {
	    DateUtil date = new DateUtil(1, 11, 2024);
	    System.out.println("november1ShouldDecrementToOctober31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	}
	/*November*/
	/*December*/
	@Test
	public void testMaxDecember31ShouldIncrementToJanuary1() {
	    // December max boundary area: max+1
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("december31ShouldIncrementToJanuary1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	}

	@Test
	public void testMaxDecember31ShouldDecrementToDecember30() {
	    // December max boundary area: max-1
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("december31ShouldDecrementToDecember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}

	@Test
	public void testNominalDecember() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
	    System.out.println("testDecemberNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}

	@Test
	public void testMinDecember1ShouldIncrementToDecember2() {
	    DateUtil date = new DateUtil(1, 12, 2024);
	    System.out.println("december1ShouldIncrementToDecember2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinDecember1ShouldDecrementToNovember30() {
	    DateUtil date = new DateUtil(1, 12, 2024);
	    System.out.println("december1ShouldDecrementToNovember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	}
	/*December*/
	
	/**TestCases**/
	public void Test1B() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("Test1B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	public void Test2B() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("Test2B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	public void Test3B() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("Test3B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	public void Test4B() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("Test4B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	public void Test5B() {
	    DateUtil date = new DateUtil(31, 6, 1994);
	    System.out.println("Test5B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	public void Test6B() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("Test6B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	public void Test7B() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("Test7B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	public void Test8B() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("Test8B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	public void Test9B() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("Test9B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	public void Test10B() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("Test10B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1700, date.getYear());
	}
	public void Test11B() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("Test11B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1701, date.getYear());
	}
	public void Test12B() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("Test12B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2023, date.getYear());
	}
	public void Test13B() {
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("Test13B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	

	
	

}
