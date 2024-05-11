package main;

public class user {
	private String NameOfUser;
	private String RoleOfUser;
	private String Subject;
	
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getNameOfUser() {
		return NameOfUser;
	}
	public void setNameOfUser(String nameOfUser) {
		NameOfUser = nameOfUser;
	}
	
	public String getRoleOfUser() {
		return RoleOfUser;
	}
	public void setRoleOfUser(String roleOfUser) {
		RoleOfUser = roleOfUser;
	}
	
	public user(String nameOfUser) {
		this.NameOfUser = nameOfUser;
		this.RoleOfUser = "Teacher";
	}
	
	public user(String nameOfUser,String subject) {
		this.NameOfUser = nameOfUser;
		this.RoleOfUser  = "Student";
		this.Subject = subject;
	}

}
