package kosa.oop6;

interface A{
	void abc();
}

class B{
	void bcd() {
		System.out.println("�޼��� ȣ��");
	}
}

public class Main2 {
	
	public static void main(String[] args) {
		//1.�͸�Ŭ������ �̿��ؼ� abc() �������̵�-> B�� �����ؼ� bcd()�� ȣ�����ֱ�
		A a = new A() {
			
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};
		a.abc();
		
		//2. �ش� ������ �����ϰ� ���ٽ����� ����
		A a2 = ()->{
			B b = new B();
			b.bcd();
		};
		a2.abc();
		
		//3. �ν��Ͻ� ���� ����
		B b = new B();
		A a3 = b::bcd;
		a3.abc();
		
		
		
	}

}
