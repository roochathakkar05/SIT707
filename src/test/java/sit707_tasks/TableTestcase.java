package sit707_tasks;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TableTestcase {
	/**TestCases**/
	@Test
	public void Test1B() {
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("Test1B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	@Test
	public void Test2B() {
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("Test2B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	@Test
	public void Test3B() {
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("Test3B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	@Test
	public void Test4B() {
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("Test4B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	@Test
	public void Test5B() {
	    try 
	    {
	    	DateUtil date = new DateUtil(31, 6, 1994);
	    	date.increment();
	    	System.out.println(date);
	    	Assert.fail("Expected RuntimeException was not thrown");
	    }
	    catch(RuntimeException e) 
	    {
	    	System.out.println("Test5B > ");
	    	System.out.println("Invalid Date");
	    	String expectedErrorMessage = "Invalid day: 31, max day: 30";
            Assert.assertEquals(expectedErrorMessage, e.getMessage());
	    }
	}
	@Test
	public void Test6B() {
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("Test6B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	@Test
	public void Test7B() {
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("Test7B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	@Test
	public void Test8B() {
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("Test8B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	@Test
	public void Test9B() {
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("Test9B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1994, date.getYear());
	}
	@Test
	public void Test10B() {
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("Test10B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1700, date.getYear());
	}
	@Test
	public void Test11B() {
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("Test11B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1701, date.getYear());
	}
	@Test
	public void Test12B() {
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("Test12B > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2023, date.getYear());
	}
	@Test
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
