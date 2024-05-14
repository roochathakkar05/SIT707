package main;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RightBICEP {
	
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
        sampleTask = new task("Sample Task", LocalDate.of(2024, 5, 10), "Not Started");
        sampleTask2 = new task("Sample Task", LocalDate.of(2024, 5, 11), "Not Started");
    }
    @Test
    public void testViewAllTasks_EmptyTaskList() {
        // Test when the task list is empty
    	taskInbox.ViewAllTasks();
    	assertTrue(taskInbox.getTasks().isEmpty());
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        taskInbox.ViewAllTasks();;
        System.setOut(originalOut);
        assertTrue(outContent.toString().contains("No Tasks Exist"));
        
    }
    @Test
    public void testViewAllTasks_NonEmptyTaskList() {
        // Test when the task list is non-empty
    	int initialSize = taskInbox.getTasks().size();
    	taskInbox.AddNewTask(sampleTask);
    	taskInbox.AddNewTask(sampleTask2);
    	assertEquals(initialSize + 2, taskInbox.getTasks().size());
        assertTrue(taskInbox.getTasks().contains(sampleTask));
        assertTrue(taskInbox.getTasks().contains(sampleTask2));
    }
    @Test
    public void testRemoveTask() {
        taskInbox.AddNewTask(sampleTask);
        taskInbox.AddNewTask(sampleTask2);
        taskInbox.RemoveTask(sampleTask);
        assertFalse(taskInbox.getTasks().contains(sampleTask));
    }
    @Test
    public void testAddNewTask() {
        taskInbox.AddNewTask(sampleTask);
        assertTrue(taskInbox.getTasks().contains(sampleTask));
    }
    @Test
    public void testViewAllTasks_TasksExist() {
    	ArrayList<task> tasks = new ArrayList<>();
    	tasks.add(sampleTask);
    	taskInbox.setTasks(tasks);
        taskInbox.ViewAllTasks();
        assertTrue(taskInbox.getTasks().contains(sampleTask));
    }
    @Test
    public void getUnitName() {
    	String Unit = taskInbox.getUnitName();
    	assertEquals(Unit,"SIT707");
    }
    @Test
    public void setUnitName() {
    	taskInbox.setUnitName("SIT333");
    	String Unit = taskInbox.getUnitName();
    	assertEquals(Unit,"SIT333");
    }
    @Test
    public void testConstructor_MinBoundaryDate() {
        task newTask = new task("Task Name", LocalDate.of(2024, 1, 1), "Not Started");
        assertEquals("Task Name", newTask.getTaskName());
        assertEquals(LocalDate.of(2024, 1, 1), newTask.getDeadline());
        assertEquals("Not Started", newTask.getStatus());
    }
    @Test
    public void testConstructor_MaxBoundaryDate() {
        LocalDate today = LocalDate.now();
        task newTask = new task("Task Name", today, "Not Started");
        assertEquals("Task Name", newTask.getTaskName());
        assertEquals(today, newTask.getDeadline());
        assertEquals("Not Started", newTask.getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_BlankTaskName() {
        new task("", LocalDate.of(2024, 1, 1), "Not Started");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_EmptyTaskName() {
        new task(" ", LocalDate.of(2024, 1, 1), "Not Started");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullTaskName() {
        new task(null, LocalDate.of(2024, 1, 1), "Not Started");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_InvalidStatus() {
        new task("Task Name", LocalDate.of(2024, 1, 1), "In Progress");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_DeadlineBeforeMinDate() {
        new task("Task Name", LocalDate.of(2023, 12, 31), "Not Started");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_DeadlineAfterToday() {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        new task("Task Name", tomorrow, "Not Started");
    }
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
        taskInbox.getTasks().get(0).ViewAllChats();
        assertEquals(initialSize + 2, taskInbox.getTasks().get(0).getChat().size());
        assertTrue(taskInbox.getTasks().get(0).getChat().contains(AddMsg));
        assertTrue(taskInbox.getTasks().get(0).getChat().contains(AddMsg2));
    }
    @Test
    public void setStatus() {
    	taskInbox.AddNewTask(sampleTask);
    	taskInbox.getTasks().get(0).setStatus("Working On It");
    	String status = taskInbox.getTasks().get(0).getStatus();
    	assertEquals(status,"Working On It");
    }
    @Test
    public void setTaskName() {
    	taskInbox.AddNewTask(sampleTask);
    	taskInbox.getTasks().get(0).setTaskName("Changed Name");
    	String taskname = taskInbox.getTasks().get(0).getTaskName();
    	assertEquals(taskname,"Changed Name");
    }
    @Test
    public void setDeadline() {
    	taskInbox.AddNewTask(sampleTask);
    	taskInbox.getTasks().get(0).setDeadline(LocalDate.of(2024, 5, 5));;
    	LocalDate dates = taskInbox.getTasks().get(0).getDeadline();
    	assertEquals(dates,LocalDate.of(2024, 5, 5));
    }
    @Test
    public void setChat() {
    	taskInbox.AddNewTask(sampleTask);
    	ArrayList<message> messages = new ArrayList<>();
        message AddMsg = new message(Student, "I need help with this task.");
        messages.add(AddMsg);
    	taskInbox.getTasks().get(0).setChat(messages);
    	ArrayList<message> actual = taskInbox.getTasks().get(0).getChat();
    	assertEquals(actual,messages);
    }
    @Test
    public void setMessage() {
    	message AddMsg = new message(Student, "I need help with this task.");
    	String expectedMsg = "I manged to sort it.";
    	AddMsg.setMessage(expectedMsg);
    	String actualmsg = AddMsg.getMessage();
    	assertEquals(expectedMsg,actualmsg);
    }
    @Test
    public void setMessageUser() {
    	message AddMsg = new message(Student, "I need help with this task.");
    	user expectedUser = Teacher;
    	AddMsg.setUser(Teacher);
    	user actualuser = AddMsg.getUser();
    	assertEquals(expectedUser,actualuser);
    }
    @Test
    public void setNameOfUser() {
    	String Name = "Changed Name";
    	Student.setNameOfUser(Name);
    	String Actual = Student.getNameOfUser();
    	assertEquals(Name,Actual);
    }
    @Test
    public void setRole() {
    	String Role = "Changed Role";
    	Student.setRoleOfUser(Role);
    	String Actual = Student.getRoleOfUser();
    	assertEquals(Role,Actual);
    }
    @Test
    public void setSubject() {
    	String Subject = "SIT333";
    	Student.setSubject(Subject);
    	String Actual = Student.getSubject();
    	assertEquals(Subject,Actual);
    }
    
    @Test
    public void testAddingViewingTasksPerformance() {
        final float numTasks = 100;
        long totalTime = 0;
        for (int i = 0; i < numTasks; i++) {
            long startTime = System.currentTimeMillis();
            taskInbox.AddNewTask(new task("Task " + i, LocalDate.of(2024, 5, 10), "Not Started"));
            long endTime = System.currentTimeMillis();
            totalTime += (endTime - startTime);
        }
        float averageTime = totalTime / numTasks;
        System.out.println("Average time to add a task: " + averageTime + " ms");
        totalTime = 0;
        for (int i = 0; i < 10; i++) {
            long startTime = System.currentTimeMillis();
            taskInbox.ViewAllTasks();
            long endTime = System.currentTimeMillis();
            totalTime += (endTime - startTime);
        }
        averageTime = totalTime / numTasks;
        System.out.println("Average time to view all tasks: " + averageTime + " ms");
        }
    @Test
    public void testAddingViewingChatsPerformance() {
    	taskInbox.AddNewTask(sampleTask);
        final float numTasks = 100;
        long totalTime = 0;
        for (int i = 0; i < numTasks; i++) {
        	long startTime = System.currentTimeMillis();
        	message AddMsg = new message(Student, "I need help with this task.");
            taskInbox.getTasks().get(0).AddMessage(AddMsg);
            long endTime = System.currentTimeMillis();
            totalTime += (endTime - startTime);
        }
        float averageTime = totalTime / numTasks;
        System.out.println("Average time to add a message: " + averageTime + " ms");
        totalTime = 0;
        for (int i = 0; i < 10; i++) {
            long startTime = System.currentTimeMillis();
            taskInbox.getTasks().get(0).ViewAllChats();
            long endTime = System.currentTimeMillis();
            totalTime += (endTime - startTime);
        }
        averageTime = totalTime / numTasks;
        System.out.println("Average time to view all chats: " + averageTime + " ms");
        }
    }




