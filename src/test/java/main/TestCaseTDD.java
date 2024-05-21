package main;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestCaseTDD {

	private TaskInbox taskInbox;
	private task sampleTask;
	private task sampleTask2;
	private static user Student;
	private static user Teacher;
	    
	@BeforeClass
	public static void CreateUsers() {
	    Student = new user("Roocha","SIT707");
		Teacher = new user("Teacher1");
	}

	@Before
	public void setUp() {
		taskInbox = new TaskInbox();
		sampleTask = new task("Sample Task", LocalDate.of(2024, 4, 15), "Not Started");
		sampleTask2 = new task("Sample Task", LocalDate.of(2024, 4, 18), "Not Started");
	}

	@Test
	public void testNewTask() {
		int initialSize = taskInbox.getTasks().size();
		taskInbox.AddNewTask(sampleTask);
		assertEquals(initialSize + 1, taskInbox.getTasks().size());
		assertEquals(sampleTask, taskInbox.getTasks().get(initialSize));
	}

	@Test
	public void testDeleteTask() {
		taskInbox.AddNewTask(sampleTask);
		taskInbox.AddNewTask(sampleTask2);
		int initialSize = taskInbox.getTasks().size();
		taskInbox.RemoveTask(sampleTask2);
		assertEquals(initialSize - 1, taskInbox.getTasks().size());
		assertFalse(taskInbox.getTasks().contains(sampleTask2));

	}

	@Test
	public void TestViewTasks() {
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
	public void ChangeStatusStudentSubmittedTest() {
		taskInbox.AddNewTask(sampleTask);
		String StatusChangeValueStd = taskInbox.getTasks().get(0).ChangeStatus(Student, "Submitted");
		System.out.println("Status Changed: " + StatusChangeValueStd);
		assertEquals("Successfully", StatusChangeValueStd);
		assertEquals(taskInbox.getTasks().get(0).getStatus(), "Submitted");
	}

	@Test
	public void ChangeStatusStudentCompletedTest() {
		taskInbox.AddNewTask(sampleTask);
		String initialStatus = taskInbox.getTasks().get(0).getStatus();
		String StatusChangeValueStd = taskInbox.getTasks().get(0).ChangeStatus(Student, "Completed");
		System.out.println("Status Changed: " + StatusChangeValueStd);
		assertEquals("Error: This action cannot be performed.", StatusChangeValueStd);
		assertEquals(taskInbox.getTasks().get(0).getStatus(), initialStatus);
	}

	@Test
	public void ChangeStatusTeacherFailedTest() {
		taskInbox.AddNewTask(sampleTask);
		String StatusChangeValueStd = taskInbox.getTasks().get(0).ChangeStatus(Teacher, "Failed");
		System.out.println("Status Changed: " + StatusChangeValueStd);
		assertEquals("Successfully", StatusChangeValueStd);
		assertEquals(taskInbox.getTasks().get(0).getStatus(), "Failed");
	}

	@Test
	public void ChangeStatusTeacherWorkingOnItTest() {
		taskInbox.AddNewTask(sampleTask);
		String initialStatus = taskInbox.getTasks().get(0).getStatus();
		String StatusChangeValueStd = taskInbox.getTasks().get(0).ChangeStatus(Teacher, "Working On It");
		System.out.println("Status Changed: " + StatusChangeValueStd);
		assertEquals("Error: This action cannot be performed.", StatusChangeValueStd);
		assertEquals(taskInbox.getTasks().get(0).getStatus(), initialStatus);
	}

	@Test
	public void AddMessageTest() {
		message AddMsg = new message(Student, "I need help with this task");
		taskInbox.AddNewTask(sampleTask);
		int initialSize = taskInbox.getTasks().get(0).getChat().size();
		taskInbox.getTasks().get(0).AddMessage(AddMsg);
		assertEquals(initialSize + 1, taskInbox.getTasks().get(0).getChat().size());
		assertTrue(taskInbox.getTasks().get(0).getChat().contains(AddMsg));

	}

	@Test
	public void NoChatTest() {
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
	public void TestViewChats() {
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
