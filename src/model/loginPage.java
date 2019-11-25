package model;

public class loginPage {

	private int id;
	private String userName;
	private String password;
	private boolean valid;

	public loginPage(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	public loginPage(boolean valid) {
		super();
		this.valid = valid;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	@Override
	public String toString() {
		return "logingPage [id=" + id + ", userName=" + userName + ", password=" + password + ", valid=" + valid + "]";
	}
	
	
	
	
	
}
