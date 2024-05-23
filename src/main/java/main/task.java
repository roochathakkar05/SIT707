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
		LocalDate today = LocalDate.now();
		LocalDate mindate = LocalDate.of(2024,1,1);
		if(name == null || name.isEmpty() || name.isBlank() ) {
			throw new IllegalArgumentException("Error: Task name is blank.");
        }
        else if(!status.equals("Not Started")) {
        	throw new IllegalArgumentException("Error: Task status should be 'Not Started' when adding a Task.");
            
        }
        else if(deadline.isBefore(mindate) || deadline.isAfter(today)){
        	throw new IllegalArgumentException("Error: Enter a date between 1-1-2024 and today.");
        }
        else {
            this.taskName = name;
            this.Deadline = deadline;
            this.Status = status;
        }
	}
	public String ChangeStatus(user User,String status) {
		if(User.getRoleOfUser() == "Student") {
			if (status.equalsIgnoreCase("Submitted") || status.equalsIgnoreCase("Not Started")
                    || status.equalsIgnoreCase("Working On It")) {
				this.Status = status;
				return "Successfully";
			}
			else {
				return "Error: This action cannot be performed.";
			}
		}
		else {
			if (status.equalsIgnoreCase("Completed") || status.equalsIgnoreCase("Failed")
                    || status.equalsIgnoreCase("Re-Submit")){
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
	public String ViewDetails() {
    	return this.getTaskName() + " " + this.getDeadline() + " " + this.getStatus();
    }
}
