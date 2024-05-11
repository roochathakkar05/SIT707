package main;

import java.util.ArrayList;
import java.time.LocalDate;

public class task {
	private String taskName;
	private LocalDate Deadline; 
	private String Status; 
	private ArrayList<message> Chat = new ArrayList<>();
	
	public ArrayList<message> getChat() {
		return Chat;
	}
	public void setChat(ArrayList<message> chat) {
		Chat = chat;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDate getDeadline() {
		return Deadline;
	}
	public void setDeadline(LocalDate deadline) {
		Deadline = deadline;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public task(String name, LocalDate deadline, String status) {
		this.taskName = name;
		this.Deadline = deadline;
		this.Status = status;
	}
	public String ChangeStatus(user User,String status) {
		if(User.getRoleOfUser() == "Student") {
			if(status == "Submitted" || status == "Not Started" || status == "Working On It") {
				this.Status = status;
				return "Successfully";
			}
			else {
				return "Error: This action cannot be performed.";
			}
		}
		else {
			if(status == "Completed" || status == "Failed" || status == "Re-Submit") {
				this.Status = status;
				return "Successfully";
			}
			else {
				return "Error: This action cannot be performed.";
			}
			
		}
	}
	public void AddMessage(message msg) {
		Chat.add(msg);
	}
	public void ViewAllChats() {
		if (Chat.isEmpty()) {
			System.out.println("Chatbox "+"- "+this.taskName);
			System.out.println("No Conversation to Display");
		}
		else 
		{
			System.out.println("Chatbox "+"- "+this.taskName);
			for(int i=0; i< Chat.size(); i++) 
			{
				System.out.println(Chat.get(i).getUser().getNameOfUser());
				System.out.println(Chat.get(i).getUser().getRoleOfUser());
				System.out.println(Chat.get(i).getMessage());
			}
		}
		
	}

}
