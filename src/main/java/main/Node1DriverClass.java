package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Node1DriverClass {
	private Node2DriverClass node2 = new Node2DriverClass();
    private List<user> users = new ArrayList<>();

    public Node1DriverClass() {
        // Initialize with some users
        users.add(new user("Roocha", "SIT707", "pass123"));
        users.add(new user("Teacher", "pass123"));
    }
    
    public List<task> viewAllTasksDriver() {
        return node2.getTasksDriver();
    }

    public String loginDriver(String username, String password) {
        for (user userr : users) {
            if (userr.getNameOfUser().equals(username) && userr.getPassword().equals(password)) {
                return "Login successful";
            }
        }
        return "Login failed";
    }

    // Integrate with Node2DriverClass
    public String addTaskDriver(String title, LocalDate deadline, String status, user User) {
        return node2.addTaskDriver(title, deadline, status, User);
    }
    
    public String removeTaskDriver(task Task, user User) {
        return node2.removeTaskDriver(Task, User);
    }

    public String changeTaskStatusDriver(task task, user user, String status) {
        return node2.changeTaskStatusDriver(task, user, status);
    }

    public void addMessageDriver(task task, message message) {
        node2.addMessageDriver(task, message);
    }
	 public List<message> ViewMessageDriver(task Task) {
	        return node2.ViewMessageDriver(Task);
	 }
    public String ViewSelectedTaskDriver(task Task) {
    	return node2.ViewSelectedTaskDriver(Task);
    }

}
