package sit707_tasks;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class EquivilanceTest {

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
	
	
	/*TEST D1M1Y1*/
	@Test
	public void TestD1M1Y1Increment() {
	    DateUtil date = new DateUtil(5, 4, 2019);
	    System.out.println("TestD1M1Y1Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(6, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	@Test
	public void TestD1M1Y1Decrement() {
	    DateUtil date = new DateUtil(5, 4, 2019);
	    System.out.println("TestD1M1Y1Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(4, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	/*TEST D1M1Y1*/
	/*TEST D2M1Y1*/
	@Test
	public void TestD2M1Y1Increment() {
	    DateUtil date = new DateUtil(29, 6, 2019);
	    System.out.println("TestD2M1Y1Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	@Test
	public void TestD2M1Y1Decrement() {
	    DateUtil date = new DateUtil(29, 6, 2019);
	    System.out.println("TestD2M1Y1Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(28, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	/*TEST D2M1Y1*/
	/*TEST D3M1Y1*/
	@Test
	public void TestD3M1Y1Increment() {
	    DateUtil date = new DateUtil(30, 9, 2019);
	    System.out.println("TestD3M1Y1Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	@Test
	public void TestD3M1Y1Decrement() {
	    DateUtil date = new DateUtil(30, 9, 2019);
	    System.out.println("TestD3M1Y1Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	/*TEST D3M1Y1*/
	
	
	/*TEST D1M2Y1*/
	@Test
	public void TestD1M2Y1Increment() {
	    DateUtil date = new DateUtil(1, 1, 2019);
	    System.out.println("TestD1M1Y1Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	@Test
	public void TestD1M2Y1Decrement() {
	    DateUtil date = new DateUtil(1, 1, 2019);
	    System.out.println("TestD1M1Y1Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(2018, date.getYear());
	}
	/*TEST D1M2Y1*/
	/*TEST D2M2Y1*/
	@Test
	public void TestD2M2Y1Increment() {
	    DateUtil date = new DateUtil(29, 3, 2019);
	    System.out.println("TestD2M2Y1Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	@Test
	public void TestD2M2Y1Decrement() {
	    DateUtil date = new DateUtil(29, 3, 2019);
	    System.out.println("TestD2M2Y1Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(28, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	/*TEST D2M2Y1*/
	/*TEST D3M2Y1*/
	@Test
	public void TestD3M2Y1Increment() {
	    DateUtil date = new DateUtil(30, 5, 2019);
	    System.out.println("TestD3M2Y1Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	@Test
	public void TestD3M2Y1Decrement() {
	    DateUtil date = new DateUtil(30, 5, 2019);
	    System.out.println("TestD3M2Y1Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	/*TEST D3M2Y1*/
	/*TEST D4M2Y1*/
	/*TEST D3M2Y1*/
	/*TEST D4M2Y1*/
	@Test
	public void TestD4M2Y1Increment() {
	    DateUtil date = new DateUtil(31, 7, 2019);
	    System.out.println("TestD4M2Y1Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	@Test
	public void TestD4M2Y1Decrement() {
	    DateUtil date = new DateUtil(31, 7, 2019);
	    System.out.println("TestD3M1Y1Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(2019, date.getYear());
	}
	/*TEST D4M2Y1*/
	
	
	/*TEST D1M3Y1*/
	@Test
	public void TestD1M3Y1Increment() {
	    DateUtil date = new DateUtil(28, 2, 2023);
	    System.out.println("TestD1M1Y1Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(2023, date.getYear());
	}
	@Test
	public void TestD1M3Y1Decrement() {
	    DateUtil date = new DateUtil(28, 2, 2023);
	    System.out.println("TestD1M3Y1Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(27, date.getDay());
	    Assert.assertEquals(2023, date.getYear());
	}
	/*TEST D1M3Y1*/
	/*TEST D2M1Y1*/
	/*TEST D1M3Y1*/
	/*TEST D1M3Y2*/
	@Test
	public void TestD1M3Y2Increment() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("TestD2M2Y1Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	@Test
	public void TestD1M3Y2Decrement() {
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("TestD1M3Y2Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(27, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	/*TEST D1M3Y2*/
	/*TEST D2M3Y2*/
	@Test
	public void TestD2M3Y2Increment() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("TestD2M3Y2Increment > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	@Test
	public void TestD2M3Y2Decrement() {
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("TestD2M3Y2Decrement > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(28, date.getDay());
	    Assert.assertEquals(2024, date.getYear());
	}
	/*TEST D2M3Y2*/
}
