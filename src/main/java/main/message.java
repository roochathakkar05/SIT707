package main;

public class message {
	private String Message;
	private user User;
	
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public user getUser() {
		return User;
	}
	public void setUser(user user) {
		User = user;
	}
	public message(user usser, String msg) {
		this.Message = msg;
		this.User = usser;
	}
	

}
