package main;

public class Node3DriverClass {
    public String changeTaskStatusDriver(task Task, user User, String status) {
        return Task.ChangeStatus(User, status);
    }
    public void AddMessageDriver(task Task, message Message) {
        Task.AddMessage(Message);
    }

}
