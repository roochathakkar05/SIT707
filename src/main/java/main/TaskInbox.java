package main;

import java.util.ArrayList;

public class TaskInbox {
	private String UnitName = "SIT707";
	private ArrayList<task> Tasks = new ArrayList<>();

	public ArrayList<task> getTasks() {
		return Tasks;
	}

	public void setTasks(ArrayList<task> tasks) {
		Tasks = tasks;
	}

	public String getUnitName() {
		return UnitName;
	}

	public void setUnitName(String unitName) {
		UnitName = unitName;
	}

	public TaskInbox() { }
	
	public void ViewAllTasks() {
		System.out.println("All Tasks");
		if(Tasks.isEmpty()) {
			System.out.println("No Tasks Exist");
		}
		else {	
			//System.out.println("  Task Name    Status         Deadline");
			for(int i=0; i< Tasks.size(); i++) {
				System.out.println(i+ " " + Tasks.get(i).getTaskName()+" "+Tasks.get(i).getStatus()+" "+Tasks.get(i).getDeadline());
			}
		}
		
	}
	public String AddNewTask(task NewTask, user User) {
		if(User.getRoleOfUser() == "Teacher") {
			Tasks.add(NewTask);
			return "Success";
		}
		else {
			return "Error: Your role does not allow this";
		}
	}
	public String RemoveTask(task TasktoRemove, user User) {
		if(User.getRoleOfUser() == "Teacher") {
			Tasks.remove(TasktoRemove);
			return "Success";
		}
		else {
			return "Error: Your role does not allow this";
		}
	}
	
	

}
