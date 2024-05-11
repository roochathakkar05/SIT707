package main;

import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		//Create a Task Inbox
		TaskInbox TaskBox = new TaskInbox();
		task Task1 = new task("Task 1.1P",LocalDate.of(2024, 5, 10),"Not-Started");
		task Task2 = new task("Task 2.1P",LocalDate.of(2024, 5, 20),"Not-Started");
		task Task3 = new task("Task 3.1P",LocalDate.of(2024, 5, 30),"Not-Started");
		task Task4 = new task("Task 4.1P",LocalDate.of(2024, 6, 10),"Not-Started");
		TaskBox.AddNewTask(Task1);
		TaskBox.AddNewTask(Task2);
		TaskBox.AddNewTask(Task3);
		TaskBox.AddNewTask(Task4);
		//Create a Task Inbox
		//Create users
		user Student = new user("Roocha","SIT707");
		user Teacher = new user("Teacher1");
		//Create users
		//Interactions
		//List Tasks
		TaskBox.ViewAllTasks();
		//Change Status
		String StatusChangeValue = TaskBox.getTasks().get(2).ChangeStatus(Teacher, "Completed");
		System.out.println("Status Changed: "+ StatusChangeValue);
		String StatusChangeValueStd = TaskBox.getTasks().get(3).ChangeStatus(Student, "Submitted");
		System.out.println("Status Changed: "+ StatusChangeValueStd);
		String StatusChangeValueIC = TaskBox.getTasks().get(2).ChangeStatus(Teacher, "Submitted");
		System.out.println("Status Changed: "+ StatusChangeValueIC);
		String StatusChangeValueStdIC = TaskBox.getTasks().get(3).ChangeStatus(Student, "Completed");
		System.out.println("Status Changed: "+ StatusChangeValueStdIC);
		TaskBox.ViewAllTasks();
		//Add New Task
		task Task5 = new task("Task 5.1P",LocalDate.of(2024, 6, 20),"Not-Started");
		TaskBox.AddNewTask(Task5);
		TaskBox.ViewAllTasks();
		//Remove Task
		TaskBox.RemoveTask(Task2);
		TaskBox.ViewAllTasks();
		//Add a new Message
		message StdMsg = new message(Student,"I am having an issue sorting out this task. Please Help");
		message TMsg = new message(Teacher,"Sure. How can i help?");
		TaskBox.getTasks().get(2).AddMessage(StdMsg);
		TaskBox.getTasks().get(2).AddMessage(TMsg);
		//Get Chat
		TaskBox.getTasks().get(1).ViewAllChats();
	}

}
