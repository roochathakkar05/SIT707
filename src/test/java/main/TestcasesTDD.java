package main;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestcasesTDD {

	@Test
	public void test() {
		@Test
	    public void testAddNewTask() {
	        int initialSize = taskInbox.getTasks().size();
	        taskInbox.AddNewTask(sampleTask);
	        assertEquals(initialSize + 1, taskInbox.getTasks().size());
	        assertEquals(sampleTask, taskInbox.getTasks().get(initialSize));
	    }
	    
	    @Test
	    public void testRemoveTask() {
	    	taskInbox.AddNewTask(sampleTask);
	    	taskInbox.AddNewTask(sampleTask2);
	    	int initialSize = taskInbox.getTasks().size();
	    	taskInbox.RemoveTask(sampleTask2);
	    	assertEquals(initialSize - 1, taskInbox.getTasks().size());
	    	assertFalse(taskInbox.getTasks().contains(sampleTask2));
	    	
	    }

	    @Test
	    public void testGetUnitName() {
	        assertEquals("SIT707", taskInbox.getUnitName());
	    }
	    
	    @Test
	    public void TestViewAllTasks() {
	    	int initialSize = taskInbox.getTasks().size();
	        taskInbox.AddNewTask(sampleTask);
	        taskInbox.AddNewTask(sampleTask2);      
	        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	        PrintStream originalOut = System.out;
	        System.setOut(new PrintStream(outContent));
	        taskInbox.ViewAllTasks();
	        System.setOut(originalOut);
	        assertEquals(initialSize + 2, taskInbox.getTasks().size());
	        assertTrue(taskInbox.getTasks().contains(sampleTask));
	        assertTrue(taskInbox.getTasks().contains(sampleTask2));
	    }

	    @Test
	    public void testSetUnitName() {
	        taskInbox.setUnitName("SIT333");
	        assertEquals("SIT333", taskInbox.getUnitName());
	    }
	    /*
	     * Test Task Inbox
	     */
	    /*
	     * Test Task 
	     */
	    @Test
	    public void ChangeStatusStudentSucessTest() {
	    	taskInbox.AddNewTask(sampleTask);
			String StatusChangeValueStd = taskInbox.getTasks().get(0).ChangeStatus(Student, "Submitted");
			System.out.println("Status Changed: "+ StatusChangeValueStd);
			assertEquals("Successfully",StatusChangeValueStd);
			assertEquals(taskInbox.getTasks().get(0).getStatus(),"Submitted");
	    }
	    @Test
	    public void ChangeStatusStudentFailedTest() {
	    	taskInbox.AddNewTask(sampleTask);
	    	String initialStatus = taskInbox.getTasks().get(0).getStatus();
			String StatusChangeValueStd = taskInbox.getTasks().get(0).ChangeStatus(Student, "Completed");
			System.out.println("Status Changed: "+ StatusChangeValueStd);
			assertEquals("Error: This action cannot be performed.",StatusChangeValueStd);
			assertEquals(taskInbox.getTasks().get(0).getStatus(),initialStatus);
	    }
	    @Test
	    public void ChangeStatusTeacherSucessTest() {
	    	taskInbox.AddNewTask(sampleTask);
			String StatusChangeValueStd = taskInbox.getTasks().get(0).ChangeStatus(Teacher, "Failed");
			System.out.println("Status Changed: "+ StatusChangeValueStd);
			assertEquals("Successfully",StatusChangeValueStd);
			assertEquals(taskInbox.getTasks().get(0).getStatus(),"Failed");
	    }
	    @Test
	    public void ChangeStatusTeacherFailedTest() {
	    	taskInbox.AddNewTask(sampleTask);
	    	String initialStatus = taskInbox.getTasks().get(0).getStatus();
			String StatusChangeValueStd = taskInbox.getTasks().get(0).ChangeStatus(Teacher, "Working On It");
			System.out.println("Status Changed: "+ StatusChangeValueStd);
			assertEquals("Error: This action cannot be performed.",StatusChangeValueStd);
			assertEquals(taskInbox.getTasks().get(0).getStatus(),initialStatus);
	    }
	    @Test
	    public void TestAddMessage() {
	    	message AddMsg = new message(Student, "I need help with this task");
	    	taskInbox.AddNewTask(sampleTask);
	    	int initialSize = taskInbox.getTasks().get(0).getChat().size();
	    	taskInbox.getTasks().get(0).AddMessage(AddMsg);
	    	assertEquals(initialSize + 1, taskInbox.getTasks().get(0).getChat().size());
	    	assertTrue(taskInbox.getTasks().get(0).getChat().contains(AddMsg));
	    	
	    }
	    @Test
	    public void EmptyChatTest() {
	    	taskInbox.AddNewTask(sampleTask);
	        assertTrue(taskInbox.getTasks().get(0).getChat().isEmpty());
	        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	        PrintStream originalOut = System.out;
	        System.setOut(new PrintStream(outContent));
	        taskInbox.getTasks().get(0).ViewAllChats();
	        System.setOut(originalOut);
	        assertTrue(outContent.toString().contains("No Conversation to Display"));
	    	
	    }
	    @Test
	    public void TestViewAllChats() {
	        message AddMsg = new message(Student, "I need help with this task.");
	        message AddMsg2 = new message(Teacher, "Sure! What part are you confused with?");
	        taskInbox.AddNewTask(sampleTask);
	        int initialSize = taskInbox.getTasks().get(0).getChat().size();
	        taskInbox.getTasks().get(0).AddMessage(AddMsg);
	        taskInbox.getTasks().get(0).AddMessage(AddMsg2);
	        assertEquals(initialSize + 2, taskInbox.getTasks().get(0).getChat().size());
	        assertTrue(taskInbox.getTasks().get(0).getChat().contains(AddMsg));
	        assertTrue(taskInbox.getTasks().get(0).getChat().contains(AddMsg2));
	    }
	    

	}
