package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Node2DriverClass {
	private TaskInbox taskInbox = new TaskInbox();
	private Node3DriverClass node3 = new Node3DriverClass();
	
	public String addTaskDriver(String title, LocalDate deadline, String status, user User) {
	        task task = new task(title, deadline, status);
	        String result = taskInbox.AddNewTask(task,User);
	        return result;
	 }
	 public String removeTaskDriver(task Task, user User) {
		 	String result = taskInbox.RemoveTask(Task,User);
	        return result;
	 }
	 public List<task> getTasksDriver() {
	        return taskInbox.getTasks();
	 }
	 public String changeTaskStatusDriver(task task, user user, String status) {
	        return node3.changeTaskStatusDriver(task, user, status);
	 }
	 public void addMessageDriver(task task, message message) {
	        node3.AddMessageDriver(task, message);
	 }
	 public List<message> ViewMessageDriver(task Task) {
	        return node3.ViewMessageDriver(Task);
	 }
	 public String ViewSelectedTaskDriver(task Task) {
	    	return node3.ViewSelectedTask(Task);
	 }
	
}
