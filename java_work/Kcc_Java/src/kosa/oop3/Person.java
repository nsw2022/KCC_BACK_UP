package kosa.oop3;

public class Person {
	private Role role;
	private String name;
	
	public Person() {}
	
	public Person(Role role, String name) {
		super();
		this.role = role;
		this.name = name;
	}

	public void doIt() {
		System.out.println("내 이름은 "+name);
		role.doing();
		System.out.println();
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
