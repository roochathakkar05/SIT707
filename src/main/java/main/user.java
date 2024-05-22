package main;

public class user {
	private String NameOfUser;
	private String RoleOfUser;
	private String Subject;
	private String Password;
	
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
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public user(String nameOfUser, String password) {
		this.NameOfUser = nameOfUser;
		this.RoleOfUser = "Teacher";
		this.Password = password;
	}
	
	public user(String nameOfUser,String subject, String password) {
		this.NameOfUser = nameOfUser;
		this.RoleOfUser  = "Student";
		this.Subject = subject;
		this.Password = password;
	}

}
