package kosa.phone;

public class PhoneInfo {
	
	// 필드
	String name,phoneNo,birth;
	
	// 생성자
	public PhoneInfo() {}

	//메서드 영역
	// 추가
	public void addPhoneInfo(String name, String phoneNo, String birth) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	}
	
	// 출력
	public void listPhoneInfo() {
		System.out.println(">이름 : "+name);
		System.out.println(">전화번호 : "+phoneNo);
		System.out.println(">생년월일 : "+birth);
	}
	
	//검색
	public void searchPhoneInfo(String search) {
		
		if(name.indexOf(search) != -1) {
			System.out.println(">이름 : "+name);
			System.out.println(">전화번호 : "+phoneNo);
			System.out.println(">생년월일 : "+birth);
		}
	}
}
