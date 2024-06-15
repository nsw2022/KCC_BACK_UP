package kosa.hrMiniPro.humanResources;

// 구직자
public class Jopseeker {
	// 구직자의 이름 나이 직종을 받음
	// 이력서는 스킵했다하자
	private String name, age, occupation;
	
	public Jopseeker() {}

	public Jopseeker(String name, String age, String occupation) {
		super();
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	

}
