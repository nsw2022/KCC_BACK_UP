package kosa.phone;

public class PhoneInfo {
	
	// �ʵ�
	String name,phoneNo,birth;
	
	// ������
	public PhoneInfo() {}

	//�޼��� ����
	// �߰�
	public void addPhoneInfo(String name, String phoneNo, String birth) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	// ���
	public void listPhoneInfo() {
		System.out.println(">�̸� : "+name);
		System.out.println(">��ȭ��ȣ : "+phoneNo);
		System.out.println(">������� : "+birth);
	}
	
	//�˻�
	public void searchPhoneInfo(String search) {
		
		if(name.indexOf(search) != -1) {
			System.out.println(">�̸� : "+name);
			System.out.println(">��ȭ��ȣ : "+phoneNo);
			System.out.println(">������� : "+birth);
		}
	}
}
