package main;

import java.util.List;

public class Node3DriverClass {
    public String changeTaskStatusDriver(task Task, user User, String status) {
        return Task.ChangeStatus(User, status);
    }
    public void AddMessageDriver(task Task, message Message) {
        Task.AddMessage(Message);
    }
    public List<message> ViewMessageDriver(task Task) {
        return Task.getChat();
    }
    public String ViewSelectedTask(task Task) {
    	return Task.ViewDetails();
    }

}
