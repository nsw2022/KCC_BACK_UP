package mission.model;

public class User {
	private String userId;
	private String password;
	private String email;
	private String fullName;

	public User() {}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public User(String userId, String password, String email, String fullName) {
		super();
		this.userId = userId;
		this.password = password;
		this.email = email;
		this.fullName = fullName;
	}

}