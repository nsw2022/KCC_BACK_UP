package kosa.oop;

public class Member {
	// ȸ�������� ���� Ŭ������ ��ü�� ������ ����� ���ô�
	// ����, �ൿ ����
	String userId, userName;
	int userAge, kor, eng, mat;
		
	public Member() {
		this("00", "������", 100);
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
		System.out.printf("���� ���̵� : %s, ���� �̸� : %s, ���� ���� : %d\n",userId,userName,userAge);
	}
	public String result() {
		int result=eng+kor+mat;
		System.out.println((result/3));
		System.out.println(((result/3)/10)%10);
		return "FFFFFFDCBA".charAt(((result/3)/10)%10)+"";
	}

	

}
