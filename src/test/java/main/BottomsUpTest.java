package main;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

public class BottomsUpTest {
		/*
		 * Level 3 Last Node Change Status and Add Message
		 */
		private Node3DriverClass Node3 = new Node3DriverClass();
	    @Test
	    public void testChangeTaskStatusDriverStudent() {
	        LocalDate deadline = LocalDate.of(2024, 5, 1);
	        task Task = new task("Test Task", deadline, "Not Started");
	        user Student = new user("Roocha","SIT707","pass123");

	        String result = Node3.changeTaskStatusDriver(Task, Student, "Working On It");
	        assertEquals("Successfully", result);
	        assertEquals("Working On It", Task.getStatus());

	        result = Node3.changeTaskStatusDriver(Task, Student, "Completed");
	        assertEquals("Error: This action cannot be performed.", result);
	    }
	    @Test
	    public void testChangeTaskStatusDriverTeacher() {
	        LocalDate deadline = LocalDate.of(2024, 5, 1);
	        task Task = new task("Test Task", deadline, "Not Started");
	        user Teacher = new user("Teacher","pass123");

	        String result = Node3.changeTaskStatusDriver(Task, Teacher, "Completed");
	        assertEquals("Successfully", result);
	        assertEquals("Completed", Task.getStatus());

	        result = Node3.changeTaskStatusDriver(Task, Teacher, "Working On It");
	        assertEquals("Error: This action cannot be performed.", result);
	    }
	    @Test
	    public void testAddMessagesDriver() {
	        LocalDate deadline = LocalDate.of(2024, 5, 1);
	        task Task = new task("Test Task", deadline, "Not Started");
	        user Student = new user("Roocha","SIT707","pass123");
	        message msg = new message(Student, "I need help with this task!");
	        int initialSize = Task.getChat().size();
	        
	        Node3.AddMessageDriver(Task,msg);
	        assertEquals(initialSize + 1, Task.getChat().size());
	        assertTrue(Task.getChat().contains(msg));
	    }
	    @Test(expected = IllegalArgumentException.class)
	    public void testAddMessagesDriverFail() {
	        LocalDate deadline = LocalDate.of(2024, 5, 1);
	        task task = new task("Test Task", deadline, "Not Started");
	        user student = new user("Roocha", "SIT707", "pass123");
	        message msg = new message(student, "");
	        
	        Node3.AddMessageDriver(task, msg);
	    }
		/*
		 * Level 3 Last Node Change Status and Add Message
		 */
	    /*
		 * Level 2 Node Add and Remove Tasks
		 */
	    private Node2DriverClass node2 = new Node2DriverClass();
	    @Test
	    public void testAddTaskDriver() {
	    	user Teacher = new user("Teacher","pass123");
	        String result = node2.addTaskDriver("Test Task 1", LocalDate.of(2024, 5, 1), "Not Started",Teacher);
	        assertEquals("Success", result);
	        assertEquals("Test Task 1", node2.getTasksDriver().get(0).getTaskName());
	    }
	    @Test
	    public void testAddTaskDriverStudentFail() {
	    	user Student = new user("Roocha","SIT707","pass123");
	        String result = node2.addTaskDriver("Test Task 1", LocalDate.of(2024, 5, 1), "Not Started",Student);
	        assertEquals("Error: Your role does not allow this", result);
	        
	    }
	    @Test
	    public void testRemoveTaskDriver() {
	    	user Teacher = new user("Teacher","pass123");
	    	task task = new task("Test Task 1", LocalDate.of(2024, 5, 1), "Not Started");
	        task task2 = new task("Test Task 2", LocalDate.of(2024, 5, 1), "Not Started");
	        String result = node2.removeTaskDriver(task, Teacher);
	        
	        assertEquals("Success", result);
	        assertFalse(node2.getTasksDriver().contains(task));
	        
	    }
	    @Test
	    public void testRemoveTaskDriverStudentFail() {
	    	user Student = new user("Roocha","SIT707","pass123");
	    	task task = new task("Test Task 1", LocalDate.of(2024, 5, 1), "Not Started");
	        task task2 = new task("Test Task 2", LocalDate.of(2024, 5, 1), "Not Started");
	        String result = node2.removeTaskDriver(task, Student);
	        
	        assertEquals("Error: Your role does not allow this", result);
	    }
	    @Test
	    public void testChangeTaskStatusIntegration() {
	    	user Teacher = new user("Teacher","pass123");
	        node2.addTaskDriver("Test Task", LocalDate.of(2024, 5, 1), "Not Started", Teacher);
	        task task = node2.getTasksDriver().get(0);
	        user student = new user("Roocha", "SIT707", "pass123");

	        String result = node2.changeTaskStatusDriver(task, student, "Working On It");
	        assertEquals("Successfully", result);
	        assertEquals("Working On It", task.getStatus());
	    }

