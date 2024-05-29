package kosa.oop;

public class Member {
	// 회원정보에 대한 클래스와 객체를 생성후 출력해 봅시다
	// 상태, 행동 구성
	String userId, userName;
	int userAge, kor, eng, mat;
		
	public Member() {
		this("00", "관리자", 100);
	}

	public Member(String userId, String userName, int userAge) {
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
	}
	public Member(String userId, String userName, int userAge, int kor, int eng, int mat) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public void show() {
		System.out.printf("유저 아이디 : %s, 유저 이름 : %s, 유저 나이 : %d\n",userId,userName,userAge);
	}
	public String result() {
		int result=eng+kor+mat;
		System.out.println((result/3));
		System.out.println(((result/3)/10)%10);
		return "FFFFFFDCBA".charAt(((result/3)/10)%10)+"";
	}

	

}
