package model_p;

public class UsersDTO {
	private String userId;
	private String password;
	private String email;
	private String name;

	public UsersDTO() {}

	public UsersDTO(String userId, String password, String email, String name) {
		super();
		this.userId = userId;
		this.password = password;
		this.email = email;
		this.name = name;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