	    @Test
	    public void testAddMessageIntegration() {
	    	user Teacher = new user("Teacher","pass123");
	        node2.addTaskDriver("Test Task", LocalDate.of(2024, 5, 1), "Not Started",Teacher);
	        task task = node2.getTasksDriver().get(0);
	        user student = new user("Roocha", "SIT707", "pass123");
	        message msg = new message(student, "I need help with this task!");

	        int initialSize = task.getChat().size();
	        node2.addMessageDriver(task, msg);
	        assertEquals(initialSize + 1, task.getChat().size());
	        assertTrue(task.getChat().contains(msg));
	    }
	    /*
		 * Level 2 Node Add and Remove Tasks
		 */
	    /*
		 * Level 1 Node Login and View All Tasks
		 */
	    private Node1DriverClass node1 = new Node1DriverClass();

	    @Test
	    public void testLoginDriver() {
	        String result = node1.loginDriver("Roocha", "pass123");
	        assertEquals("Login successful", result);

	        result = node1.loginDriver("Roocha", "wrongpass");
	        assertEquals("Login failed", result);
	    }

	    @Test
	    public void testViewAllTasksDriver() {
	    	user Teacher = new user("Teacher","pass123");
	        node1.addTaskDriver("Test Task 1", LocalDate.of(2024, 5, 1), "Not Started", Teacher);
	      
	        assertEquals(1, node1.viewAllTasksDriver().size());
	        assertEquals("Test Task 1", node1.viewAllTasksDriver().get(0).getTaskName());
	    }
	    @Test
	    public void testRemoveTaskIntergrationNode2() {
	    	user Teacher = new user("Teacher","pass123");
	    	task task = new task("Test Task 1", LocalDate.of(2024, 5, 1), "Not Started");
	        task task2 = new task("Test Task 2", LocalDate.of(2024, 5, 1), "Not Started");
	        String result = node1.removeTaskDriver(task2, Teacher);
	        
	        assertEquals("Success", result);
	        assertFalse(node1.viewAllTasksDriver().contains(task2));
	    	
	    }

	    @Test
	    public void testChangeTaskStatusIntegrationNode1() {
	    	user Teacher = new user("Teacher","pass123");
	        node1.addTaskDriver("Test Task", LocalDate.of(2024, 5, 1), "Not Started" , Teacher);
	        task task = node1.viewAllTasksDriver().get(0);
	        user student = new user("Roocha", "SIT707", "pass123");

	        String result = node1.changeTaskStatusDriver(task, student, "Working On It");
	        assertEquals("Successfully", result);
	        assertEquals("Working On It", task.getStatus());
	    }

	    @Test
	    public void testAddMessageIntegrationNode1() {
	    	user Teacher = new user("Teacher","pass123");
	        node1.addTaskDriver("Test Task", LocalDate.of(2024, 5, 1), "Not Started", Teacher);
	        task task = node1.viewAllTasksDriver().get(0);
	        user student = new user("Roocha", "SIT707", "pass123");
	        message msg = new message(student, "I need help with this task!");

	        int initialSize = task.getChat().size();
	        node1.addMessageDriver(task, msg);
	        assertEquals(initialSize + 1, task.getChat().size());
	        assertTrue(task.getChat().contains(msg));
	    }
	    
	}

