package kosa.oop;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member();// 객체생성 => 인스턴스화 : m1 => 인스턴스 변수
		m1.show();
		Member m2 = new Member("01","노승우",27);
		m2.show();
		Member m3= new Member("03","나다", 27, 80, 80, 80);
		System.out.println(m3.result());
		
	}

}
