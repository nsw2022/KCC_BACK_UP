package kosa.oop;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member();// ��ü���� => �ν��Ͻ�ȭ : m1 => �ν��Ͻ� ����
		m1.show();
		Member m2 = new Member("01","��¿�",27);
		m2.show();
		Member m3= new Member("03","����", 27, 80, 80, 80);
		System.out.println(m3.result());
		
	}

}
