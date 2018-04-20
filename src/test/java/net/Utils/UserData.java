package net.Utils;

public class UserData {

	private String userName, email, password;

	
	public UserData generateUserData()
	{
		int randomFactor = (int) (Math.random() * System.currentTimeMillis()) % 9999;
	
		UserData userData = new UserData();
		String name = (new Names()).getName(randomFactor);
		
		userData.setUserName(name);
		userData.setEmail(name+randomFactor+"@yopmail.com");
		userData.setPassword("Abcd123%"+randomFactor);
		return userData;
	}
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
