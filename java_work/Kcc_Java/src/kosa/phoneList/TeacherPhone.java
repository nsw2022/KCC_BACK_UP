package kosa.phoneList;

import java.io.Serializable;

public class TeacherPhone implements Serializable{
	//(name, phoneNo, birth) : �ʵ�
	private String name, phoneNo, birth;
	public TeacherPhone() {}
	public TeacherPhone(String name, String phoneNo, String birth) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
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
