package kosa.member;

public class Member {
	private String username;
	private String email;
	private String password;
	private String[] hobbies;

	public Member() {
	}

	public Member(String username, String email, String password, String[] hobbies) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.hobbies = hobbies;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

}
