package nsw.pr;

public class PhonInfoPr {
	//(name, phoneNo, birth) : �ʵ�
	private String name, phoneNo, birth;
	public PhonInfoPr() {}
	
	public void show() {
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ��ȣ : "+phoneNo);
		System.out.println("������� : "+birth);
		
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
