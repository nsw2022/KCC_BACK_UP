package nsw.pr;

public class PhonInfoPr {
	//(name, phoneNo, birth) : 필드
	private String name, phoneNo, birth;
	public PhonInfoPr() {}
	
	public void show() {
		System.out.println("이름 : "+name);
		System.out.println("전화번호 : "+phoneNo);
		System.out.println("생년월일 : "+birth);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
}
